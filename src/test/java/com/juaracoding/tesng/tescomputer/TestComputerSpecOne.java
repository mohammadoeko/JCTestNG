package com.juaracoding.tesng.tescomputer;

import com.juaracoding.testng.Computer;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestComputerSpecOne {
    @Test
    public void RamTest() {
        Computer computer = new Computer();
        boolean RAM_OK = computer.RAM_MB >= 256;
        Assert.assertTrue(RAM_OK, "RAM komputer anda kurang dari 256 MB");
    }

    @Test
    public void StorageTest() {
        Computer computer = new Computer();
        boolean Storage_OK = computer.storage_GB >= 64;
        Assert.assertTrue(Storage_OK, "Storage anda kurang dari 64 GB");
    }
}
