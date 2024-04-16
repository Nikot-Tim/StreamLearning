package com.learn.java8.streams;

import com.learn.java8.data.Student;
import com.learn.java8.data.StudentDataBase;

public class StreamMapFilterReduceExample {

    private static int numberOfNoteBooks(){
        return StudentDataBase.getAllStudents()
                .stream()
                .filter(s -> s.getGradeLevel() >= 3 && s.getGender().equals("female"))
                .map(Student::getNoteBooks)
                .reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        System.out.println(numberOfNoteBooks());
    }
}