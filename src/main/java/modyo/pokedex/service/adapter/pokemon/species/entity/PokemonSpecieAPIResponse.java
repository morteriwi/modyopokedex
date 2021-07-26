package modyo.pokedex.service.adapter.pokemon.species.entity;

import java.util.List;

import modyo.pokedex.service.adapter.pokemon.common.entity.APIResource;
import modyo.pokedex.service.adapter.pokemon.common.entity.Name;
import modyo.pokedex.service.adapter.pokemon.common.entity.NamedAPIResource;

public class PokemonSpecieAPIResponse {
	private Integer id;
	private String name;
	private Integer order;
	private Integer gender_rate;
	private Integer capture_rate;
	private Integer base_happiness;
	private boolean is_baby;
	private boolean is_legendary;
	private boolean is_mythical;
	private Integer hatch_counter;
	private boolean has_gender_differences;
	private NamedAPIResource growth_rate; 
	private List<PokemonSpeciesDexEntry> pokedex_numbers;
	private List<NamedAPIResource> egg_groups;
	private NamedAPIResource color;
	private NamedAPIResource shape;
	private NamedAPIResource evolves_from_species;
	private APIResource evolution_chain;
	private NamedAPIResource habitat;
	private NamedAPIResource generation;
	private List<Name> names;
	private List<PalParkEncounterArea> pal_park_encounters;
	private List<FlavorText> flavor_text_entries;
	private List<Description> form_descriptions;
	private List<Genus> genera;
	private List<PokemonSpeciesVariety> varieties;
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
	public Integer getOrder() {
		return order;
	}
	public void setOrder(Integer order) {
		this.order = order;
	}
	public Integer getGender_rate() {
		return gender_rate;
	}
	public void setGender_rate(Integer gender_rate) {
		this.gender_rate = gender_rate;
	}
	public Integer getCapture_rate() {
		return capture_rate;
	}
	public void setCapture_rate(Integer capture_rate) {
		this.capture_rate = capture_rate;
	}
	public Integer getBase_happiness() {
		return base_happiness;
	}
	public void setBase_happiness(Integer base_happiness) {
		this.base_happiness = base_happiness;
	}
	public boolean isIs_baby() {
		return is_baby;
	}
	public void setIs_baby(boolean is_baby) {
		this.is_baby = is_baby;
	}
	public boolean isIs_legendary() {
		return is_legendary;
	}
	public void setIs_legendary(boolean is_legendary) {
		this.is_legendary = is_legendary;
	}
	public boolean isIs_mythical() {
		return is_mythical;
	}
	public void setIs_mythical(boolean is_mythical) {
		this.is_mythical = is_mythical;
	}
	public Integer getHatch_counter() {
		return hatch_counter;
	}
	public void setHatch_counter(Integer hatch_counter) {
		this.hatch_counter = hatch_counter;
	}
	public boolean isHas_gender_differences() {
		return has_gender_differences;
	}
	public void setHas_gender_differences(boolean has_gender_differences) {
		this.has_gender_differences = has_gender_differences;
	}
	public NamedAPIResource getGrowth_rate() {
		return growth_rate;
	}
	public void setGrowth_rate(NamedAPIResource growth_rate) {
		this.growth_rate = growth_rate;
	}
	public List<PokemonSpeciesDexEntry> getPokedex_numbers() {
		return pokedex_numbers;
	}
	public void setPokedex_numbers(List<PokemonSpeciesDexEntry> pokedex_numbers) {
		this.pokedex_numbers = pokedex_numbers;
	}
	public List<NamedAPIResource> getEgg_groups() {
		return egg_groups;
	}
	public void setEgg_groups(List<NamedAPIResource> egg_groups) {
		this.egg_groups = egg_groups;
	}
	public NamedAPIResource getColor() {
		return color;
	}
	public void setColor(NamedAPIResource color) {
		this.color = color;
	}
	public NamedAPIResource getShape() {
		return shape;
	}
	public void setShape(NamedAPIResource shape) {
		this.shape = shape;
	}
	public NamedAPIResource getEvolves_from_species() {
		return evolves_from_species;
	}
	public void setEvolves_from_species(NamedAPIResource evolves_from_species) {
		this.evolves_from_species = evolves_from_species;
	}
	public APIResource getEvolution_chain() {
		return evolution_chain;
	}
	public void setEvolution_chain(APIResource evolution_chain) {
		this.evolution_chain = evolution_chain;
	}
	public NamedAPIResource getHabitat() {
		return habitat;
	}
	public void setHabitat(NamedAPIResource habitat) {
		this.habitat = habitat;
	}
	public NamedAPIResource getGeneration() {
		return generation;
	}
	public void setGeneration(NamedAPIResource generation) {
		this.generation = generation;
	}
	
	public List<PalParkEncounterArea> getPal_park_encounters() {
		return pal_park_encounters;
	}
	public void setPal_park_encounters(List<PalParkEncounterArea> pal_park_encounters) {
		this.pal_park_encounters = pal_park_encounters;
	}
	public List<FlavorText> getFlavor_text_entries() {
		return flavor_text_entries;
	}
	public void setFlavor_text_entries(List<FlavorText> flavor_text_entries) {
		this.flavor_text_entries = flavor_text_entries;
	}
	public List<Description> getForm_descriptions() {
		return form_descriptions;
	}
	public void setForm_descriptions(List<Description> form_descriptions) {
		this.form_descriptions = form_descriptions;
	}
	public List<Genus> getGenera() {
		return genera;
	}
	public void setGenera(List<Genus> genera) {
		this.genera = genera;
	}
	public List<PokemonSpeciesVariety> getVarieties() {
		return varieties;
	}
	public void setVarieties(List<PokemonSpeciesVariety> varieties) {
		this.varieties = varieties;
	}
	public List<Name> getNames() {
		return names;
	}
	public void setNames(List<Name> names) {
		this.names = names;
	}
	
	
}
