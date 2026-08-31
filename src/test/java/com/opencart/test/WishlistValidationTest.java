package com.opencart.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WishlistValidationTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://tutorialsninja.com/demo/");
    }

    @Test
    public void wishlistValidationTest() throws Exception {

        // Make sure user is logged out
        driver.findElement(By.xpath("//span[text()='My Account']")).click();

        // Click Login
        driver.findElement(By.linkText("Login")).click();

        Thread.sleep(1000);

        // Go back to home page without logging in
        driver.get("https://tutorialsninja.com/demo/");

        // Open a product
        driver.findElement(By.linkText("MacBook")).click();

        Thread.sleep(1000);

        // Click Add to Wish List
        driver.findElement(
                By.xpath("//button[@data-original-title='Add to Wish List']")
        ).click();

        Thread.sleep(2000);

        // Click Wishlist
        driver.findElement(By.id("wishlist-total")).click();

        Thread.sleep(2000);

        // Check current URL
        String currentUrl = driver.getCurrentUrl();

        // Expected: guest should be redirected to login page
        boolean redirectedToLogin = currentUrl.contains("account/login");

        Assert.assertTrue(
                redirectedToLogin,
                "Guest user was not redirected to Login page"
        );

        System.out.println("Guest user was redirected to Login page.");
    }

    @AfterMethod
    public void tearDown() {

        driver.quit();
    }
}