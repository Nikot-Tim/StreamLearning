package com.learn.java8.streams;

import com.learn.java8.data.Student;
import com.learn.java8.data.StudentDataBase;

import java.util.Optional;

public class StreamFindAnyFirstExample {

    public static Optional<Student> findAnyStudent() {
        return StudentDataBase.getAllStudents().stream()
                .filter(s -> s.getGpa() >= 3.9)
                .findAny();
    }

    public static Optional<Student> findFirstStudent() {
        return StudentDataBase.getAllStudents().stream()
                .filter(s -> s.getGpa() >= 4.1)
                .findFirst();
    }

    public static void main(String[] args) {
        var result = findAnyStudent();
        System.out.println(result.isPresent() ? result.get() : "No student");
        var result2 = findFirstStudent();
        System.out.println(result2.isPresent() ? result2.get() : "No student");
    }
}
