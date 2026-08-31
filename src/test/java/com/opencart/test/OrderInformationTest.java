package com.opencart.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OrderInformationTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/");
    }

    @Test
    public void orderInformationTest() throws Exception {

        driver.findElement(By.xpath("//span[text()='My Account']")).click();
        driver.findElement(By.linkText("Login")).click();

        driver.findElement(By.id("input-email"))
                .sendKeys("chanduyadav001@kodnest.com");

        driver.findElement(By.id("input-password"))
                .sendKeys("1818181818");

        driver.findElement(By.xpath("//input[@value='Login']")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//span[text()='My Account']")).click();
        driver.findElement(By.linkText("Order History")).click();

        Thread.sleep(2000);

        String pageText = driver.findElement(By.tagName("body")).getText();

        Assert.assertTrue(
                pageText.contains("Order History"),
                "Order History page is not displayed"
        );

        System.out.println("Order Information Test Passed");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}