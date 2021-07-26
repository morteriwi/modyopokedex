package modyo.pokedex.service.adapter.pokemon.ability.entity;

import modyo.pokedex.service.adapter.pokemon.common.entity.NamedAPIResource;

public class AbilityPokemon {
	private boolean is_hidden;
	private Integer slot;
	private NamedAPIResource pokemon;
	public boolean isIs_hidden() {
		return is_hidden;
	}
	public void setIs_hidden(boolean is_hidden) {
		this.is_hidden = is_hidden;
	}
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
