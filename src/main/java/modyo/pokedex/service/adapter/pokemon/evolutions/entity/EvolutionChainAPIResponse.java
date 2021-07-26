package modyo.pokedex.service.adapter.pokemon.evolutions.entity;

import modyo.pokedex.service.adapter.pokemon.common.entity.NamedAPIResource;

public class EvolutionChainAPIResponse {
	private Integer id;
	private NamedAPIResource baby_trigger_item;
	private ChainLink chain;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public NamedAPIResource getBaby_trigger_item() {
		return baby_trigger_item;
	}
	public void setBaby_trigger_item(NamedAPIResource baby_trigger_item) {
		this.baby_trigger_item = baby_trigger_item;
	}
	public ChainLink getChain() {
		return chain;
	}
	public void setChain(ChainLink chain) {
		this.chain = chain;
	}
}
