package dev.vpsop.collector;

import java.util.List;
import java.util.stream.Collectors;

public class ToList {
    public static void main(String[] args) {
        List<Integer> nums = List.of(2, 4, 6, 8);

        // Collectors.toList() can return an unmodifiable list
        // Can also return modifiable list

        List<Integer> res1 = nums.stream()
                .map(x -> x * 2)
                .collect(Collectors.toList());

        System.out.println(res1);

        // Collectors.toUnmodifiableList() is guaranteed to
        // return unmodifiable list

        List<Integer> res2 = nums.stream()
                .map(x -> x * 2)
                .collect(Collectors.toUnmodifiableList());

        System.out.println(res2);

        // Stream.toList() also returns unmodifiable list

        List<Integer> res3 = nums.stream()
                .map(x -> x * 2)
                .toList();

        System.out.println(res3);
    }

}
