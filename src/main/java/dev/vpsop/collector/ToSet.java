package dev.vpsop.collector;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ToSet {
    public static void main(String[] args) {
        List<Integer> nums = List.of(3, 1, 2, 1);

        Set<Integer> res1 = nums.stream()
                .map(x -> x*2)
                .collect(Collectors.toSet());

        // Collectors.toSet() does not guarantee any
        // particular Set implementation or iteration order.
        System.out.println(res1);

        // Insertion order preserved
        Set<Integer> res2 = nums.stream()
                .map(x -> x * 2)
                .collect(Collectors.toCollection(LinkedHashSet::new));

        System.out.println(res2);

        // Use TreeSet for Sorted order
        Set<Integer> res3 = nums.stream()
                .map(x -> x * 2)
                .collect(Collectors.toCollection(TreeSet::new));

        System.out.println(res3);


    }
}
