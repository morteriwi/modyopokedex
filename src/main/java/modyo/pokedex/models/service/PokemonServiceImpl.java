package modyo.pokedex.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import modyo.pokedex.models.entity.PokemonBasicInformation;
import modyo.pokedex.models.entity.PokemonDetailInformation;
import modyo.pokedex.service.adapter.PokemonAdapterService;

@Service
public class PokemonServiceImpl implements PokemonService {

	@Autowired 
	private PokemonAdapterService pokemonAdapter;
	
	@Override
	public List<PokemonBasicInformation> getPokemons(Integer offset, Integer limit, String baseUrl) {
		return pokemonAdapter.getPokemons(offset, limit, baseUrl);
	}

	@Override
	public PokemonDetailInformation getPokemonById(Integer id, String baseUrl) {
		// TODO Auto-generated method stub
		return pokemonAdapter.getPokemonDetailInformationById(id, baseUrl);
	}

}
