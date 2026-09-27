package dev.vpsop;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4, 5);

        nums.stream()
                .filter(n -> n%2 == 0)
                .forEach(System.out::println);


        Stream.iterate(0, x -> x+1)
                .limit(10)
                .forEach(System.out::println);

        Stream.generate(UUID::randomUUID).limit(10).forEach(System.out::println);

        int[] arr = new int[]{5, 6, 7 ,8 , 9, 10};
        Arrays.stream(arr).forEach(System.out::println);


        Stream<Integer> myIntStream = Stream.of(2, 4, 6, 8, 10);
        myIntStream.forEach(System.out::println);
    }
}