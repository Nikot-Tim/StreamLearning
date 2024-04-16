package com.learn.java8.streams;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamOfGenerateIterateExample {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("Adam", "Dan", "Julie");
        stringStream.forEach(System.out::println);

        Stream.iterate(1, a->a*2)
                .limit(10)
                .forEach(System.out::println);
        System.out.println("------------------");
        Supplier<Integer> supplier = new Random()::nextInt;
        Stream.generate(supplier)
                .limit(5)
                .forEach(System.out::println);
    }
}
