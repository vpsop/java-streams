package dev.vpsop.intermediate;

import java.util.List;

public class Peek {

    // Used for debugging
    // Takes a consumer

    // Stream<T> peek(Consumer<? super T> action)

    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4);

        List<Integer> res = nums.stream()
                .peek(n -> System.out.println("Before: " + n))
                .map(x -> x + 20)
                .peek(n -> System.out.println("After: " + n))
                .toList();
    }
}
