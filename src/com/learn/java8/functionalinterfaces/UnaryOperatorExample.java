package com.learn.java8.functionalinterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    static public UnaryOperator<String> unaryOperator = s -> s.concat("default");

    public static void main(String[] args) {
        System.out.println(unaryOperator.apply("java8"));
    }
}
