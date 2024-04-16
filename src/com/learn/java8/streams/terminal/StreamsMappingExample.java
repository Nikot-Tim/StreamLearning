package com.learn.java8.streams.terminal;

import com.learn.java8.data.Student;
import com.learn.java8.data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsMappingExample {

    public static void main(String[] args) {
        List<String> namesList = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.mapping(Student::getName, Collectors.toList()));

        System.out.println(namesList);

        Set<String> namesSet = StudentDataBase.getAllStudents().stream()
                .map(Student::getName)
                .collect(Collectors.toSet());

        System.out.println(namesSet);

    }
}
