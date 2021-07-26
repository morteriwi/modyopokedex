package modyo.pokedex.service.adapter.pokemon.detail.entity;

import java.util.List;

import modyo.pokedex.service.adapter.pokemon.common.entity.NamedAPIResource;

public class PokemonDetailAPIResponse {
	private Integer id;
	private String name;
	private Integer base_expirience;
	private Integer height;
	private boolean is_default;
	private Integer order;
	private Integer weight;
	private List<Ability> abilities;
	private List<NamedAPIResource> forms;
	private List<GameIndex> game_indices;
	private String location_area_encounters;
	private List<Move> moves;
	private Sprites sprites;
	private NamedAPIResource species;
	private List<Stat> stats;
	private List<PokemonType> types;
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
	public Integer getBase_expirience() {
		return base_expirience;
	}
	public void setBase_expirience(Integer base_expirience) {
		this.base_expirience = base_expirience;
	}
	public Integer getHeight() {
		return height;
	}
	public void setHeight(Integer height) {
		this.height = height;
	}
	public boolean isIs_default() {
		return is_default;
	}
	public void setIs_default(boolean is_default) {
		this.is_default = is_default;
	}
	public Integer getOrder() {
		return order;
	}
	public void setOrder(Integer order) {
		this.order = order;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	public List<Ability> getAbilities() {
		return abilities;
	}
	public void setAbilities(List<Ability> abilities) {
		this.abilities = abilities;
	}
	public List<NamedAPIResource> getForms() {
		return forms;
	}
	public void setForms(List<NamedAPIResource> forms) {
		this.forms = forms;
	}
	public List<GameIndex> getGame_indices() {
		return game_indices;
	}
	public void setGame_indices(List<GameIndex> game_indices) {
		this.game_indices = game_indices;
	}
	public String getLocation_area_encounters() {
		return location_area_encounters;
	}
	public void setLocation_area_encounters(String location_area_encounters) {
		this.location_area_encounters = location_area_encounters;
	}
	public List<Move> getMoves() {
		return moves;
	}
	public void setMoves(List<Move> moves) {
		this.moves = moves;
	}
	public Sprites getSprites() {
		return sprites;
	}
	public void setSprites(Sprites sprites) {
		this.sprites = sprites;
	}
	public NamedAPIResource getSpecies() {
		return species;
	}
	public void setSpecies(NamedAPIResource species) {
		this.species = species;
	}
	public List<Stat> getStats() {
		return stats;
	}
	public void setStats(List<Stat> stats) {
		this.stats = stats;
	}
	public List<PokemonType> getTypes() {
		return types;
	}
	public void setTypes(List<PokemonType> types) {
		this.types = types;
	}
}
