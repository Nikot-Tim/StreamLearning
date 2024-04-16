package com.learn.java8.functionalinterfaces;

import com.learn.java8.data.Student;
import com.learn.java8.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void printName(){
        System.out.println("printName");
        Consumer<Student> studentCons = System.out::println;
        List<Student> allStudents = StudentDataBase.getAllStudents();
        allStudents.forEach(studentCons);
    }

    public static void printNameAndActivities(){
        System.out.println("printNameAndActivities");
        Consumer<Student> studentCons = (student) -> System.out.print(student.getName());
        Consumer<Student> studentCons1 = (student) -> System.out.println(student.getActivities());
        List<Student> allStudents = StudentDataBase.getAllStudents();

        allStudents.forEach(studentCons.andThen(studentCons1));
    }

    public static void printNameAndActivitiesUsingCondition(){
        System.out.println("printNameAndActivitiesUsingCondition");
        Consumer<Student> studentCons = (student) -> System.out.print(student.getName());
        Consumer<Student> studentCons1 = (student) -> System.out.println(student.getActivities());
        List<Student> allStudents = StudentDataBase.getAllStudents();
        allStudents.stream().filter((s) -> s.getGradeLevel() >= 3 && s.getGpa() >= 3.9).forEach(studentCons.andThen(studentCons1));

    }

    public static void main(String[] args) {
        Consumer<String> consumer = s -> System.out.println(s.toUpperCase());
        consumer.accept("java8");
        printName();
        printNameAndActivities();
        printNameAndActivitiesUsingCondition();
    }
}
