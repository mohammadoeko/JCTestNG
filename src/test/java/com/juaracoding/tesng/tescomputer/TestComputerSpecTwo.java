package com.juaracoding.tesng.tescomputer;

import com.juaracoding.testng.Computer;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestComputerSpecTwo {

    @Test
    public void OSTest() {

        Computer computer = new Computer();

        String computerOs = computer.OS;
        String required = "Windows XP";
        Assert.assertEquals(computerOs, required, "OS pada omputer anda bukan windows xp");
    }

    @Test
    public void browserTest() {
        Computer computer = new Computer();

        boolean browserExist = computer.appList.contains("Opera") ||
                computer.appList.contains("Mozilla Firefox") ||
                computer.appList.contains("Internet Explorer") ||
                computer.appList.contains("Google Chrome");
        Assert.assertTrue(browserExist, "Komputer anda tidak memiliki browser");
    }
}
