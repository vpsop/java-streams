package dev.vpsop.terminalops;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ToArray {
    public static void main(String[] args) {
        IntStream intStream = IntStream.of(1, 2, 3, 4, 5, 6);

        // Now say I want Array of Integers[]
        Integer[] objArray = intStream.boxed().toArray(Integer[]::new);

        System.out.println(Arrays.toString(objArray));


    }
}
