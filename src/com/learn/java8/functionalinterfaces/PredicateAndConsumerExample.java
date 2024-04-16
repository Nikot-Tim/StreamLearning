package com.learn.java8.functionalinterfaces;

import com.learn.java8.data.Student;
import com.learn.java8.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

    public static Predicate<Student> predicate = student -> student.getGradeLevel() >= 3;
    public static Predicate<Student> predicate1 = student -> student.getGpa() >= 3.9;

    public static BiPredicate<Integer, Double> biPredicate = (gradeLevel, gpa) -> gradeLevel >= 3 && gpa >= 3.9;
    public static BiConsumer<String, List<String>> biConsumer = (name, activities) -> {
        System.out.println(name + " " + activities);
    };
    public static Consumer<Student> consumer = student -> {
        if (biPredicate.test(student.getGradeLevel(), student.getGpa())) {
            biConsumer.accept(student.getName(), student.getActivities());
        }
    };

    public static void printNameAndActivities(List<Student> students) {
        students.forEach(consumer);
    }

    public static void main(String[] args) {
        List<Student> students = StudentDataBase.getAllStudents();
        new PredicateAndConsumerExample().printNameAndActivities(students);
    }
}
