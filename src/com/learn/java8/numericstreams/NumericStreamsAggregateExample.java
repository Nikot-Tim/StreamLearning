package com.learn.java8.numericstreams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class NumericStreamsAggregateExample {
    public static void main(String[] args) {
        System.out.println("Sum is " + IntStream.rangeClosed(1,50).sum());
        OptionalInt optionalIntMax = IntStream.rangeClosed(1,50).max();
        System.out.println("Max is " + (optionalIntMax.isPresent() ? optionalIntMax.getAsInt() : "Empty array"));
        OptionalInt optionalIntMin = IntStream.rangeClosed(1,50).min();
        System.out.println("Min is " + (optionalIntMin.isPresent() ? optionalIntMin.getAsInt() : "Empty array"));

        OptionalDouble optionalDoubleAverage = IntStream.rangeClosed(1,50).average();
        System.out.println("Average is " + (optionalDoubleAverage.isPresent() ? optionalDoubleAverage.getAsDouble() : "Empty array"));

    }
}
