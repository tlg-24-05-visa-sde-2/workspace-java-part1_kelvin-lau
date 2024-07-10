package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {
    private double salary;

    public SalariedEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
        // registerIn401k();
    }

    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        this(name, hireDate);
        setSalary(salary);
    }

    // action or business methods
    @Override
    public void pay() {
        System.out.println(getName() + " is paid $" + getSalary());
    }

    public void takeVacation() {
        System.out.println(getName() + " is taking vacation");
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return super.toString() + getHireDate() + ", Salary: " + getSalary();
    }
}