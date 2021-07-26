package modyo.pokedex.rest.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import modyo.pokedex.service.adapter.pokemon.ability.entity.PokemonAbilitieAPIResponse;
import modyo.pokedex.service.adapter.pokemon.detail.entity.PokemonDetailAPIResponse;
import modyo.pokedex.service.adapter.pokemon.evolutions.entity.EvolutionChainAPIResponse;
import modyo.pokedex.service.adapter.pokemon.list.entity.PokemonListAPIResponse;
import modyo.pokedex.service.adapter.pokemon.species.entity.PokemonSpecieAPIResponse;
import modyo.pokedex.service.adapter.pokemon.types.entity.PokemonTypeAPIResponse;

@FeignClient(name = "pokeapi", url = "https://pokeapi.co/api/v2")
public interface PokeAPIRestClient {

	@GetMapping("/pokemon")
	public PokemonListAPIResponse getPokemons(@RequestParam(name="offset", required=false) Integer offset, @RequestParam(name="limit", required=false) Integer limit);
	
	@GetMapping("/pokemon/{id}")
	public PokemonDetailAPIResponse getPokemonById(@PathVariable Integer id);
	
	@GetMapping("/ability/{id}")
	public PokemonAbilitieAPIResponse getAbilityById(@PathVariable Integer id);
	
	@GetMapping("/type/{id}")
	public PokemonTypeAPIResponse getTypeById(@PathVariable Integer id);
	
	@GetMapping("/pokemon-species/{id}")
	public PokemonSpecieAPIResponse getSpecieInfoById(@PathVariable Integer id);
	
	@GetMapping("/evolution-chain/{id}")
	public EvolutionChainAPIResponse getEvolutionChainInfoById(@PathVariable Integer id);	
}
