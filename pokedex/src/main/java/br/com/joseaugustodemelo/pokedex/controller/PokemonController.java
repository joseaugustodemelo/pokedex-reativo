package br.com.joseaugustodemelo.pokedex.controller;

import br.com.joseaugustodemelo.pokedex.models.Pokemon;
import br.com.joseaugustodemelo.pokedex.repository.PokemonRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/v1")
public class PokemonController {

    private PokemonRepository pokemonRepository;

    public PokemonController(PokemonRepository pokemonRepository){
        this.pokemonRepository = pokemonRepository;
    }

    @GetMapping
    public Flux<Pokemon> getAllPokemons(){
        return pokemonRepository.findAll();
    }

    @GetMapping("/{id}")
    public Mono<ResponseEntity<Pokemon>> getPokemon(@PathVariable String id){
        return pokemonRepository.findById(id)
                .map(pokemon -> ResponseEntity.ok(pokemon))
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Pokemon> savePokemon(@RequestBody Pokemon pokemon){
        return pokemonRepository.save(pokemon);
    }



}
