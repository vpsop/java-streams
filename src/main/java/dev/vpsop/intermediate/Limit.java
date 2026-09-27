package dev.vpsop.intermediate;

import java.util.List;

public class Limit {
    public static void main(String[] args) {
        List<Integer> nums = List.of(10, 20, 30, 40, 50);
        List<Integer> atMost2 = nums.stream()
                .limit(2)
                .toList();

        System.out.println(atMost2);
    }
}
