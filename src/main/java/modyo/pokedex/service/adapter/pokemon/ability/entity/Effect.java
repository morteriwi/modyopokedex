package modyo.pokedex.service.adapter.pokemon.ability.entity;

import modyo.pokedex.service.adapter.pokemon.common.entity.NamedAPIResource;

public class Effect {
	private String effect;
	private NamedAPIResource language;
	public String getEffect() {
		return effect;
	}
	public void setEffect(String effect) {
		this.effect = effect;
	}
	public NamedAPIResource getLanguage() {
		return language;
	}
	public void setLanguage(NamedAPIResource language) {
		this.language = language;
	}
}
