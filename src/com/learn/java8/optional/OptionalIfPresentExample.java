package com.learn.java8.optional;

import java.util.Optional;

public class OptionalIfPresentExample {
    public static void main(String[] args) {
        Optional<String> optional = Optional.ofNullable("Hello");
        System.out.println(optional.isPresent() ? optional.get() : "Default");
        optional.ifPresent(System.out::println);
    }
}
