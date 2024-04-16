package com.learn.java8.numericstreams;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamsRangesExample {
    public static void main(String[] args) {
        System.out.println(IntStream.range(1, 50).count());
        IntStream.range(1, 50).forEach(v -> System.out.print(v + ", "));
        System.out.println(" ");
        System.out.println(IntStream.rangeClosed(1, 50).count());
        IntStream.rangeClosed(1, 50).forEach(v -> System.out.print(v + ", "));
        System.out.println(" ");
        System.out.println(LongStream.range(1, 50).count());
        LongStream.range(1, 50).forEach(v -> System.out.print(v + ", "));
        System.out.println(" ");
        System.out.println(LongStream.rangeClosed(1, 50).count());
        LongStream.rangeClosed(1, 50).forEach(v -> System.out.print(v + ", "));
        System.out.println(" ");
        IntStream.range(1, 50).asDoubleStream().forEach(v -> System.out.print(v + ", "));
    }
}
