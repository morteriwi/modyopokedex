package modyo.pokedex.service.adapter.pokemon.types.entity;

import java.util.List;

import modyo.pokedex.service.adapter.pokemon.common.entity.NamedAPIResource;
import modyo.pokedex.service.adapter.pokemon.common.entity.Name;

public class PokemonTypeAPIResponse {
	private Integer id;
	private String Name;
	private TypeRelations damage_relations;
	private List<GenerationGameIndex> game_indices;
	private NamedAPIResource generation;
	private NamedAPIResource move_damage_class;
	private List<Name> names;
	private List<TypePokemon> pokemon;
	private List<NamedAPIResource> moves;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public TypeRelations getDamage_relations() {
		return damage_relations;
	}
	public void setDamage_relations(TypeRelations damage_relations) {
		this.damage_relations = damage_relations;
	}
	public List<GenerationGameIndex> getGame_indices() {
		return game_indices;
	}
	public void setGame_indices(List<GenerationGameIndex> game_indices) {
		this.game_indices = game_indices;
	}
	public NamedAPIResource getGeneration() {
		return generation;
	}
	public void setGeneration(NamedAPIResource generation) {
		this.generation = generation;
	}
	public NamedAPIResource getMove_damage_class() {
		return move_damage_class;
	}
	public void setMove_damage_class(NamedAPIResource move_damage_class) {
		this.move_damage_class = move_damage_class;
	}
	public List<Name> getNames() {
		return names;
	}
	public void setNames(List<Name> names) {
		this.names = names;
	}
	public List<TypePokemon> getPokemon() {
		return pokemon;
	}
	public void setPokemon(List<TypePokemon> pokemon) {
		this.pokemon = pokemon;
	}
	public List<NamedAPIResource> getMoves() {
		return moves;
	}
	public void setMoves(List<NamedAPIResource> moves) {
		this.moves = moves;
	}
	
}
