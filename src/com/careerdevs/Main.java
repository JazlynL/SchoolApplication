package com.careerdevs;

import com.careerdevs.models.School;
import com.careerdevs.models.Student;
import com.careerdevs.models.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static ArrayList<Teacher> teachers;
    private static ArrayList<Student> students;

    public static void main(String [] args){

        teachers = new ArrayList<>();
        Teacher teacher1 = new Teacher(23,"Hayley", 35000);
        Teacher teacher2  = new Teacher(16,"Leticia",56000);
        Teacher teacher3 = new Teacher(23,"Vivian",98000);


        // how you add it in a list array
        teachers.addAll(List.of(new Teacher[]{teacher1,teacher2,teacher3}));


        students = new ArrayList<>();
        Student student1 = new Student(2,"Jamie",9);
        Student student2 = new Student(4,"Ericka",10);
        Student student3 = new Student(1,"Josh",12);

        students.addAll(List.of(new Student[]{student1,student2,student3}));


        School ghs = new School(teachers,students);
    }
}
