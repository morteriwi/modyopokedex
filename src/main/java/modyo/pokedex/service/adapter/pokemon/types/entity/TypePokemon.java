package modyo.pokedex.service.adapter.pokemon.types.entity;

import modyo.pokedex.service.adapter.pokemon.common.entity.NamedAPIResource;

public class TypePokemon {
	private Integer slot;
	private NamedAPIResource pokemon;
	public Integer getSlot() {
		return slot;
	}
	public void setSlot(Integer slot) {
		this.slot = slot;
	}
	public NamedAPIResource getPokemon() {
		return pokemon;
	}
	public void setPokemon(NamedAPIResource pokemon) {
		this.pokemon = pokemon;
	}
}
