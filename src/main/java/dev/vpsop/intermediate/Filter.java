package dev.vpsop.intermediate;

import java.util.List;
import java.util.function.Predicate;

public class Filter {

    // Stream<T> filter(Predicate<? super T> predicate)

    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6);

        List<Integer> res = nums.stream()
                .filter(x -> x % 2 == 0)
                .toList();

        System.out.println(res);

        // 1 → false → discard
        // 2 → true  → keep
        // 3 → false → discard
        // 4 → true  → keep
        // 5 → false → discard
        // 6 → true  → keep


        Predicate<Integer> p = n -> n % 2 == 0;
        List<Integer> res2 = nums.stream()
                .filter(p)
                .toList();

        System.out.println(res2);

        // Chaining multiple filter operations
        List<Integer> res3 = nums.stream()
                .filter(n -> n > 2)
                .filter(n -> n % 2 == 0)
                .toList();

        System.out.println(res3);

    }
}
