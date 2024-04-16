package com.learn.java8.optional;

import com.learn.java8.data.Student;
import com.learn.java8.data.StudentDataBase;

import java.util.Optional;

public class OptionalExample {

    public static String getStudentName() {
        Student student = StudentDataBase.studentSupplier.get();

        if (student != null) {
            return student.getName();

        }
        return null;
    }

    public static Optional<String> getStudentNameOptional() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        if (studentOptional.isPresent()) {
            return studentOptional.map(Student::getName);
        }
        return Optional.empty();
    }

    public static void main(String[] args) {

//        String name = getStudentName();
//        System.out.println(name.length());

        Optional<String> stringOptional = getStudentNameOptional();
        stringOptional.ifPresentOrElse(s -> System.out.println(s.length()), () -> System.out.println("Not  Found"));

    }
}
