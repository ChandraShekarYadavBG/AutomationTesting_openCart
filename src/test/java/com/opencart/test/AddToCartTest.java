package com.opencart.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddToCartTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp() throws Exception {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://tutorialsninja.com/demo/");

        Thread.sleep(3000);
    }

    // Add a valid product to cart
    @Test
    public void addToCartTest() throws Exception {

        // Click MacBook
        driver.findElement(By.linkText("MacBook")).click();

        Thread.sleep(3000);

        // Click Add to Cart
        driver.findElement(By.id("button-cart")).click();

        Thread.sleep(3000);

        // Get success message
        String message = driver.findElement(By.cssSelector(".alert-success")).getText();

        System.out.println("Success Message: " + message);

        // Verify success message
        Assert.assertTrue(
                message.contains("Success"),
                "Product was not added to cart"
        );

        Thread.sleep(2000);
    }

    // Verify add-to-cart validation
    @Test
    public void addToCartValidationTest() throws Exception {

        // Click MacBook
        driver.findElement(By.linkText("MacBook")).click();

        Thread.sleep(3000);

        // Click Add to Cart
        driver.findElement(By.id("button-cart")).click();

        Thread.sleep(3000);

        // Get validation message
        String message = driver.findElement(By.cssSelector(".alert-success")).getText();

        System.out.println("Validation Message: " + message);

        // Verify message
        Assert.assertTrue(
                message.contains("Success"),
                "Add to cart validation message was not displayed"
        );

        Thread.sleep(2000);
    }

    @AfterMethod
    public void tearDown() throws Exception {

        Thread.sleep(2000);

        if (driver != null) {
            driver.quit();
        }
    }
}