package dev.vpsop.parallelstreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class OperationStates {
    public static void main(String[] args) {
        // Stateless Operations -> Each element can be processed independently
        // filter()
        // map()
        // mapToInt()
        // flatMap()
        // peek()


        // Stateful Operations -> They need information about other elements
        // distinct()
        // sorted()
        // limit()
        // skip()
        // takeWhile()
        // dropWhile()


        /// NEVER mutate shared collections
        List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9);

        List<Integer> result1 = new ArrayList<>();

        nums.parallelStream()
                .forEach(result1::add); // BAD

        System.out.println(result1.size()); // Gives diff result one different runs

        // Possible problems: race conditions, corrupted state, missing elements, unpredictable behavior

        List<Integer> result2 = nums.parallelStream()
                        .map(x -> x * 2)
                        .toList(); // FIX

        System.out.println(result2.size());


        // Parallel Stream parallelizes your lambda execution,
        // so your lambdas must be safe for concurrent execution.

        // poor candidates for parallelism:
        // Small dataset
        // I/O-heavy operations
        // Shared mutable state
        // Order-sensitive processing
        // Cheap operations, and
        // Operations with lots of synchronization

    }
}
