package com.careerdevs.models;

import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    public School(List<Teacher> teacher, List<Student> student) {
        this.teachers = teacher;
        this.students = student;
        totalMoneyEarned=0;
        totalMoneySpent=0;
    }

    public List<Teacher> getTeacher() {
        return teachers;
    }

    /* adds a teacher  */
    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }
    public List<Student> getStudent() {
        return students;
    }

    /*adds a student
    */
    public void addStudent(Student student){
        students.add(student);

    }

    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }
  // using concat operator because it  will add all the money earned by the school


    public static void updateTotalMoneyEarned(int totalMoneyEarned) {
        School.totalMoneyEarned += totalMoneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }


    // the money spent , this function will update it
    // will keep track of the teacher salary.

    public static void updateTotalMoneySpent(int totalMoneySpent) {

      School.totalMoneySpent -= totalMoneySpent;
    }
    public String moneyFormat(int money){
       String currencyForSchool =  NumberFormat.getCurrencyInstance(Locale.US).format(money);
       return currencyForSchool;
    }
}
