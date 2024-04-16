package com.learn.java8.lambdas;

public class RunnableLambdaExample {
    public static void main(String[] args) {

        /**
         * before Java 8
         */

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside runnable 1");
            }
        };

        new Thread(runnable).start();

        /**
         * after Java 8
         */

        new Thread(() -> {
            System.out.println("Inside runnable 2");
            System.out.println("Inside runnable 3");
        }).start();


    }
}
