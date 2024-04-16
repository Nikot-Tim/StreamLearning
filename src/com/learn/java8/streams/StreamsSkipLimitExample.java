package com.learn.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Spliterator;

public class StreamsSkipLimitExample {

    public static Optional<Integer> limit(List<Integer> integerList){
        return integerList.stream()
                .limit(3)
                .reduce(Integer::sum);
    }

    public static Optional<Integer> skip(List<Integer> integerList){
        return integerList.stream()
                .skip(3)
                .reduce(Integer::sum);
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(6, 7, 8, 9, 10);
        var res = limit(integerList);
        System.out.println(res.isPresent() ? res.get() : "noElements");
        res = skip(integerList);
        System.out.println(res.isPresent() ? res.get() : "noElements");
    }
}
