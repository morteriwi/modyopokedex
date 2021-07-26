package modyo.pokedex.service.adapter.pokemon.ability.entity;

import java.util.List;

import modyo.pokedex.service.adapter.pokemon.common.entity.Name;
import modyo.pokedex.service.adapter.pokemon.common.entity.NamedAPIResource;

public class PokemonAbilitieAPIResponse {
	private Integer id;
	private String name;
	private boolean is_main_series;
	private NamedAPIResource generation;
	private List<Name>	names;
	private List<VerboseEffect> effect_entries;
	private List<AbilityEffectChange> effect_changes;
	private List<AbilityFlavorText> flavor_text_entries;
	private List<AbilityPokemon> pokemon;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isIs_main_series() {
		return is_main_series;
	}
	public void setIs_main_series(boolean is_main_series) {
		this.is_main_series = is_main_series;
	}
	public NamedAPIResource getGeneration() {
		return generation;
	}
	public void setGeneration(NamedAPIResource generation) {
		this.generation = generation;
	}
	public List<Name> getNames() {
		return names;
	}
	public void setNames(List<Name> names) {
		this.names = names;
	}
	public List<VerboseEffect> getEffect_entries() {
		return effect_entries;
	}
	public void setEffect_entries(List<VerboseEffect> effect_entries) {
		this.effect_entries = effect_entries;
	}
	public List<AbilityEffectChange> getEffect_changes() {
		return effect_changes;
	}
	public void setEffect_changes(List<AbilityEffectChange> effect_changes) {
		this.effect_changes = effect_changes;
	}
	public List<AbilityFlavorText> getFlavor_text_entries() {
		return flavor_text_entries;
	}
	public void setFlavor_text_entries(List<AbilityFlavorText> flavor_text_entries) {
		this.flavor_text_entries = flavor_text_entries;
	}
	public List<AbilityPokemon> getPokemon() {
		return pokemon;
	}
	public void setPokemon(List<AbilityPokemon> pokemon) {
		this.pokemon = pokemon;
	}
}
