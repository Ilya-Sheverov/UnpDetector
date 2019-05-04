package com.company;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        UnpReader read = new UnpReader();
       List un = read.fun();
        for (Object u : un) {
            Webdriver Web = new Webdriver();
            Webdriver.driverGo((String) u);
        }
    }
}
