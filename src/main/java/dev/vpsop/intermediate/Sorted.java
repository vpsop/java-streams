package dev.vpsop.intermediate;

import java.util.Collections;
import java.util.List;

public class Sorted {
    public static void main(String[] args) {
        List<Integer> nums = List.of(5, 2, 8, 1, 3);
        List<Integer> sortedNums = nums.stream().sorted().toList();

        System.out.println(sortedNums);

        // uses natural ordering by default
        // Objects must implement Comparable interface to be used with sorted()
        // otherwise custom comparator can be used

        List<Integer> sorted2 = nums.stream()
                .sorted(Collections.reverseOrder())
                .toList();

        System.out.println(sorted2);


        List<Integer> sorted3 = nums.stream()
                .sorted((a, b) -> Integer.compare(b, a))
                .toList();

        System.out.println(sorted3);



    }
}
