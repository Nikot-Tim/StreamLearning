package com.learn.java8.defaults;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DefaultsMethodExample {

    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("Adam", "Jenny", "Alex", "Dan", "Mike", "Eric");


//        Collections.sort(stringList);
//        System.out.println("Sorted list using Collections.Sort() : " + stringList);

        stringList.sort(Comparator.naturalOrder());
        System.out.println("Sorted list using List.Sort() : " + stringList);

        stringList.sort(Comparator.reverseOrder());
        System.out.println("Sorted list using List.Sort().reverse() : " + stringList);
    }
}
