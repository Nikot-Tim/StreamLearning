package com.learn.java8.optional;

import com.learn.java8.data.Student;
import com.learn.java8.data.StudentDataBase;

import java.util.Optional;

public class OptionalOrElseExample {

    public static String optionalOrElse(){
//        Optional<Student> optionalStudent =
//                Optional.ofNullable(StudentDataBase.studentSupplier.get());

        Optional<Student> optionalStudent = Optional.empty();

       return optionalStudent.map(Student::getName).orElse("Default");
    }

    public static String optionalOrElseGet(){
        Optional<Student> optionalStudent =
                Optional.ofNullable(StudentDataBase.studentSupplier.get());

        return optionalStudent.map(Student::getName).orElseGet(() -> "Default");
    }

    public static String optionalOrElseThrow(){
        Optional<Student> optionalStudent =
                Optional.ofNullable(StudentDataBase.studentSupplier.get());

        return optionalStudent.map(Student::getName).orElseThrow(() -> new RuntimeException("No data available"));
    }

    public static void main(String[] args) {

        System.out.println(optionalOrElse());
        System.out.println(optionalOrElseGet());
        System.out.println(optionalOrElseThrow());

    }
}
