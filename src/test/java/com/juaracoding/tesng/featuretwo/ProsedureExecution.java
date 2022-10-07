package com.juaracoding.tesng.featuretwo;

import org.testng.annotations.*;

public class ProsedureExecution {

    @BeforeClass                //Contoh buka browser
    public void beforeClass() {
        System.out.println("Before Class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method");
    }

    @AfterMethod                //Digunakan untuk screenshot dan diulang
    public void afterMethod() {
        System.out.println("After Method");
    }

    @AfterClass                 //Tutup browser
    public void afterClass() {
        System.out.println("After Class");
    }

    @Test(priority = 1)
    public void testOne() {
        System.out.println("Test One");
    }

    @Test(enabled = false, priority = 2)
    public void testTwo() {
        System.out.println("Test Two");
    }

    @Test(priority = 3)
    public void testThree() {
        System.out.println("Test Three");
    }

}


/*

Before Class

Before Method
Test One
After Method

Before Method
Test Two
After Method

After Class

 */
