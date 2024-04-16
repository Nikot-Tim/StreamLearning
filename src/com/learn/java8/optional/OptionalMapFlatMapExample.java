package com.learn.java8.optional;

import com.learn.java8.data.Bike;
import com.learn.java8.data.Student;
import com.learn.java8.data.StudentDataBase;

import java.util.Optional;

public class OptionalMapFlatMapExample {

    public static void optionalFilter(){
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        studentOptional.filter(s -> s.getGpa()>=4.0).ifPresent(System.out::println);

        studentOptional.filter(s -> s.getGpa()>=3.5).ifPresent(System.out::println);


    }

    public static void optionalMap(){
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        if(studentOptional.isPresent()){
            studentOptional.filter(s -> s.getGpa()>=3.5).map(Student::getName).ifPresent(System.out::println);
        }

        studentOptional.filter(s -> s.getGpa()>=3.5).ifPresent(System.out::println);
    }

    public static void optionalFlatMap(){
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<String> bikeName = studentOptional.filter(student -> student.getGpa()>=3.5)
                .flatMap(Student::getBike)
                .map(Bike::getName);
       bikeName.ifPresent(System.out::println);
    }
    public static void main(String[] args) {
        optionalFilter();
        optionalMap();
        optionalFlatMap();
    }
}
