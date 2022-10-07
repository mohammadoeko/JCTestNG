package com.juaracoding.tesng.tescalculator;

import com.juaracoding.testng.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCalculatorDependsOnMethods {

    @Test(dependsOnMethods = {"addTest"})       //jika method addtest gagal akan diskip jika menggunakan multiplyTest() dan menjalankan addtes dahulu
    public void multiplyTest() {

        Calculator calculator = new Calculator();
        int actual = calculator.multiply(2,3);

        int expected = 6;
        System.out.println("Menguji mmethod multiply().");
        Assert.assertEquals(actual, expected, "Kalkulatorr tidak dapat menghitung perkalian dengan benar");
    }

    @Test
    public void addTest() {
        Calculator calculator = new Calculator();
        int actual = 141; //calculator.add(12,34);
        int expected = 46;

        System.out.println("Menguji method add().");
        Assert.assertEquals(actual, expected, "Kalkulator tidak dapat menghitung penjumlahan dengan benar");
    }

    @Test
    public void subtractTest() {

        Calculator calculator = new Calculator();
        int actual = calculator.substract(12,34);
        int expeted = -22;

        System.out.println("Menguji method subtract().");
        Assert.assertEquals(actual, expeted, "Kalkulator tidak dapat menghitung pengurangan dengan benar");
    }
}
