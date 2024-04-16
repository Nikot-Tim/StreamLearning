package com.learn.java8.imperativevsdeclarative;

import java.util.stream.IntStream;

public class ImperativeVsDeclarativeExample1 {
    public static void main(String[] args) {
        /**
         * Imperative
         */
        int sum = 0;
        for (int i = 0; i <=100; i++){
            sum+=i;
        }
        System.out.println("Sum using Imperative : " + sum);

        /**
         * Decalarative
         */
        int sum1 = IntStream.rangeClosed(0, 100)
                .parallel()
                .sum();
        System.out.println("Sum using Declarative : " + sum1);
    }
}
