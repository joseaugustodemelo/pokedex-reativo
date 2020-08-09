package br.com.joseaugustodemelo.pokedex.repository;

import br.com.joseaugustodemelo.pokedex.models.Pokemon;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface PokemonRepository extends ReactiveMongoRepository<Pokemon, String> {
}
