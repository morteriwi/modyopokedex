package modyo.pokedex.service.adapter.pokemon.detail.entity;

import java.util.List;

import modyo.pokedex.service.adapter.pokemon.common.entity.NamedAPIResource;

public class Move {
	private NamedAPIResource move;
	private List<MoveVersion> version_group_details;
	public NamedAPIResource getMove() {
		return move;
	}
	public void setMove(NamedAPIResource move) {
		this.move = move;
	}
	public List<MoveVersion> getVersion_group_details() {
		return version_group_details;
	}
	public void setVersion_group_details(List<MoveVersion> version_group_details) {
		this.version_group_details = version_group_details;
	}
}
