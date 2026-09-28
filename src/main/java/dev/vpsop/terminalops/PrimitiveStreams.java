package dev.vpsop.terminalops;

import java.util.IntSummaryStatistics;
import java.util.LongSummaryStatistics;
import java.util.DoubleSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.DoubleStream;

public class PrimitiveStreams {

    public static void main(String[] args) {


        // IntStream
        IntStream ints = IntStream.of(10, 20, 30, 40);

        System.out.println("Int sum: " + IntStream.of(10, 20, 30, 40).sum());

        System.out.println(
                "Int average: " + IntStream.of(10, 20, 30, 40).average().orElse(0)
        );

        IntSummaryStatistics intStats =
                IntStream.of(10, 20, 30, 40).summaryStatistics();

        System.out.println("Int statistics: " + intStats);

        // LongStream

        System.out.println(
                "Long sum: " + LongStream.of(100L, 200L, 300L, 400L).sum()
        );

        System.out.println(
                "Long average: " + LongStream.of(100L, 200L, 300L, 400L)
                                .average()
                                .orElse(0)
        );

        LongSummaryStatistics longStats =
                LongStream.of(100L, 200L, 300L, 400L)
                        .summaryStatistics();

        System.out.println("Long statistics: " + longStats);

        // DoubleStream

        System.out.println(
                "Double sum: " +
                        DoubleStream.of(1.5, 2.5, 3.5, 4.5).sum()
        );

        System.out.println(
                "Double average: " +
                        DoubleStream.of(1.5, 2.5, 3.5, 4.5)
                                .average()
                                .orElse(0)
        );

        DoubleSummaryStatistics doubleStats =
                DoubleStream.of(1.5, 2.5, 3.5, 4.5)
                        .summaryStatistics();

        System.out.println("Double statistics: " + doubleStats);
    }
}