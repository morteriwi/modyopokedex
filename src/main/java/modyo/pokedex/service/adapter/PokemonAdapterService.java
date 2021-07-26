package modyo.pokedex.service.adapter;

import java.util.List;

import modyo.pokedex.models.entity.Evolutions;
import modyo.pokedex.models.entity.PokemonAbility;
import modyo.pokedex.models.entity.PokemonBasicInformation;
import modyo.pokedex.models.entity.PokemonDetailInformation;
import modyo.pokedex.models.entity.Type;
import modyo.pokedex.service.adapter.pokemon.common.entity.NamedAPIResource;

public interface PokemonAdapterService {
	public List<PokemonBasicInformation> getPokemons(Integer offset, Integer limit, String baseUrl);
	public PokemonBasicInformation getPokemonBasicInformation(Integer id, String baseUrl);
	public PokemonAbility getAbilityInfo(NamedAPIResource Ability);
	public Type getTypeInfo(NamedAPIResource Type);
	public PokemonDetailInformation getPokemonDetailInformationById(Integer id, String baseUrl);
	public List<Evolutions> getEvolutionsByChain(Integer id);
}
