package com.hr.personnel;

import java.time.LocalDate;

public class Executive extends SalariedEmployee {

    public Executive() {
        super();
    }

    public Executive(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public Executive(String name, LocalDate hireDate, double salary) {
        super(name, hireDate, salary);
    }

    @Override // interface TaxPayer (default method)
    public void fileReturn() {
        System.out.println("Return filed electronically");
    }

    @Override
    public double getStandardDeduction() {
        return getSalary() / 2;
    }

    // business methods
    @Override
    public void work() {
        System.out.println(getName() + " is enjoying  a nice round of golf.");
    }
}