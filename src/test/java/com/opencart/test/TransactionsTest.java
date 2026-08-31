package com.opencart.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.opencart.pages.TransactionsPage;

public class TransactionsTest {

    WebDriver driver;

    @BeforeMethod
    public void setup() throws Exception {

        driver = new ChromeDriver();

        Thread.sleep(2000);

        driver.manage().window().maximize();

        Thread.sleep(2000);

        driver.get("https://tutorialsninja.com/demo/");

        Thread.sleep(4000);
    }

    @Test
    public void transactionsTest() throws Exception {

        // Click My Account
        driver.findElement(
                By.xpath("//span[text()='My Account']")
        ).click();

        Thread.sleep(2000);

        // Click Login
        driver.findElement(
                By.xpath("//a[contains(text(),'Login')]")
        ).click();

        Thread.sleep(3000);

        // Enter Email
        driver.findElement(
                By.id("input-email")
        ).sendKeys("chanduyadav001@kodnest.com");

        Thread.sleep(1500);

        // Enter Password
        driver.findElement(
                By.id("input-password")
        ).sendKeys("1234567890");

        Thread.sleep(1500);

        // Click Login
        driver.findElement(
                By.xpath("//input[@value='Login']")
        ).click();

        Thread.sleep(4000);

        // Click My Account
        driver.findElement(
                By.xpath("//span[text()='My Account']")
        ).click();

        Thread.sleep(2000);

        // Click Transactions
        driver.findElement(
                By.xpath("//a[contains(text(),'Transactions')]")
        ).click();

        Thread.sleep(4000);

        // Create Transactions Page object
        TransactionsPage transactionsPage =
                new TransactionsPage(driver);

        // Only verify that Transactions page opened
        Assert.assertTrue(
                transactionsPage.isTransactionsPageDisplayed(),
                "Your Transactions page did not open"
        );

        Thread.sleep(2000);

        System.out.println(
                "PASS: Your Transactions page opened successfully."
        );

        Thread.sleep(2000);
    }

    @AfterMethod
    public void tearDown() throws Exception {

        Thread.sleep(3000);

        if (driver != null) {
            driver.quit();
        }
    }
}