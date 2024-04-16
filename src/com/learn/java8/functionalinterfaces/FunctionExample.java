package com.learn.java8.functionalinterfaces;

import java.util.function.Function;

public class FunctionExample {

    public static Function<String, String> function = String::toUpperCase;
    public static Function<String, String> function2 = s -> s.concat("default");
    public static void main(String[] args) {
        System.out.println(function.apply("java8"));
        System.out.println(function.andThen(function2).apply("java8"));
        System.out.println(function.compose(function2).apply("java8"));
    }
}
