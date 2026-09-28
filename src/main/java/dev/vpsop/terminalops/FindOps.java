package dev.vpsop.terminalops;

import java.util.List;
import java.util.Optional;

public class FindOps {
    public static void main(String[] args) {
        // findFirst()
        // Returns the first element according to encounter order.

        // Encounter order means the predictable sequence
        // in which a data structure arranges and processes its elements

        List<Integer> nums = List.of(4, 3, 2, 6, 8, 5);

        Optional<Integer> firstOdd = nums.parallelStream()
                .filter(x -> x % 2 == 1)
                .findFirst();

        System.out.println(firstOdd);

        // findAny()
        // Returns any element from the stream

        Optional<Integer> anyOdd = nums.parallelStream()
                .filter(x -> x % 2 == 1)
                .findAny();

        System.out.println(anyOdd);
    }
}
