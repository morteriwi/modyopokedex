package modyo.pokedex.service.adapter.pokemon.detail.entity;

import modyo.pokedex.service.adapter.pokemon.common.entity.NamedAPIResource;

public class GameIndex {
	private Integer game_index;
	private NamedAPIResource version;
	public Integer getGame_index() {
		return game_index;
	}
	public void setGame_index(Integer game_index) {
		this.game_index = game_index;
	}
	public NamedAPIResource getVersion() {
		return version;
	}
	public void setVersion(NamedAPIResource version) {
		this.version = version;
	}
	
}
