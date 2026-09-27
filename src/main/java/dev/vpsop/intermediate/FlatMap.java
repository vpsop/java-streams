package dev.vpsop.intermediate;

import java.util.Arrays;
import java.util.List;

public class FlatMap {
    public static void main(String[] args) {
        List<List<Integer>> nums = List.of(
                List.of(1, 2),
                List.of(3, 4),
                List.of(5, 6)
        );

        List<Integer> res1 = nums.stream()
                .flatMap(x -> x.stream())
                .toList();

        System.out.println(res1);

        List<Integer> res2 = nums.stream()
                .flatMap(List::stream)
                .toList();

        System.out.println(res2);


        List<String> sentences = List.of(
                "Java is powerful",
                "Streams are useful"
        );

        List<String> words = sentences.stream()
                .flatMap(str -> Arrays.stream(str.split(" ")))
                .toList();

        System.out.println(words);


        List<String> names = List.of("Alice", "Bob", "Charlie");
//        List<char[]> characters = names.stream()
//                .map(x -> x.toCharArray())
//                .toList();
//
//        System.out.println(characters);

        List<Character> characters = names.stream()
                .flatMapToInt(str -> str.chars())
                .mapToObj(ch -> (char)ch)
                .toList();

        System.out.println(characters);

        /// flatMapToInt(), flatMapToLong(), flatMapToDouble()
        /// Same concept as flatMap(), but the result is a primitive stream

        List<List<Integer>> nums2 = List.of(
                List.of(1, 2),
                List.of(3, 4)
        );

        int sum = nums2.stream()
                .flatMapToInt(x -> x.stream().mapToInt(Integer::intValue))
                .sum();

        System.out.println(sum);



    }
}
