package modyo.pokedex.service.adapter.pokemon.common.entity;

import java.io.Serializable;

public class NamedAPIResource implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3063855385377396736L;

	
	private String name;
	private String url;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
}
