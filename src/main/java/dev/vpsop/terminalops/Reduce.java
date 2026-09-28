package dev.vpsop.terminalops;

import java.util.List;

public class Reduce {
    public static void main(String[] args) {
        List<String> names = List.of("Docker", "Java", "Kafka"); // total length = 15

        int totalLength = names.stream()
                .map(String::length)
                .reduce(0, (a, b) -> a + b);


        // first arg   ->    Identity    ->  Initial value

        // second arg  ->    Accumulator ->  Combines one stream element into the current result
        //                               ->  Partial result + element

        // third arg   ->    Combiner    ->  Partial result (from one stream) + Partial result (from another stream)
        //                               ->  Matters primarily for parallel streams

        System.out.println(totalLength);

        int totalLength2 = names.parallelStream()
                .map(String::length)
                .reduce(0,
                        (a, b) -> a + b,
                        (res1, res2) -> res1 + res2
                );

        System.out.println(totalLength2);

    }
}
