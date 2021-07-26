package modyo.pokedex.models.entity;

import java.util.List;



public class PokemonBasicInformation {
	private Integer id;
	private String name;
	private String url;
	private String photo;
	private List<Type> types;
	private Integer weight;
	private List<PokemonAbility> abilities;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public List<Type> getTypes() {
		return types;
	}
	public void setTypes(List<Type> types) {
		this.types = types;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	public List<PokemonAbility> getAbilities() {
		return abilities;
	}
	public void setAbilities(List<PokemonAbility> abilities) {
		this.abilities = abilities;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
}
