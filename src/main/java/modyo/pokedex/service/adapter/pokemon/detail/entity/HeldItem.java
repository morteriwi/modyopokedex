package modyo.pokedex.service.adapter.pokemon.detail.entity;

import java.util.List;

import modyo.pokedex.service.adapter.pokemon.common.entity.NamedAPIResource;

public class HeldItem {
	private NamedAPIResource item;
	private List<HeldItemVersion> version_details;
	public NamedAPIResource getItem() {
		return item;
	}
	public void setItem(NamedAPIResource item) {
		this.item = item;
	}
	public List<HeldItemVersion> getVersion_details() {
		return version_details;
	}
	public void setVersion_details(List<HeldItemVersion> version_details) {
		this.version_details = version_details;
	}
}
