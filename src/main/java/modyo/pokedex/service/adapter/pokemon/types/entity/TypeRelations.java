package modyo.pokedex.service.adapter.pokemon.types.entity;

import java.util.List;

import modyo.pokedex.service.adapter.pokemon.common.entity.NamedAPIResource;

public class TypeRelations {
	private List<NamedAPIResource> no_damage_to;
	private List<NamedAPIResource> half_damage_to;
	private List<NamedAPIResource> double_damage_to;
	private List<NamedAPIResource> no_damage_from;
	private List<NamedAPIResource> half_damage_from;
	private List<NamedAPIResource> double_damage_from;
	public List<NamedAPIResource> getNo_damage_to() {
		return no_damage_to;
	}
	public void setNo_damage_to(List<NamedAPIResource> no_damage_to) {
		this.no_damage_to = no_damage_to;
	}
	public List<NamedAPIResource> getHalf_damage_to() {
		return half_damage_to;
	}
	public void setHalf_damage_to(List<NamedAPIResource> half_damage_to) {
		this.half_damage_to = half_damage_to;
	}
	public List<NamedAPIResource> getDouble_damage_to() {
		return double_damage_to;
	}
	public void setDouble_damage_to(List<NamedAPIResource> double_damage_to) {
		this.double_damage_to = double_damage_to;
	}
	public List<NamedAPIResource> getNo_damage_from() {
		return no_damage_from;
	}
	public void setNo_damage_from(List<NamedAPIResource> no_damage_from) {
		this.no_damage_from = no_damage_from;
	}
	public List<NamedAPIResource> getHalf_damage_from() {
		return half_damage_from;
	}
	public void setHalf_damage_from(List<NamedAPIResource> half_damage_from) {
		this.half_damage_from = half_damage_from;
	}
	public List<NamedAPIResource> getDouble_damage_from() {
		return double_damage_from;
	}
	public void setDouble_damage_from(List<NamedAPIResource> double_damage_from) {
		this.double_damage_from = double_damage_from;
	}

}
