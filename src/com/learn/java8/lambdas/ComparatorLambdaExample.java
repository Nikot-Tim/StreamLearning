package com.learn.java8.lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {
    public static void main(String[] args) {

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println("Result of comparator is : " + comparator.compare(3, 2));

        Comparator<Integer> comparatorLambda = (Integer o1, Integer o2) -> o1.compareTo(o2);

        Comparator<Integer> comparatorLambda1 = Integer::compareTo;

        Comparator<Integer> comparatorLambda2 = Comparator.naturalOrder();

        System.out.println("Result of lambda comparator is : " + comparatorLambda.compare(3, 2));

        System.out.println("Result of lambda comparator is : " + comparatorLambda1.compare(3, 2));

        System.out.println("Result of lambda comparator is : " + comparatorLambda2.compare(3, 2));
    }
}
