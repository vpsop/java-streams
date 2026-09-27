package dev.vpsop.intermediate;

import java.util.List;

public class TakeWhileDropWhile {
    public static void main(String[] args) {


        /// takeWhile() -> takes elements while the predicate is true
        /// As soon as the predicate becomes false, it stops
        List<Integer> nums = List.of(2, 4, 1, 6, 7, 8, 10);

        List<Integer> res1 = nums.stream()
                .takeWhile(n -> n % 2 == 0)
                .toList();

        System.out.println(res1);

        /// dropWhile() -> It skips elements while the predicate is true
        /// then keeps everything after the first false.

        List<Integer> nums2 = List.of(1, 3, 1, 6, 5, 8, 10);

        List<Integer> res2 = nums2.stream()
                .dropWhile(n -> n % 2 == 1)
                .toList();

        System.out.println(res2);


        /// takeWhile()
        /// ├── Java 9+
        /// ├── Intermediate
        /// ├── Lazy
        /// ├── Stateful
        /// ├── Short-circuiting
        /// └── Takes while predicate is true

        /// dropWhile()
        /// ├── Java 9+
        /// ├── Intermediate
        /// ├── Lazy
        /// ├── Stateful
        /// └── Drops while predicate is true



    }
}
