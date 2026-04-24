package com.example.demo.services;

import com.example.demo.domain.entities.Pokemon;
import com.example.demo.repository.PokemonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PokemonService {

    private final PokemonRepository pokemonRepository;

    public List<Pokemon> filtrarPorTipo(String tipo) {
        return pokemonRepository.getPokemons()
                .stream()
                .filter(p -> p.getTipo().equalsIgnoreCase(tipo))
                .collect(Collectors.toList());
    }

    public List<Pokemon> filtrarPorZona(String zona) {
        return pokemonRepository.getPokemons()
                .stream()
                .filter(p -> p.getZonas().stream()
                        .anyMatch(z -> z.equalsIgnoreCase(zona)))
                .collect(Collectors.toList());
    }

    public List<Pokemon> filtrarPorDebilidad(String debilidad) {
        return pokemonRepository.getPokemons()
                .stream()
                .filter(p -> p.getDebilidades().stream()
                        .anyMatch(d -> d.equalsIgnoreCase(debilidad)))
                .collect(Collectors.toList());
    }
}
