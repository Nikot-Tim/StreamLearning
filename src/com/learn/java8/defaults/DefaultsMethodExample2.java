package com.learn.java8.defaults;

import com.learn.java8.data.Student;
import com.learn.java8.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultsMethodExample2 {

    public static Consumer<Student> studentConsumer = System.out::println;
    public static Comparator<Student> studentComparatorByName = Comparator.comparing(Student::getName);

    public static Comparator<Student> studentComparatorByGpa = Comparator.comparingDouble(Student::getGpa);
    public static Comparator<Student> studentComparatorByGradeLevel = Comparator.comparingInt(Student::getGradeLevel).reversed();

    public static void sortByName(List<Student> students){
        students.sort(studentComparatorByName);
    }

    public static void sortByGpa(List<Student> students){
        students.sort(studentComparatorByGpa);
    }

    public static void comparatorChain(List<Student> students){
        students.sort(studentComparatorByGradeLevel.thenComparing(studentComparatorByName));
    }

    public static void sortWithNullValues(List<Student> students){
        students.sort(Comparator.nullsFirst(studentComparatorByGradeLevel).thenComparing(studentComparatorByName));
    }

    public static void main(String[] args) {
        List<Student> allStudents = StudentDataBase.getAllStudents();
        System.out.println("Before sort");
        allStudents.forEach(studentConsumer);
//
//        sortByName(allStudents);
//
//        System.out.println("After sort");
//        allStudents.forEach(studentConsumer);
//
//        sortByGpa(allStudents);
//
//        System.out.println("After sort by gpa");
//        allStudents.forEach(studentConsumer);
//
//        comparatorChain(allStudents);
//
//        System.out.println("After comparator chain");
//        allStudents.forEach(studentConsumer);

        sortWithNullValues(allStudents);

        System.out.println("After comparator with null values");
        allStudents.forEach(studentConsumer);
    }
}
