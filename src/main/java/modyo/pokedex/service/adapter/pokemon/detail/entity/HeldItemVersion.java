package modyo.pokedex.service.adapter.pokemon.detail.entity;

import modyo.pokedex.service.adapter.pokemon.common.entity.NamedAPIResource;

public class HeldItemVersion {
	private NamedAPIResource version;
	private Integer rarity;
	public NamedAPIResource getVersion() {
		return version;
	}
	public void setVersion(NamedAPIResource version) {
		this.version = version;
	}
	public Integer getRarity() {
		return rarity;
	}
	public void setRarity(Integer rarity) {
		this.rarity = rarity;
	}
}
