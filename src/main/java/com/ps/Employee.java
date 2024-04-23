package com.ps;

public class Employee {
    private long employeeId;
    private String name;
    private int hoursWorked;
    private int payRate;

    //constructors
    public Employee(int employeeId, String name, int hoursWorked, int payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    //Getters and Setters
    public long getEmployeeId() {
        return this.employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHoursWorked() {
        return this.hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public int getPayRate() {
        return this.payRate;
    }

    public void setPayRate(int payRate) {
        this.payRate = payRate;
    }

    public float calculateGrossPay(){
        return this.hoursWorked * this.payRate;

    }



    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", hoursWorked=" + hoursWorked +
                ", payRate=" + payRate +
                '}';
    }
}
