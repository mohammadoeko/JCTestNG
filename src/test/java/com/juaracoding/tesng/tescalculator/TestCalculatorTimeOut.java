package com.juaracoding.tesng.tescalculator;

import com.juaracoding.testng.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCalculatorTimeOut {

    @Test(timeOut = 3)       //Akan menjalankan test dengan waktu 3 milisecond. Jika dibawah 3 milisecond maka akan dianggap gagal
    public void multiplyTest() {

        Calculator calculator = new Calculator();
        int actual = calculator.multiply(2,3);

        int expected = 6;
        System.out.println("Menguji mmethod multiply().");
        Assert.assertEquals(actual, expected, "Kalkulatorr tidak dapat menghitung perkalian dengan benar");
    }

    @Test(timeOut = 200)
    public void addTest() throws Exception{
        Calculator calculator = new Calculator();
        int actual = calculator.add(12,34);
        int expected = 46;
        Thread.sleep(400);                  //Akan gagal karena waktu timeout yang diberikan 200 milisecond sedangkan terdapat sleep 400 milisecond

        System.out.println("Menguji method add().");
        Assert.assertEquals(actual, expected, "Kalkulator tidak dapat menghitung penjumlahan dengan benar");
    }

    @Test(timeOut = 3)
    public void subtractTest() {

        Calculator calculator = new Calculator();
        int actual = calculator.substract(12,34);
        int expeted = -22;

        System.out.println("Menguji method subtract().");
        Assert.assertEquals(actual, expeted, "Kalkulator tidak dapat menghitung pengurangan dengan benar");
    }
}
