package com.juaracoding.tesng;

import com.juaracoding.testng.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCalculatorTwo {

    Calculator calculator;
    int a,b;

    @BeforeMethod
    public void setUp() {
        calculator = new Calculator();          //Digunakan untuk instanse denga before method
        a = 10;
        b = 5;
    }

    @Test
    @Parameters({"angkaPertama", "angkaKedua"})
    public void tesAdd(int angkaPertama, int angkaKedua) {
        calculator = new Calculator();
        int actual = calculator.add(angkaPertama, angkaKedua);
        int expect = 15;
        Assert.assertEquals(actual, expect, "Kalkulator tidak dapat menghitung penjumlahan dengan benar.");
    }

    @Test
    @Parameters({"angkaPertama", "angkaKedua"})
    public void tesSubstract(int angkaPertama, int angkaKedua) {
//        calculator = new Calculator();
        int actual = calculator.substract(angkaPertama, angkaKedua);
        int expect = 5;
        Assert.assertEquals(actual, expect, "Kalkulator tidak dapat menghitung pengurangan dengan benar");
    }

    @Test
    public void tesMultiply() {
//        calculator = new Calculator();
        int actual = calculator.multiply(2, 3);     // actual dibuat oleh Programmer dan expect ditulis oleh QA
        int expect = 6;
        Assert.assertEquals(actual, expect, "Kalkulator tidak dapat menghitung perkalian dengan benar");
//        Assert.assertEquals(calculator.multiply(2, 3), 6);
    }

    @Test
    public void testAssertTrue() {
//        boolean angka = 16 > 16;
//        Assert.assertTrue(angka);

//        String actual = "Data berhasil disimpan";
//        String expect = "Data berhasil disimpan";
//        Assert.assertTrue(actual.equals(expect));

        String actual = "Data berhasil disimpan";
        String expect = "berhasil";
        Assert.assertTrue(actual.contains(expect));         // contains digunakan jika teks banyak (disingkat) dan berhasil, sedangkan equals digukan jika actual harus sesuai expect
    }

}
