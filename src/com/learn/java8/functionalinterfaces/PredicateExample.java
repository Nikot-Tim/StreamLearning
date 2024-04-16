package com.learn.java8.functionalinterfaces;

import java.util.function.Predicate;

public class PredicateExample {

    public static Predicate<Integer> predicate = i -> (i % 2) == 0;

    public static Predicate<Integer> predicate1 = i -> i % 5 == 0;
    public static void predicateAnd(){
        System.out.println(predicate.and(predicate1).test(10));
    }

    public static void predicateOr(){
        System.out.println(predicate.or(predicate1).test(15));
    }

    public static void predicateNegate(){
        System.out.println(predicate.or(predicate1).negate().test(11));
    }


    public static void main(String[] args) {
        Predicate<Integer> predicate = i -> i % 2 == 0;

        System.out.println(predicate.test(4 ));

        predicateAnd();
        predicateOr();
        predicateNegate();
    }
}
