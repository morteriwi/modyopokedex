package modyo.pokedex.service.adapter.pokemon.types.entity;

import modyo.pokedex.service.adapter.pokemon.common.entity.NamedAPIResource;

public class GenerationGameIndex {
	private Integer game_index;
	private NamedAPIResource generation;
	
	public Integer getGame_index() {
		return game_index;
	}
	public void setGame_index(Integer game_index) {
		this.game_index = game_index;
	}
	public NamedAPIResource getGeneration() {
		return generation;
	}
	public void setGeneration(NamedAPIResource generation) {
		this.generation = generation;
	}
}
