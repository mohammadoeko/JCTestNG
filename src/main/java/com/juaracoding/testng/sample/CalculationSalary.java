package com.juaracoding.testng.sample;

public class CalculationSalary {

    public double calculateTax(Employee employee) {
        double resultSalary = 0;

        if (employee.getSalary() > 7000){
           double resultTax = employee.getSalary() * employee.getTax()/100;
            resultSalary = employee.getSalary() - resultTax;
        } else {
            resultSalary = employee.getSalary();
        }

        return resultSalary;
    }
}
