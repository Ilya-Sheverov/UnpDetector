package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.*;
import java.lang.*;

public class Webdriver {
    public static void driverGo(String u) {
        UnpWrite w = new UnpWrite();
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://bankrot.gov.by/Debtors/DebtorsList");
            WebElement element = driver.findElement(By.id("filterUnp"));
            element.sendKeys(u);
            Thread.sleep(2000);
            element = driver.findElement(By.cssSelector(".btn.search-button"));
            element.click();
            Thread.sleep(2000);
            try {
            element = driver.findElement(By.cssSelector("a[href*=\"Debtors/DebtorItem\"]"));
               // element.click();
                w.wr(u+"=doljnik");
            }
            catch (Exception R) {
                w.wr(u+"=Nedoljnik");
            }
            driver.close();
            System.out.println("Драйвер закрыт");
        }
        catch (Exception e) {
        System.out.println("Что-то пошло не так, Сэр");
        driver.close();
        }
    }
}
