package br.com.joseaugustodemelo.pokedex;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;

public class FluxTest {

    @Test
    public void fluxTest1 (){
        Flux.empty();
    }

    @Test
    public void fluxTest2 (){
        Flux<String> flux = Flux.just("Pokedex");
        flux.subscribe(System.out::println);
    }

    @Test
    public void fluxTest3 (){
        Flux<String> flux = Flux.just("Sharizard", "Blastoise", "Picachu");
        flux.subscribe(System.out::println);
    }
}
