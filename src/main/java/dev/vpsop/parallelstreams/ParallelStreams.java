package dev.vpsop.parallelstreams;

import java.util.List;
import java.util.stream.Stream;

public class ParallelStreams {
    public static void main(String[] args) {
        List<Integer> nums = List.of(2, 3, 4, 5);

        // Thread -> process elements one by one
        Stream<Integer> stream1 = nums.stream();

        // Multiple threads -> process different portions
        // Uses ForkJoin common pool by default
        Stream<Integer> stream2 = nums.parallelStream();
    }
}
