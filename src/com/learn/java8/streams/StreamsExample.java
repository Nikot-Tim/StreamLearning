package com.learn.java8.streams;

import com.learn.java8.data.Student;
import com.learn.java8.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsExample {
    public static void main(String[] args) {
        //student name and activities in a map
        Predicate<Student> gradeLevelPredicate = student -> student.getGradeLevel()>=3;
        Predicate<Student> gpaPredicate = student -> student.getGpa()>=3.9;

        Map<String, List<String>> studentMap =
                StudentDataBase.getAllStudents().stream()
                        .peek(student -> {
                            System.out.println(student);
                        })
                        .filter(gradeLevelPredicate)
                        .peek(student -> {
                            System.out.println("after first filter " + student);
                        })
                        .filter(gpaPredicate)
                        .peek(student -> {
                            System.out.println("after second filter " + student);
                        })
                        .collect(Collectors.toMap(Student::getName, Student::getActivities));

        System.out.println(studentMap);
    }
}
