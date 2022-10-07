package com.juaracoding.tesng;

import com.juaracoding.testng.Calculator;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestCalculator {

    @Test(priority = 1)
    public void tesAdd() {
        Calculator calculator = new Calculator();
        int actual = calculator.add(10, 5);
        int expect = 15;
        Assert.assertEquals(actual, expect, "Kalkulator tidak dapat menghitung penjumlahan dengan benar.");
    }

    @Test(priority = 3)
    public void tesSubstract() {
        Calculator calculator = new Calculator();
        int actual = calculator.substract(10, 5);
        int expect = 5;
        Assert.assertEquals(actual, expect, "Kalkulator tidak dapat menghitung pengurangan dengan benar");
    }

    @Test(priority = 2)
    public void tesMultiply() {
        Calculator calculator = new Calculator();
        int actual = calculator.multiply(2, 3);
        int expect = 6;
        Assert.assertEquals(actual, expect, "Kalkulator tidak dapat menghitung perkalian dengan benar");
    }

    @Test
    @Parameters("angka")             //Memberikan parameter
    public void testAssertTrue(String text) {
//        boolean angka = 16 > 16;
//        Assert.assertTrue(angka);

//        String actual = "Data berhasil disimpan";
//        String expect = "Data berhasil disimpan";
//        Assert.assertTrue(actual.equals(expect));

        String actual = "Data berhasil disimpan";
        String expect = "berhasil";
        System.out.println(text);
        Assert.assertTrue(actual.contains(expect));         // contains digunakan jika teks banyak (disingkat) dan berhasil, sedangkan equals digukan jika actual harus sesuai expect
    }

//    @BeforeMethod
//    public void beforeMethod() {
//        System.out.println("Menjalankan Before Method");
//    }
//
//    @AfterMethod
//    public void afterMethod() {
//        System.out.println("Menjalankan After Method");
//    }
//
//    @BeforeClass
//    public void beforeClass() {
//        System.out.println("Menjalankan Before Class");
//    }
//
//    @AfterClass
//    public void afterClass() {
//        System.out.println("Menjalankan After Class");
//    }
//
//    @BeforeTest
//    public void beforeTest() {
//        System.out.println("Menjalankan Before Test");
//    }
//
//    @AfterTest
//    public void afterTest() {
//        System.out.println("Menjalankan After Test");
//    }
//
//    @BeforeSuite
//    public void beforeSuite() {
//        System.out.println("Menjalankan Before Suite");
//    }
//
//    @AfterSuite
//    public void afterSuite() {
//        System.out.println("Menjalankan After Suite");
//    }
}
