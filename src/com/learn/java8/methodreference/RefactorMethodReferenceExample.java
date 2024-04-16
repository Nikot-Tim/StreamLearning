package com.learn.java8.methodreference;

import com.learn.java8.data.Student;
import com.learn.java8.data.StudentDataBase;

import java.util.function.Predicate;

public class RefactorMethodReferenceExample {

    static Predicate<Student> studentPredicate = RefactorMethodReferenceExample::greaterThenGradeLevel;

    static boolean greaterThenGradeLevel(Student student){
         return student.getGradeLevel() >= 3;
    }

    public static void main(String[] args) {
        System.out.println(studentPredicate.test(StudentDataBase.studentSupplier.get()));
    }
}
