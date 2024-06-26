package com.learn.java8.numericstreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamsBoxingUnboxingExample {
    public static List<Integer> boxing(){
        return IntStream.rangeClosed(1, 10)
                .boxed()
                .collect(Collectors.toList());

    }

    public static int unboxing(List<Integer> integerList){
        return integerList.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }

    public static void main(String[] args) {
        System.out.println(boxing());
        System.out.println(unboxing(boxing()));
    }
}
