package modyo.pokedex.controller;


import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import modyo.pokedex.models.entity.Evolutions;
import modyo.pokedex.models.entity.PokemonAbility;
import modyo.pokedex.models.entity.PokemonBasicInformation;
import modyo.pokedex.models.entity.PokemonDetailInformation;
import modyo.pokedex.models.entity.Type;
import modyo.pokedex.models.service.PokemonService;

@WebMvcTest(value = PokemonController.class)
class PokemonControllerClass {

	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private PokemonService pokemonservice;
	
	
	
	@Test
	public void getPokemons() throws Exception{
		ArrayList<PokemonBasicInformation> PokemonsListMock = new ArrayList<PokemonBasicInformation>();
		ArrayList<Type> TypesMock = new ArrayList<Type>();
		ArrayList<PokemonAbility> AbilitiesMock = new ArrayList<PokemonAbility>();
		Type Typemock1 = new Type();
		Typemock1.setId(12);
		Typemock1.setName("grass");
		
		Type Typemock2 = new Type();
		Typemock2.setId(4);
		Typemock2.setName("poison");
		
		TypesMock.add(Typemock1);
		TypesMock.add(Typemock2);
		
		PokemonAbility AbilityMock1 = new PokemonAbility();
		AbilityMock1.setId(65);
		AbilityMock1.setName("overgrow");
		
		PokemonAbility AbilityMock2 = new PokemonAbility();
		AbilityMock2.setId(34);
		AbilityMock2.setName("chlorophyll");
		
		AbilitiesMock.add(AbilityMock1);
		AbilitiesMock.add(AbilityMock2);
		
		PokemonBasicInformation Mock1 = new PokemonBasicInformation();
		Mock1.setId(1);
		Mock1.setName("bulbasaur");
		Mock1.setUrl("http://localhost:8080/api/pokemon/1");
		Mock1.setPhoto("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/1.png");
		Mock1.setTypes(TypesMock);
		Mock1.setWeight(69);
		Mock1.setAbilities(AbilitiesMock);
		
		PokemonsListMock.add(Mock1);
		
		Mockito.when(pokemonservice.getPokemons(Mockito.anyInt(), Mockito.anyInt(), Mockito.anyString())).thenReturn(PokemonsListMock);
		
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/api/pokemon?offset=0&limit=1");
		
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		
		String expected = "[{\"id\":1,\"name\":\"bulbasaur\",\"url\":\"http://localhost:8080/api/pokemon/1\",\"photo\":\"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/1.png\",\"types\":[{\"id\":12,\"name\":\"grass\"},{\"id\":4,\"name\":\"poison\"}],\"weight\":69,\"abilities\":[{\"id\":65,\"name\":\"overgrow\"},{\"id\":34,\"name\":\"chlorophyll\"}]}]";
		
		JSONAssert.assertEquals(expected, result.getResponse()
				.getContentAsString(), false);
	}
	
	@Test
	public void getPokemon() throws Exception {
		PokemonDetailInformation PokemonMock = new PokemonDetailInformation();
		ArrayList<Type> TypesMock = new ArrayList<Type>();
		ArrayList<PokemonAbility> AbilitiesMock = new ArrayList<PokemonAbility>();
		ArrayList<Evolutions> EvolutionsMock = new ArrayList<Evolutions>();
		Type Typemock1 = new Type();
		Typemock1.setId(12);
		Typemock1.setName("grass");
		
		Type Typemock2 = new Type();
		Typemock2.setId(4);
		Typemock2.setName("poison");
		
		TypesMock.add(Typemock1);
		TypesMock.add(Typemock2);
		
		PokemonAbility AbilityMock1 = new PokemonAbility();
		AbilityMock1.setId(65);
		AbilityMock1.setName("overgrow");
		
		PokemonAbility AbilityMock2 = new PokemonAbility();
		AbilityMock2.setId(34);
		AbilityMock2.setName("chlorophyll");
		
		AbilitiesMock.add(AbilityMock1);
		AbilitiesMock.add(AbilityMock2);
		
		Evolutions Evolution1 = new Evolutions();
		Evolution1.setName("bulbasaur");
		
		Evolutions Evolution2 = new Evolutions();
		Evolution2.setName("ivysaur");
		
		Evolutions Evolution3 = new Evolutions();
		Evolution3.setName("venusaur");
		
		EvolutionsMock.add(Evolution1);
		EvolutionsMock.add(Evolution2);
		EvolutionsMock.add(Evolution3);
		
		PokemonBasicInformation Mock1 = new PokemonBasicInformation();
		Mock1.setId(1);
		Mock1.setName("bulbasaur");
		Mock1.setUrl("http://localhost:8080/api/pokemon/1");
		Mock1.setPhoto("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/1.png");
		Mock1.setTypes(TypesMock);
		Mock1.setWeight(69);
		Mock1.setAbilities(AbilitiesMock);
	
		PokemonMock.setBasicInformation(Mock1);
		PokemonMock.setDescription("Bulbasaur Description");
		PokemonMock.setEvolutions(EvolutionsMock);	
		
		Mockito.when(pokemonservice.getPokemonById(Mockito.anyInt(), Mockito.anyString())).thenReturn(PokemonMock);
		
		RequestBuilder requestBuilder = MockMvcRequestBuilders.get("/api/pokemon/1");
		
		MvcResult result = mockMvc.perform(requestBuilder).andReturn();
		
		String expected = "{\r\n"
				+ "    \"basicInformation\": {\r\n"
				+ "        \"id\": 1,\r\n"
				+ "        \"name\": \"bulbasaur\",\r\n"
				+ "        \"url\": \"http://localhost:8080/api/pokemon/1\",\r\n"
				+ "        \"photo\": \"https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/1.png\",\r\n"
				+ "        \"types\": [\r\n"
				+ "            {\r\n"
				+ "                \"id\": 12,\r\n"
				+ "                \"name\": \"grass\"\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "                \"id\": 4,\r\n"
				+ "                \"name\": \"poison\"\r\n"
				+ "            }\r\n"
				+ "        ],\r\n"
				+ "        \"weight\": 69,\r\n"
				+ "        \"abilities\": [\r\n"
				+ "            {\r\n"
				+ "                \"id\": 65,\r\n"
				+ "                \"name\": \"overgrow\"\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "                \"id\": 34,\r\n"
				+ "                \"name\": \"chlorophyll\"\r\n"
				+ "            }\r\n"
				+ "        ]\r\n"
				+ "    },\r\n"
				+ "    \"evolutions\": [\r\n"
				+ "        {\r\n"
				+ "            \"name\": \"bulbasaur\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"name\": \"ivysaur\"\r\n"
				+ "        },\r\n"
				+ "        {\r\n"
				+ "            \"name\": \"venusaur\"\r\n"
				+ "        }\r\n"
				+ "    ],\r\n"
				+ "    \"description\": \"Bulbasaur Description\"\r\n"
				+ "}";
		
		JSONAssert.assertEquals(expected, result.getResponse()
				.getContentAsString(), false);
		
	}
}
