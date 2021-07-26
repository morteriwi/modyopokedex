package modyo.pokedex.service.adapter.pokemon.ability.entity;

import modyo.pokedex.service.adapter.pokemon.common.entity.NamedAPIResource;

public class AbilityFlavorText {
	private String flavor_text;
	private NamedAPIResource language;
	private NamedAPIResource version_group;
	public String getFlavor_text() {
		return flavor_text;
	}
	public void setFlavor_text(String flavor_text) {
		this.flavor_text = flavor_text;
	}
	public NamedAPIResource getLanguage() {
		return language;
	}
	public void setLanguage(NamedAPIResource language) {
		this.language = language;
	}
	public NamedAPIResource getVersion_group() {
		return version_group;
	}
	public void setVersion_group(NamedAPIResource version_group) {
		this.version_group = version_group;
	}
}
