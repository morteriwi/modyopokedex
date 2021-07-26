package modyo.pokedex.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import modyo.pokedex.models.entity.PokemonBasicInformation;
import modyo.pokedex.models.entity.PokemonDetailInformation;
import modyo.pokedex.models.service.PokemonService;

@RestController
@RequestMapping("/api/pokemon")
public class PokemonController {

	@Autowired
	PokemonService pokemonservice;
	@GetMapping("")
	public @ResponseBody List<PokemonBasicInformation> getPokemons(@RequestParam(name="offset", required=false) Integer offset, @RequestParam(name="limit", required=false) Integer limit, HttpServletRequest request) {		
		 String baseUrl = ServletUriComponentsBuilder.fromRequestUri(request)
		            .build()
		            .toUriString();
		return pokemonservice.getPokemons(offset, limit, baseUrl);
	}
	@GetMapping("/{id}")
	public @ResponseBody PokemonDetailInformation getPokemonById(@PathVariable Integer id, HttpServletRequest request){
		 String baseUrl = ServletUriComponentsBuilder.fromRequestUri(request)
		            .build()
		            .toUriString();
		return pokemonservice.getPokemonById(id, baseUrl);
	}
}
