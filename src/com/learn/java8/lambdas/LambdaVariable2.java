package com.learn.java8.lambdas;

import java.util.function.Consumer;

public class LambdaVariable2 {

    static int value = 4;

    public static void main(String[] args) {
        //int value = 4;
        //value = 6;
        Consumer<Integer> c1 = (i) -> {
            value++;
            int r = 1;
            r++;
            r= r+7;
            System.out.println(value+i+r);
            r++;
            System.out.println(r);
        };

        //value = 6;

        c1.accept(4);

        System.out.println(value);
    }
}
