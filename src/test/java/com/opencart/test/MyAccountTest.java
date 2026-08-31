package com.opencart.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MyAccountTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://tutorialsninja.com/demo/");
    }

    @Test
    public void myAccountTest() throws Exception {

        // Click My Account
        driver.findElement(By.xpath("//span[text()='My Account']")).click();

        // Click Login
        driver.findElement(By.linkText("Login")).click();

        // Enter username/email
        driver.findElement(By.id("input-email"))
                .sendKeys("chanduyadav001@kodnest.com");

        // Enter password
        driver.findElement(By.id("input-password"))
                .sendKeys("1818181818");

        // Click Login button
        driver.findElement(By.xpath("//input[@value='Login']")).click();

        // Wait for page to load
        Thread.sleep(2000);

        // Verify My Account heading
        String actualHeading = driver
                .findElement(By.xpath("//h2[text()='My Account']"))
                .getText();

        Assert.assertEquals(
                actualHeading,
                "My Account",
                "My Account page is not displayed"
        );

        System.out.println("My Account page is displayed successfully");
    }

    @AfterMethod
    public void tearDown() {

        driver.quit();
    }
}