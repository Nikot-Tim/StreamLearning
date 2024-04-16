package com.learn.java8.streams;

import com.learn.java8.data.Student;
import com.learn.java8.data.StudentDataBase;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class StreamsReduceExample {

    public static int performMultiplication(List<Integer> integerList) {
        return integerList.stream()
                .reduce(1, (a, b) -> a * b);

    }

    public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integerList) {
        return integerList.stream()
                .reduce((a, b) -> a * b);

    }

    public static Optional<Student> getHighestGpaStudent() {
        return StudentDataBase.getAllStudents().stream()
                .reduce((a, b) -> (a.getGpa() > b.getGpa()) ? a : b);

    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 3, 5, 7);
        System.out.println(performMultiplication(integerList));

        var result = performMultiplicationWithoutIdentity(integerList);

        System.out.println(result.isPresent());
        System.out.println(result.get());

        var result1 = performMultiplicationWithoutIdentity(Collections.emptyList());

        System.out.println(result1.isPresent() ? result1.get() : "NO_ELEMENT");

        var highestGpaStudent = getHighestGpaStudent();
        highestGpaStudent.ifPresent(System.out::println);

    }
}
