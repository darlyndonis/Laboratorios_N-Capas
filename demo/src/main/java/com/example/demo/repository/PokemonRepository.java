package com.example.demo.repository;

import com.example.demo.common.PokemonList;
import com.example.demo.domain.entities.Pokemon;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class PokemonRepository {

    private final PokemonList pokemonList;

    public List<Pokemon> getPokemons() {
        return pokemonList.getPokemons();
    }
}