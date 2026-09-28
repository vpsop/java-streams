package dev.vpsop.terminalops;

import java.util.List;

public class Count {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        long evenCount = nums.stream()
                .filter(x -> x % 2 == 0)
                .count();

        System.out.println(evenCount);

        /// Remember that it returns long not int
    }
}
