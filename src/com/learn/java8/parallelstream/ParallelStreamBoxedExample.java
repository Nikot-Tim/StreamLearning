package com.learn.java8.parallelstream;

import java.util.List;
import java.util.stream.IntStream;

public class ParallelStreamBoxedExample {

    public static int sequential(List<Integer> integerList) {
        long startTime = System.currentTimeMillis();
        int sum = integerList.stream()
                .reduce(0, Integer::sum);
        long endTime = System.currentTimeMillis();
        System.out.println("execution time sequential = " + (endTime - startTime));
        return sum;
    }

    public static int parallel(List<Integer> integerList) {
        long startTime = System.currentTimeMillis();
        int sum = integerList.stream()
                .parallel()
                .reduce(0, Integer::sum);
        long endTime = System.currentTimeMillis();
        System.out.println("execution time parallel = " + (endTime - startTime));
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> integerList = IntStream.rangeClosed(1, 10000)
                .boxed()
                .toList();
        sequential(integerList);
        parallel(integerList);
    }
}
