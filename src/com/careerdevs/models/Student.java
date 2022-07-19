package com.careerdevs.models;

public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feestotal;



    public Student() {
    }

    public Student(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feesPaid=0;
        this.feestotal = 30000;


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

    public void setGrade(int grade) {

        this.grade = grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }


    public int getFeestotal() {
        return feestotal;
    }

    public void payFees(int fees) {
        feesPaid +=fees;
        // making this a static method so we are able
        // to access the method outside the class
        // then we set the method within the pay fees method
        // this allows you to update the total money earned
        // and keep track of how much the students paid.

        School.updateTotalMoneyEarned(feesPaid);
    }
    // determines how much a student owes.
     public int getRemainingStudentFees(){
       return feestotal-=feesPaid;
     }

    @Override
    public String toString() {
        return
                " Student's id :" + id +
                " Student's name : " + name + '\'' +
                " Student's grade: " + grade +
                " Total fees paid so far: " + feesPaid;
    }
}
