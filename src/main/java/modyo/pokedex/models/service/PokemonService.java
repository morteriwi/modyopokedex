package modyo.pokedex.models.service;

import java.util.List;

import modyo.pokedex.models.entity.PokemonBasicInformation;
import modyo.pokedex.models.entity.PokemonDetailInformation;

public interface PokemonService {
	public List<PokemonBasicInformation> getPokemons(Integer offset, Integer limit, String baseUrl);
	public PokemonDetailInformation getPokemonById(Integer id, String baseUrl);
}
