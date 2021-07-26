package modyo.pokedex.service.adapter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import feign.FeignException;
import modyo.pokedex.models.entity.Evolutions;
import modyo.pokedex.models.entity.PokemonAbility;
import modyo.pokedex.models.entity.PokemonBasicInformation;
import modyo.pokedex.models.entity.PokemonDetailInformation;
import modyo.pokedex.models.entity.Type;
import modyo.pokedex.rest.clients.PokeAPIRestClient;
import modyo.pokedex.service.adapter.pokemon.ability.entity.PokemonAbilitieAPIResponse;
import modyo.pokedex.service.adapter.pokemon.common.entity.NamedAPIResource;
import modyo.pokedex.service.adapter.pokemon.detail.entity.Ability;
import modyo.pokedex.service.adapter.pokemon.detail.entity.PokemonDetailAPIResponse;
import modyo.pokedex.service.adapter.pokemon.detail.entity.PokemonType;
import modyo.pokedex.service.adapter.pokemon.evolutions.entity.ChainLink;
import modyo.pokedex.service.adapter.pokemon.evolutions.entity.EvolutionChainAPIResponse;
import modyo.pokedex.service.adapter.pokemon.list.entity.PokemonListAPIResponse;
import modyo.pokedex.service.adapter.pokemon.species.entity.PokemonSpecieAPIResponse;
import modyo.pokedex.service.adapter.pokemon.types.entity.PokemonTypeAPIResponse;
import modyo.pokedex.utils.GetIdUtil;

@Service
@CacheConfig(cacheNames={"Pokemons"})
public class PokemonAdapterServiceImpl implements PokemonAdapterService {
	
	@Autowired PokeAPIRestClient client;

	@Override
	@Cacheable
	public List<PokemonBasicInformation> getPokemons(Integer offset, Integer limit, String baseUrl) {
		ArrayList<PokemonBasicInformation> PokemonsList = new ArrayList<PokemonBasicInformation>();
		try {
			PokemonListAPIResponse PokemonList = client.getPokemons(offset, limit);
			if(!PokemonList.getResults().isEmpty()) {
				
				for(NamedAPIResource Pokemon: PokemonList.getResults()) {
					PokemonsList.add(getPokemonBasicInformation(GetIdUtil.getIdFromUrl(Pokemon.getUrl()), baseUrl));
				}
				return PokemonsList;
			}
			else {
				throw new ResponseStatusException(
						  HttpStatus.NOT_FOUND, "Pokemons not found"
						);
			}
		}
		catch(FeignException e) {
			HttpStatus status = HttpStatus.resolve(e.status());
			throw new ResponseStatusException(status, e.getLocalizedMessage());
		}
		
	}

	@Override
	@Cacheable
	public PokemonBasicInformation getPokemonBasicInformation(Integer id, String baseUrl) {
		PokemonBasicInformation PokemonInfo = new PokemonBasicInformation();
		try {
			PokemonDetailAPIResponse PokemonDetail = client.getPokemonById(id);
			
			if(PokemonDetail != null) {
				PokemonInfo.setId(PokemonDetail.getId());
				PokemonInfo.setUrl(baseUrl+"/"+PokemonDetail.getId());
				PokemonInfo.setName(PokemonDetail.getName());
				PokemonInfo.setWeight(PokemonDetail.getWeight());
				PokemonInfo.setPhoto(PokemonDetail.getSprites().getFront_default());
				if(!PokemonDetail.getAbilities().isEmpty()) {
					ArrayList<PokemonAbility> AbilitiesList = new ArrayList<PokemonAbility>();
					for(Ability ability: PokemonDetail.getAbilities()) {
						AbilitiesList.add(getAbilityInfo(ability.getAbility()));
					}
					PokemonInfo.setAbilities(AbilitiesList);
				}
				if(!PokemonDetail.getTypes().isEmpty()) {
					ArrayList<Type> TypesList = new ArrayList<Type>();
					for(PokemonType type: PokemonDetail.getTypes()) {
						TypesList.add(getTypeInfo(type.getType()));
					}
					PokemonInfo.setTypes(TypesList);
				}
				return PokemonInfo;
			}
			else {
				throw new ResponseStatusException(
						  HttpStatus.NOT_FOUND, "Pokemon not found"
						);
			}
		}
		catch(FeignException e) {
			HttpStatus status = HttpStatus.resolve(e.status());
			throw new ResponseStatusException(status, e.getLocalizedMessage());
		}
		
	}

	@Override
	@Cacheable
	public PokemonAbility getAbilityInfo(NamedAPIResource Ability) {
		PokemonAbility AbilityDetail = new PokemonAbility();
		try {
			PokemonAbilitieAPIResponse AbilityInfo = client.getAbilityById(GetIdUtil.getIdFromUrl(Ability.getUrl()));
			if(AbilityInfo != null) {
				AbilityDetail.setId(AbilityInfo.getId());
				AbilityDetail.setName(AbilityInfo.getName());
				return AbilityDetail;
			}
			else {
				return AbilityDetail;
			}
		}
		catch(FeignException e) {
			HttpStatus status = HttpStatus.resolve(e.status());
			throw new ResponseStatusException(status, e.getLocalizedMessage());
		}
	}

	@Override
	@Cacheable
	public Type getTypeInfo(NamedAPIResource Type) {
		Type TypeDetail = new Type();
		try {
			PokemonTypeAPIResponse TypeInfo = client.getTypeById(GetIdUtil.getIdFromUrl(Type.getUrl()));
			if(TypeInfo != null) {
				
				TypeDetail.setId(TypeInfo.getId());
				TypeDetail.setName(TypeInfo.getName());
				return TypeDetail;
			}
			else {
				return TypeDetail;
			}
		}
		catch(FeignException e) {
			HttpStatus status = HttpStatus.resolve(e.status());
			throw new ResponseStatusException(status, e.getLocalizedMessage());
		}
	}

	@Override
	@Cacheable
	public PokemonDetailInformation getPokemonDetailInformationById(Integer id, String baseUrl) {
		PokemonDetailInformation PokemonDetailInfo = new PokemonDetailInformation();
		try {
			PokemonDetailAPIResponse PokemonDetail = client.getPokemonById(id);
			if(PokemonDetail != null) {
				PokemonBasicInformation PokemonBasicInfo = new PokemonBasicInformation();
				PokemonBasicInfo.setId(PokemonDetail.getId());
				PokemonBasicInfo.setUrl(baseUrl);
				PokemonBasicInfo.setName(PokemonDetail.getName());
				PokemonBasicInfo.setWeight(PokemonDetail.getWeight());
				PokemonBasicInfo.setPhoto(PokemonDetail.getSprites().getFront_default());
				if(!PokemonDetail.getAbilities().isEmpty()) {
					ArrayList<PokemonAbility> AbilitiesList = new ArrayList<PokemonAbility>();
					for(Ability ability: PokemonDetail.getAbilities()) {
						AbilitiesList.add(getAbilityInfo(ability.getAbility()));
					}
					PokemonBasicInfo.setAbilities(AbilitiesList);
				}
				if(!PokemonDetail.getTypes().isEmpty()) {
					ArrayList<Type> TypesList = new ArrayList<Type>();
					for(PokemonType type: PokemonDetail.getTypes()) {
						TypesList.add(getTypeInfo(type.getType()));
					}
					PokemonBasicInfo.setTypes(TypesList);
				}
				PokemonDetailInfo.setBasicInformation(PokemonBasicInfo);
				try {
					PokemonSpecieAPIResponse SpecieInfo = client.getSpecieInfoById(GetIdUtil.getIdFromUrl(PokemonDetail.getSpecies().getUrl()));
					if(SpecieInfo != null) {
						if(!SpecieInfo.getFlavor_text_entries().isEmpty()) {
							PokemonDetailInfo.setDescription(SpecieInfo.getFlavor_text_entries().get(0).getFlavor_text());
							if(SpecieInfo.getEvolution_chain() != null) {
								PokemonDetailInfo.setEvolutions(getEvolutionsByChain(GetIdUtil.getIdFromUrl(SpecieInfo.getEvolution_chain().getUrl())));
							}
						}		
					}
				}
				catch(FeignException e) {
					HttpStatus status = HttpStatus.resolve(e.status());
					throw new ResponseStatusException(status, e.getLocalizedMessage());
				}
				return PokemonDetailInfo;
			}
			else {
				throw new ResponseStatusException(
						  HttpStatus.NOT_FOUND, "Pokemon not found"
						);
			}
		}
		catch(FeignException e) {
			HttpStatus status = HttpStatus.resolve(e.status());
			throw new ResponseStatusException(status, e.getLocalizedMessage());
		}		
	}

	@Override
	@Cacheable
	public List<Evolutions> getEvolutionsByChain(Integer id) {
		EvolutionChainAPIResponse EvolutionChain = client.getEvolutionChainInfoById(id);
		ArrayList<Evolutions> Evolutions = new ArrayList<Evolutions>();
		ChainLink Chain = EvolutionChain.getChain();
		do {
			Evolutions evolution = new Evolutions();
			evolution.setName(Chain.getSpecies().getName());
			Evolutions.add(evolution);
			Chain = Chain.getEvolves_to().get(0);
		}
		while(Chain != null && !Chain.getEvolves_to().isEmpty());
		if(Chain != null) {
			Evolutions evolution = new Evolutions();
			evolution.setName(Chain.getSpecies().getName());
			Evolutions.add(evolution);
		}
		return Evolutions;
	}
}
