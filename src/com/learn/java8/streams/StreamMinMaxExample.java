package com.learn.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinMaxExample {

    public static int findMaxValue(List<Integer> integerList){
        return integerList.stream()
                .reduce(0, (a,b) -> a>b ? a : b);
    }

    public static Optional<Integer> findMaxValueOpt(List<Integer> integerList){
        return integerList.stream()
                .reduce(Integer::max);
    }

    public static Optional<Integer> findMinValueOpt(List<Integer> integerList){
        return integerList.stream()
                .reduce(Integer::min);
    }


    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(6,7,8,9,10);
        List<Integer> integerList2 = new ArrayList<>();
        System.out.println(findMaxValue(integerList));
        System.out.println(findMaxValue(integerList2));

        var res = findMaxValueOpt(integerList);
        System.out.println(res.isPresent() ? res.get() : "No elements");
        var res2 = findMaxValueOpt(integerList2);
        System.out.println(res2.isPresent() ? res2.get() : "No elements");

        var res3 = findMaxValueOpt(integerList);
        System.out.println(res3.isPresent() ? res3.get() : "No elements");
        var res4 = findMaxValueOpt(integerList2);
        System.out.println(res4.isPresent() ? res4.get() : "No elements");

    }
}
