package dev.vpsop.terminalops;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Collect {

    public static void main(String[] args) {

        List<Integer> nums = List.of(2, 3, 5, 6, 8, 9);

        Set<Integer> list = nums.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toSet());

        System.out.println(list);
    }

}
