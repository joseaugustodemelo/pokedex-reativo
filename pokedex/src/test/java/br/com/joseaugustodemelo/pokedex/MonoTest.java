package br.com.joseaugustodemelo.pokedex;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public class MonoTest {

    @Test
    public void monoTest1() {
        Mono<String> mono = Mono.empty();
    }

    @Test
    public void monoTest2() {
        Mono<String> mono = Mono.just("Pokemon");
        mono.subscribe(System.out::println);
    }

    @Test
    public void monoTest3() {
        Mono<Integer> mono = Mono.just(10);
        mono.subscribe(System.out::println);
    }

    @Test
    public void monoTest4() {
        Mono<String> mono = Mono.error(new RuntimeException("Ocorreu uma exceção!"));
    }
}
