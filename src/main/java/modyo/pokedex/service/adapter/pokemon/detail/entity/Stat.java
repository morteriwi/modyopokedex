package modyo.pokedex.service.adapter.pokemon.detail.entity;

import modyo.pokedex.service.adapter.pokemon.common.entity.NamedAPIResource;

public class Stat {
	private NamedAPIResource stat;
	private Integer effort;
	private Integer base_stat;
	public NamedAPIResource getStat() {
		return stat;
	}
	public void setStat(NamedAPIResource stat) {
		this.stat = stat;
	}
	public Integer getEffort() {
		return effort;
	}
	public void setEffort(Integer effort) {
		this.effort = effort;
	}
	public Integer getBase_stat() {
		return base_stat;
	}
	public void setBase_stat(Integer base_stat) {
		this.base_stat = base_stat;
	}
}
