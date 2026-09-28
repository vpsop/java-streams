package dev.vpsop.terminalops;

import java.util.List;

public class ForEach {
    // takes a consumer as param
    // void forEach(Consumer<? super T> action)

    public static void main(String[] args) {
        List<Integer> nums = List.of(2, 3, 4, 5);
        nums.stream()
                .map(x -> x+2)
                .forEach(System.out::println);


        // so with parallel streams forEach() doesn't guarantee ordering
        // use forEachOrdered() for that

        System.out.println("=============================");

        // no order guarantee
        nums.parallelStream()
                .forEach(num  -> System.out.println(num + 2));

        System.out.println("=============================");

        // order guarantee
        nums.parallelStream()
                .forEachOrdered(num  -> System.out.println(num + 2));
    }

}
