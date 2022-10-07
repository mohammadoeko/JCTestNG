package com.juaracoding.tesng.sample;

import com.juaracoding.testng.sample.CalculationSalary;
import com.juaracoding.testng.sample.Employee;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCalculationSalary {

    Employee employee;

    CalculationSalary calculationSalary;

    @BeforeMethod
    public void setUp() {
        employee = new Employee();
        calculationSalary = new CalculationSalary();
    }

    @Test
    public void testCalculateTax() {
        employee.setName("Eko");
        employee.setSalary(8000);
        employee.setTax(10);

        double actual = calculationSalary.calculateTax(employee);
        Assert.assertEquals(actual, 7200.0);
    }

    @Test
    public void testCalculateTaxTwo() {
        employee.setName("Eko");
        employee.setSalary(6000);
        employee.setTax(10);

        double actual = calculationSalary.calculateTax(employee);
        Assert.assertEquals(actual, 6000.0);
    }

    @Test
    public void testGetEmployeeName() {
        employee.setName("Eko");
        employee.setSalary(6000);
        employee.setTax(10);

        String actual = employee.getName();
        Assert.assertEquals(actual, "Eko");
    }

    @Test
    public void testGetEmployeeSalary() {
        employee.setName("Eko");
        employee.setSalary(6000);
        employee.setTax(10);

        double actual = employee.getSalary();
        Assert.assertEquals(actual, 6000.0);
    }

    @Test
    public void testGetEmployeeTax() {
        employee.setName("Eko");
        employee.setSalary(6000);
        employee.setTax(10);

        double actual = employee.getTax();
        Assert.assertEquals(actual, 10.0);
    }

}
