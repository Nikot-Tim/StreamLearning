package com.learn.java8.streams.terminal;

import com.learn.java8.data.Student;
import com.learn.java8.data.StudentDataBase;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsJoiningExample {

    public static String joining_1() {
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining());
    }

    public static String joining_2() {
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining("; \n"));
    }

    public static String joining_3() {
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.joining("; ", "(", ")"));
    }

    public static void main(String[] args) {
//        System.out.println(joining_1());
//        System.out.println(joining_2());
//        System.out.println(joining_3());

        Map<String, List<String>> collect =
                Stream.of("Zevs Ivan", "Struk Serge", "Struk Alexander", "Popov Nikita", "Zevs Max")
                .map(s -> s.split(" ", 2))
                .collect(Collectors.groupingBy(s -> s[0], Collectors.mapping(s -> s[1], Collectors.toList())));

        collect.entrySet()
                .stream()
                .filter(entry -> entry.getValue().size() > 1)
                .sorted(Map.Entry.comparingByKey())
                .map(entry -> {
                    Collections.sort(entry.getValue());
                    return entry.getValue()
                            .stream()
                            .map(value -> entry.getKey() + " " + value)
                            .collect(Collectors.toList());
                })
                .forEach(el -> el.forEach(System.out::println));
    }
}
