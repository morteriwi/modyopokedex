package modyo.pokedex.service.adapter.pokemon.list.entity;

import java.util.List;

import modyo.pokedex.service.adapter.pokemon.common.entity.NamedAPIResource;

public class PokemonListAPIResponse {
	private Integer count;
	private String next;
	private String previus;
	private List<NamedAPIResource> results;
	
	public Integer getCount() {
		return count;
	}
	public void setCount(Integer count) {
		this.count = count;
	}
	public String getNext() {
		return next;
	}
	public void setNext(String next) {
		this.next = next;
	}
	public String getPrevius() {
		return previus;
	}
	public void setPrevius(String previus) {
		this.previus = previus;
	}
	public List<NamedAPIResource> getResults() {
		return results;
	}
	public void setResults(List<NamedAPIResource> results) {
		this.results = results;
	}

}
