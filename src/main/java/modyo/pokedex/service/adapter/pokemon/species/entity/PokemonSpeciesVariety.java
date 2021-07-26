package modyo.pokedex.service.adapter.pokemon.species.entity;

import modyo.pokedex.service.adapter.pokemon.common.entity.NamedAPIResource;

public class PokemonSpeciesVariety {
	private boolean is_default;
	private NamedAPIResource pokemon;
	public boolean isIs_default() {
		return is_default;
	}
	public void setIs_default(boolean is_default) {
		this.is_default = is_default;
	}
	public NamedAPIResource getPokemon() {
		return pokemon;
	}
	public void setPokemon(NamedAPIResource pokemon) {
		this.pokemon = pokemon;
	}
}
