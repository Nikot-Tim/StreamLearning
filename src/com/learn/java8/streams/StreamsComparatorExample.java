package com.learn.java8.streams;

import com.learn.java8.data.Student;
import com.learn.java8.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsComparatorExample {


//    public static List<Student> printSortedStudentName(){
//        return StudentDataBase.getAllStudents()
//                .stream()
//                .sorted(Comparator.comparing(s -> s.getName().length()).reversed())
//                .collect(Collectors.toList());
//    }

    public static List<Student> printSortedStudentByGpa(){
        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .collect(Collectors.toList());
    }
    public static List<Student> printSortedStudentByGpaDesc(){
        return StudentDataBase.getAllStudents()
                .stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        //printSortedStudentName().forEach(System.out::println);
        System.out.println("----------------------------------");
        printSortedStudentByGpa().forEach(System.out::println);
        System.out.println("----------------------------------");
        printSortedStudentByGpaDesc().forEach(System.out::println);
    }
}
