package com.learn.java8.streams.terminal;

import com.learn.java8.data.Student;
import com.learn.java8.data.StudentDataBase;

import java.util.*;

import static java.util.stream.Collectors.*;

public class StreamsGroupingByExample {

    public static void groupStudentsByGender() {
        Map<String, List<Student>> studentMap =
                StudentDataBase.getAllStudents().stream()
                        .collect(groupingBy(Student::getGender));
        System.out.println(studentMap);
    }

    public static void groupStudentsByGpa() {
        Map<String, List<Student>> studentMap =
                StudentDataBase.getAllStudents().stream()
                        .collect(groupingBy(s -> s.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE"));
        System.out.println(studentMap);
    }

    public static void twoLevelGrouping_1() {
        Map<Integer, Map<String, List<Student>>> studentMap =
                StudentDataBase.getAllStudents().stream()
                        .collect(groupingBy(Student::getGradeLevel, groupingBy(s -> s.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE")));
        System.out.println(studentMap);
    }

    public static void twoLevelGrouping_2() {
        Map<String, Integer> studentMap =
                StudentDataBase.getAllStudents().stream()
                        .collect(groupingBy(Student::getName, summingInt(Student::getNoteBooks)));
        System.out.println(studentMap);
    }

    public static void threeLevelGrouping_1() {
        LinkedHashMap<String, Set<Student>> studentMap =
                StudentDataBase.getAllStudents().stream()
                        .collect(groupingBy(Student::getName, LinkedHashMap::new, toSet()));
        System.out.println(studentMap);
    }

    public static void calculateTopGpa() {
        Map<Integer, Optional<Student>> studentMap =
                StudentDataBase.getAllStudents().stream()
                        .collect(groupingBy(Student::getGradeLevel, maxBy(Comparator.comparing(Student::getGpa))));
        System.out.println(studentMap);
        Map<Integer, Student> studentMap_2 =
                StudentDataBase.getAllStudents().stream()
                        .collect(
                                groupingBy(Student::getGradeLevel,
                                        collectingAndThen(maxBy(Comparator.comparing(Student::getGpa)), Optional::get)));
        System.out.println(studentMap_2);
    }

    public static void calculateLeastGpa() {
        Map<Integer, Optional<Student>> studentMap =
                StudentDataBase.getAllStudents().stream()
                        .collect(groupingBy(Student::getGradeLevel, minBy(Comparator.comparing(Student::getGpa))));
        System.out.println(studentMap);
        Map<Integer, Student> studentMap_2 =
                StudentDataBase.getAllStudents().stream()
                        .collect(
                                groupingBy(Student::getGradeLevel,
                                        collectingAndThen(minBy(Comparator.comparing(Student::getGpa)), Optional::get)));
        System.out.println(studentMap_2);
    }

    public static void main(String[] args) {
        groupStudentsByGender();
        groupStudentsByGpa();
        twoLevelGrouping_1();
        twoLevelGrouping_2();
        threeLevelGrouping_1();
        calculateTopGpa();
        calculateLeastGpa();
    }
}
