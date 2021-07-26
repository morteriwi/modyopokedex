package modyo.pokedex.service.adapter.pokemon.species.entity;

import modyo.pokedex.service.adapter.pokemon.common.entity.NamedAPIResource;

public class Genus {
	private String genus;
	private NamedAPIResource language;
	public String getGenus() {
		return genus;
	}
	public void setGenus(String genus) {
		this.genus = genus;
	}
	public NamedAPIResource getLanguage() {
		return language;
	}
	public void setLanguage(NamedAPIResource language) {
		this.language = language;
	}
}
