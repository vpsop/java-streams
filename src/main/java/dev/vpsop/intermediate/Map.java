package dev.vpsop.intermediate;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;

// map() is an intermediate operation used to
// transform each element of a stream into another value.
public class Map {

    // <R> Stream<R> map(Function<? super T, ? extends R> mapper)
    public static void main(String[] args) {

        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> res = nums.stream()
                .map(x -> x * 2)
                .toList();

        System.out.println(res);

        // map() expects a Function<T, R>
        Function<Integer, Integer> doubleNumber  = n -> n * 2;

        List<Integer> res2 = nums.stream()
                .map(doubleNumber)
                .toList();

        System.out.println(res2);


        // map() can change the type of stream
        List<String> res3 = nums.stream()
                .map(x -> "Number: " + x)
                .toList();

        System.out.println(res3);

        List<String> res4 = nums.stream()
                .map(n -> n * 2)
                .map(n -> n + 10)
                .map(String::valueOf)
                .toList();

        System.out.println(res4);

        /// PRIMITIVE MAPPING

        // mapToInt()     ->   IntStream
        // mapToLong()    ->   LongStream
        // mapToDouble()  ->   DoubleStream

        List<String> names = List.of("Java", "Spring",  "Docker");

        int totalLength = names.stream()
                .map(String::length)
                .mapToInt(x -> x)
                .sum();

        System.out.println(totalLength);

        // IntStream -> when you need numeric aggregation

        // Specific terminal Methods
        int sum = IntStream.of(1, 2, 3).sum();
        int min = IntStream.of(1, 2, 3).min().orElse(0);
        int max = IntStream.of(1, 2, 3).max().orElse(0);
        long count = IntStream.of(1, 2, 3).count();
        double avg = IntStream.of(1, 2, 3).average().orElse(0);

        System.out.println("Stats : " + sum + " " + max + " " + min + " " + count + " " + avg);


        IntSummaryStatistics stats = IntStream.of(1, 2, 3).summaryStatistics();
        System.out.println(stats.getCount());
        System.out.println(stats.getSum());
        System.out.println(stats.getMin());
        System.out.println(stats.getMax());
        System.out.println(stats.getAverage());

        // boxed() -> IntStream -> Stream<Integer>
        List<Integer> list = IntStream.range(1, 6)
                        .boxed()
                        .toList();

        System.out.println(list);

        // Similar goes for mapToLong, mapToDouble

    }
}
