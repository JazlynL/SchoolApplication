package com.careerdevs.models;

public class Student {
    private int id;
    private String name;
    private int grade;
    private long feesPaid;
    private long teacherSalary;


    public Student() {
    }

    public Student(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        feesPaid = 0;
        this.teacherSalary = 30000;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public long getFeesPaid() {
        return feesPaid;
    }

    public long getTeacherSalary() {
        return teacherSalary;
    }

    public void setGrade(int grade) {

        this.grade = grade;
    }

    public void payFees(long fees) {
        feesPaid += fees;
    }
}
