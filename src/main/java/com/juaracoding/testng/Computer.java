package com.juaracoding.testng;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    public String OS = "Windows XP";
    public List<String> appList = new ArrayList<String>() {
        {
            add("Microsoft Word");
            add("Opera");
            add("Mozilla Firefox");
            add("Google Chrome");
            add("Pinball");
            add("Spider Solitaire");
            add("Smadav");
            add("Internet Explorer");
            add("Notepad");
        }
    };
    public double RAM_MB = 1024;
    public double storage_GB = 128;
}
