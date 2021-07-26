package modyo.pokedex.service.adapter.pokemon.species.entity;

import modyo.pokedex.service.adapter.pokemon.common.entity.NamedAPIResource;

public class PalParkEncounterArea {
	private Integer base_score;
	private Integer rate;
	private NamedAPIResource area;
	public Integer getBase_score() {
		return base_score;
	}
	public void setBase_score(Integer base_score) {
		this.base_score = base_score;
	}
	public Integer getRate() {
		return rate;
	}
	public void setRate(Integer rate) {
		this.rate = rate;
	}
	public NamedAPIResource getArea() {
		return area;
	}
	public void setArea(NamedAPIResource area) {
		this.area = area;
	}
}
