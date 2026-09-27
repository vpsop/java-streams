package dev.vpsop;

import java.util.List;
import java.util.stream.Stream;

public class StreamConcat {
    // static <T> Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b)

    public static void main(String[] args) {
        Stream<Integer> s1 = Stream.of(1, 2, 3);
        Stream<Integer> s2 = Stream.of(4, 5, 6);

        List<Integer> res = Stream.concat(s1, s2).toList();
        System.out.println(res);

        Stream<String> s3 = Stream.of("A", "B");
        Stream<String> s4 = Stream.of("C", "D");

        Stream<String> result = Stream.concat(s3, s4);
        System.out.println(result.toList());
    }



}
