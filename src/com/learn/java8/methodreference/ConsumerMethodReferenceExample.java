package com.learn.java8.methodreference;

import com.learn.java8.data.Student;
import com.learn.java8.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerMethodReferenceExample {

    public static Consumer<Student> studentCons = System.out::println;

    public static Consumer<Student> studentConsumer = Student::printListOfActivities;
    public static Supplier<List<Student>> listSupplier = StudentDataBase::getAllStudents;

    public static void main(String[] args) {
        listSupplier.get().forEach(studentCons);
        listSupplier.get().forEach(studentConsumer);
    }
}
