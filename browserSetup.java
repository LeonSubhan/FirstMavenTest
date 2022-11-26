package com.izaanschool;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class browserSetup {

    WebDriver dr;

    @BeforeAll
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();

    }

    @BeforeEach
    public void setupTest() {
        dr = new ChromeDriver();


    }

    @AfterEach
    public void tearDown() throws InterruptedException {
        Thread.sleep(500);
        dr.quit();
    }

    @Test
    public void browserTest() {
        dr.get("https://www.google.com/");
        String url = dr.getTitle();
        System.out.println(url);


    }

    @Test
    public void browserTest1() {
        dr.get("https://www.izaanschool.com/");
        String url = dr.getTitle();
        System.out.println(url);
    }
}
