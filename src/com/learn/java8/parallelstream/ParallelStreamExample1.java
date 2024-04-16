package com.learn.java8.parallelstream;

import com.learn.java8.data.Student;
import com.learn.java8.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamExample1 {

    public static List<String> printDistinctSortedStudentActivities(){

        long startTime = System.currentTimeMillis();

        List<String> res = StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        long endTime = System.currentTimeMillis();
        System.out.println("printDistinctSortedStudentActivities execution time = " + (endTime-startTime));

        return res;
    }

    public static List<String> printDistinctSortedStudentActivitiesParallel(){
        long startTime = System.currentTimeMillis();
        List<String> res = StudentDataBase.getAllStudents().stream()
                .parallel()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        long endTime = System.currentTimeMillis();
        System.out.println("printDistinctSortedStudentActivitiesParallel execution time = " + (endTime-startTime));
        return res;
    }

    public static void main(String[] args) {
        System.out.println(printDistinctSortedStudentActivities());
        System.out.println(printDistinctSortedStudentActivitiesParallel());
    }
}
