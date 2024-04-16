package com.learn.java8.functionalinterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    public static BinaryOperator<Integer> binaryOperator = (a,b) -> a*b;
    public static Comparator<Integer> comparator = Integer::compareTo;
    public static void main(String[] args) {
        System.out.println(binaryOperator.apply(3,6));
        BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);
        System.out.println(maxBy.apply(19,7));
    }
}
