package modyo.pokedex.service.adapter.pokemon.ability.entity;

import modyo.pokedex.service.adapter.pokemon.common.entity.NamedAPIResource;

public class VerboseEffect {
	private String effect;
	private String short_effect;
	private NamedAPIResource language;
	public String getEffect() {
		return effect;
	}
	public void setEffect(String effect) {
		this.effect = effect;
	}
	public String getShort_effect() {
		return short_effect;
	}
	public void setShort_effect(String short_effect) {
		this.short_effect = short_effect;
	}
	public NamedAPIResource getLanguage() {
		return language;
	}
	public void setLanguage(NamedAPIResource language) {
		this.language = language;
	}
}
