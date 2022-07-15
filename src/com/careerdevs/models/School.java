package com.careerdevs.models;

import java.util.List;

public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private  int totalMoneyEarned = 0 ;
    private  int totalMoneySpent;

    public School(List<Teacher> teacher, List<Student> student) {
        this.teachers = teacher;
        this.students = student;
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
    public void setTotalMoneyEarned(int totalMoneyEarned) {
        this.totalMoneyEarned += totalMoneyEarned;
    }

    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }


    // the money spent , this function will update it
    // will keep track of the teacher salary.

    public void setTotalMoneySpent(int totalMoneySpent) {

        this.totalMoneySpent -= totalMoneySpent;
    }
}