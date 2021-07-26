package modyo.pokedex.models.entity;

import java.util.List;

public class PokemonDetailInformation {
	private PokemonBasicInformation basicInformation;
	private String Description;
	private List<Evolutions> evolutions;
	
	public PokemonBasicInformation getBasicInformation() {
		return basicInformation;
	}
	public void setBasicInformation(PokemonBasicInformation basicInformation) {
		this.basicInformation = basicInformation;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public List<Evolutions> getEvolutions() {
		return evolutions;
	}
	public void setEvolutions(List<Evolutions> evolutions) {
		this.evolutions = evolutions;
	}
}
