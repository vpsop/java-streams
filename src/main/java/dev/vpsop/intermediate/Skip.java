package dev.vpsop.intermediate;

import java.util.List;

public class Skip {
    public static void main(String[] args) {
        List<Integer> nums = List.of(10, 20, 30, 40, 50);

        List<Integer> withoutFirst2 = nums.stream()
                .skip(2)
                .toList();

        System.out.println(withoutFirst2);
    }
}
