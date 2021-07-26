package modyo.pokedex.service.adapter.pokemon.species.entity;

import modyo.pokedex.service.adapter.pokemon.common.entity.NamedAPIResource;

public class PokemonSpeciesDexEntry {
	private Integer entry_number;
	private NamedAPIResource pokedex;
	public Integer getEntry_number() {
		return entry_number;
	}
	public void setEntry_number(Integer entry_number) {
		this.entry_number = entry_number;
	}
	public NamedAPIResource getPokedex() {
		return pokedex;
	}
	public void setPokedex(NamedAPIResource pokedex) {
		this.pokedex = pokedex;
	}
}
