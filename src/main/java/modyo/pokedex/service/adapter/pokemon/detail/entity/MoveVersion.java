package modyo.pokedex.service.adapter.pokemon.detail.entity;

import modyo.pokedex.service.adapter.pokemon.common.entity.NamedAPIResource;

public class MoveVersion {
	private NamedAPIResource move_learn_method;
	private NamedAPIResource version_group;
	private Integer level_learned_at;
	
	public Integer getLevel_learned_at() {
		return level_learned_at;
	}
	public void setLevel_learned_at(Integer level_learned_at) {
		this.level_learned_at = level_learned_at;
	}
	public NamedAPIResource getMove_learn_method() {
		return move_learn_method;
	}
	public void setMove_learn_method(NamedAPIResource move_learn_method) {
		this.move_learn_method = move_learn_method;
	}
	public NamedAPIResource getVersion_group() {
		return version_group;
	}
	public void setVersion_group(NamedAPIResource version_group) {
		this.version_group = version_group;
	}
}
