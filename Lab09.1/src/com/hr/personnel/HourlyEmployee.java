package com.hr.personnel;

import gov.irs.TaxPayer;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    private double rate;
    private double hours;

    public HourlyEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {
        this(name, hireDate);
        setRate(rate);
        setHours(hours);
    }

    @Override
    public void pay() {
        System.out.println(getName() + " is paid $" + (getRate() * getHours()));
    }

    @Override
    public void payTaxes() {
        System.out.println(getName() + " paid " + ((getHours() * getRate()) * TaxPayer.HOURLY_TAX_RATE) + " in taxes");
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    public String toString() {
        return super.toString() + " Hours: " + getHours() + " Rate: " + getRate();
    }
}