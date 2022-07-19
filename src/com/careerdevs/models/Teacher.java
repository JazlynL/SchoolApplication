package com.careerdevs.models;

public class Teacher {
    private  int id;
    private String name;
    private long salary;
    private  long salaryEarned;
    public Teacher(int id, String name, long salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public void receieveSalary(int salaryRecieved){
        salaryEarned += salaryRecieved;
        School.updateTotalMoneySpent(salaryRecieved);
    }

    @Override
    public String toString() {
        return "Name of Teachers: " + name;
    }
}
