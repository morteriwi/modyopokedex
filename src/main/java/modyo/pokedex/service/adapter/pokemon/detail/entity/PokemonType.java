package modyo.pokedex.service.adapter.pokemon.detail.entity;

import modyo.pokedex.service.adapter.pokemon.common.entity.NamedAPIResource;

public class PokemonType {
	private Integer slot;
	private NamedAPIResource type;
	public Integer getSlot() {
		return slot;
	}
	public void setSlot(Integer slot) {
		this.slot = slot;
	}
	public NamedAPIResource getType() {
		return type;
	}
	public void setType(NamedAPIResource type) {
		this.type = type;
	}
}
