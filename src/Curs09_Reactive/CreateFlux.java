package Curs09_Reactive;

import reactor.core.publisher.Flux;

public class CreateFlux {
    public static Flux emptyFlux() {
        return Flux.empty();
    }

    public static Flux fooBarFromValues(){
        return Flux.just("foo", "bar");
    }

}
