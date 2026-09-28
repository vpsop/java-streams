package dev.vpsop.terminalops;

import java.util.List;
import java.util.Optional;

public class MinMax {
    public static void main(String[] args) {
        /// Both return Optional<T>
        /// as the stream may be empty

        List<Integer> nums = List.of(2, 4, 6, 8, 4, 2);

        Optional<Integer> mx = nums.stream()
                .max(Integer::compareTo);

        Optional<Integer> mn = nums.stream()
                .min(Integer::compareTo);

        System.out.println(mx + " " + mn);
    }
}
