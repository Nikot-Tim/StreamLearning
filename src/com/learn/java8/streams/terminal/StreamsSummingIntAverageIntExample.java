package com.learn.java8.streams.terminal;

import com.learn.java8.data.Student;
import com.learn.java8.data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamsSummingIntAverageIntExample {

    public static int summingIntEx(){
        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.summingInt(Student::getNoteBooks));
    }

    public static double averagingIntExample(){
        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.averagingInt(Student::getNoteBooks));
    }

    public static void main(String[] args) {
        System.out.println(summingIntEx());
        System.out.println(averagingIntExample());
    }
}
