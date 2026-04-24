package com.example.demo.common;

import com.example.demo.domain.entities.Pokemon;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PokemonList {

    private final List<Pokemon> pokemons;

    public PokemonList() {
        this.pokemons = new ArrayList<>();

        this.pokemons.add(Pokemon.builder()
                .nombre("Charmander")
                .tipo("Fuego")
                .debilidades(List.of("Agua", "Roca", "Tierra"))
                .zonas(List.of("Montaña"))
                .region("Kanto")
                .build());

        this.pokemons.add(Pokemon.builder()
                .nombre("Squirtle")
                .tipo("Agua")
                .debilidades(List.of("Planta", "Eléctrico"))
                .zonas(List.of("Lago", "Mar"))
                .region("Kanto")
                .build());

        this.pokemons.add(Pokemon.builder()
                .nombre("Bulbasaur")
                .tipo("Planta")
                .debilidades(List.of("Fuego", "Hielo"))
                .zonas(List.of("Bosque", "Hierba Alta"))
                .region("Kanto")
                .build());

        this.pokemons.add(Pokemon.builder()
                .nombre("Pikachu")
                .tipo("Eléctrico")
                .debilidades(List.of("Tierra"))
                .zonas(List.of("Bosque"))
                .region("Kanto")
                .build());
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }
}