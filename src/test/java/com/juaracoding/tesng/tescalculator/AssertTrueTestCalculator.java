package com.juaracoding.tesng.tescalculator;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrueTestCalculator {

    @Test
    public void tesAdd() {
        int angka = 21;
        boolean actual = angka > 16;        //Untuk assert true hanya bernilai true

        Assert.assertTrue(actual, "Computer tidak bisa membedakan besar dan kecil");
    }
}
