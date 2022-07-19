package com.careerdevs;

import com.careerdevs.models.School;
import com.careerdevs.models.Student;
import com.careerdevs.models.Teacher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {



    public static void main(String [] args){
        Teacher hayley = new Teacher(23,"Hayley", 49000);
        Teacher leticia  = new Teacher(16,"Leticia",56000);
        Teacher vivian = new Teacher(23,"Vivian",98000);
        List<Teacher> teacherList = new ArrayList<>();
        teacherList.addAll(List.of(new Teacher[]{hayley,leticia,vivian}));

        // how you add it in a list array
        Student jamie= new Student(2,"Jamie",9);
        Student ericka = new Student(4,"Ericka",10);
        Student josh = new Student(1,"Josh",12);
       // how to instantiate an array from the new student class,
        List<Student> studentList = new ArrayList<>(List.of(new Student[]{jamie, ericka, josh}));
        School ghs = new School(teacherList,studentList);


        jamie.payFees(6000);
        ericka.payFees(8900);
        josh.payFees(10000);
        System.out.println("GHS has earned  a total from student payments: "+ ghs.moneyFormat(ghs.getTotalMoneyEarned()));


        System.out.println("---School Salary---");
        hayley.receieveSalary((int) hayley.getSalary());
        leticia.receieveSalary((int)leticia.getSalary());
        vivian.receieveSalary((int) vivian.getSalary());

        StringBuilder stringBuilder = new StringBuilder();
        for (Teacher teacher:teacherList) {
            // how to have a string output and add a space.
            stringBuilder.append(teacher.getName()).append(" ");


        }
        System.out.println("GHS has spent a salary for all of these teachers: "+ stringBuilder +"and now the school has earned:  "+ghs.moneyFormat( ghs.getTotalMoneyEarned()));



        System.out.println("Ghs has spent a total of on school salary :  "+ ghs.moneyFormat(ghs.getTotalMoneySpent()));
        System.out.println(ericka);





    }
}
