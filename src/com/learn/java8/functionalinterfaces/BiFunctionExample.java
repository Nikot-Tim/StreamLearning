package com.learn.java8.functionalinterfaces;

import com.learn.java8.data.Student;
import com.learn.java8.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {

    public static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> biFunction =
            (students, studentPredicate) -> {
                Map<String, Double> studentMap = new HashMap<>();
                students.forEach(s -> {
                    if(studentPredicate.test(s)){
                        studentMap.put(s.getName(), s.getGpa());
                    }
                });
                return studentMap;
            };

    public static void main(String[] args) {
        System.out.println(biFunction.apply(StudentDataBase.getAllStudents(), PredicateStudentExample.studentPredicate));
    }
}
