package com.example.demo;

import com.example.demo.services.PokemonService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner run(PokemonService pokemonService) {
        return args -> {

            System.out.println("=== FILTRO POR TIPO ===");
            pokemonService.filtrarPorTipo("Agua")
                    .forEach(p -> System.out.println(
                            "[PKMN] Nombre: " + p.getNombre() +
                                    " | Tipo: " + p.getTipo() +
                                    " | Debilidades: " + String.join(", ", p.getDebilidades())
                    ));

            System.out.println("\n=== FILTRO POR DEBILIDAD ===");
            pokemonService.filtrarPorDebilidad("Planta")
                    .forEach(p -> System.out.println(
                            "[PKMN] Nombre: " + p.getNombre() +
                                    " | Tipo: " + p.getTipo() +
                                    " | Debilidades: " + String.join(", ", p.getDebilidades())
                    ));

            System.out.println("\n=== FILTRO POR ZONA ===");
            pokemonService.filtrarPorZona("Lago")
                    .forEach(p -> System.out.println(
                            "[PKMN] Nombre: " + p.getNombre() +
                                    " | Tipo: " + p.getTipo() +
                                    " | Debilidades: " + String.join(", ", p.getDebilidades())
                    ));
        };
    }
}




