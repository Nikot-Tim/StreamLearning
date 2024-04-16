package com.learn.java8.functionalinterfaces;

import com.learn.java8.data.Student;
import com.learn.java8.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void nameAndActivities(){
        List<Student> students = StudentDataBase.getAllStudents();
        BiConsumer<String, List<String>> biConsumer = (name, activities) -> System.out.println(name + " : " + activities);
        students.forEach(student -> biConsumer.accept(student.getName(), student.getActivities()));
    }
    public static void main(String[] args) {
        BiConsumer<String, String> biConsumer = (a,b) -> System.out.println("a is: " + a + "; b is: " + b);
        biConsumer.accept("java7", "java8");

        BiConsumer<Integer, Integer> multiplyBiConsumer1 = (a,b) -> System.out.println("a*b is: " + a*b);
        BiConsumer<Integer, Integer> divideBiConsumer1 = (a, b) -> System.out.println("a/b is: " + a/b);

        multiplyBiConsumer1.andThen(divideBiConsumer1).accept(10, 5);

        nameAndActivities();
    }
}
