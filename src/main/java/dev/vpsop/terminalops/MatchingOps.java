package dev.vpsop.terminalops;

import java.util.List;

public class MatchingOps {

    public static void main(String[] args) {

        List<String> names = List.of("Raj", "Kritya", "Nonita");

        // anyMatch() -> Is at least one element matching?

        // Short-Circuiting
        // It will stop as soon as finding first element matching the condition
        boolean res1 = names.stream()
                .anyMatch(name -> name.length() > 6);

        // will be false as no name is greater than 6 letters
        System.out.println(res1);


        // allMatch() -> Do all elements match?
        // Also short-circuiting
        // will stop as soon as found first non match and return false
        List<Integer> nums = List.of(2, 4, 6, 8);

        boolean res2 = nums.stream()
                .allMatch(x -> x % 2 == 0);

        System.out.println(res2); // true


        // noneMatch() -> Do no elements match?
        // Also short-circuiting
        // will stop as soon as found first match and return false
        List<Integer> nums2 = List.of(2, 4, 6, 8);

        boolean res3 = nums2.stream()
                .noneMatch(x -> x < 0);

        System.out.println(res3); // true

        /// anyMatch    →    stops at first TRUE
        /// allMatch    →    stops at first FALSE
        /// noneMatch   →    stops at first TRUE
    }

}
