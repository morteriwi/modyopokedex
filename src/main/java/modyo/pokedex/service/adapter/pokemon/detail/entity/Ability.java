package modyo.pokedex.service.adapter.pokemon.detail.entity;

import modyo.pokedex.service.adapter.pokemon.common.entity.NamedAPIResource;

public class Ability {
	private boolean is_hidden;
	private Integer slot;
	private NamedAPIResource ability;
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
	public NamedAPIResource getAbility() {
		return ability;
	}
	public void setAbility(NamedAPIResource ability) {
		this.ability = ability;
	}
}
