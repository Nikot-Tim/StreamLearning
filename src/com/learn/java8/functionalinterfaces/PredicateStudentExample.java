package com.learn.java8.functionalinterfaces;

import com.learn.java8.data.Student;
import com.learn.java8.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

    static Predicate<Student> studentPredicate = student -> student.getGradeLevel() >= 3;
    static Predicate<Student> studentPredicate1 = student -> student.getGpa() >= 3.9;

    public static void filterStudentBuGradeLevel(){
        List<Student> students = StudentDataBase.getAllStudents();

        students.forEach(student -> {
            if (studentPredicate.and(studentPredicate1).test(student)) {
                System.out.println(student);
            }
        });
    }

    public static void main(String[] args) {
        filterStudentBuGradeLevel();
    }
}
