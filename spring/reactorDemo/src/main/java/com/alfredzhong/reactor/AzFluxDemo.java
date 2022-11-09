package com.alfredzhong.reactor;

import reactor.core.publisher.Flux;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class AzFluxDemo {
    public static void main(String[] args) {
        System.out.println("flux just demo: ");
        Flux<Integer> intFlux = Flux.just(1,2,3,4,5);
        intFlux.subscribe((x) -> {
            System.out.println("output: " + 2*x);
        });

        System.out.println("flux from list (iterable): ");
        List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5);
        Flux.fromIterable(ints).subscribe((x) -> {
            System.out.println("output: " + 2*x);
        });

        System.out.println("flux from stream: ");
        Stream<Integer> stream = ints.stream();
        Flux.fromStream(stream).subscribe(System.out::println);
    }
}
