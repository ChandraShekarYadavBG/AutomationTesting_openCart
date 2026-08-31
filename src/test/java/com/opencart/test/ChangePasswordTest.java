package com.opencart.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencart.pages.ChangePasswordPage;

public class ChangePasswordTest {

    @Test
    public void invalidChangePasswordTest() throws Exception {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        // Open application
        driver.get("https://tutorialsninja.com/demo/");

        Thread.sleep(2000);

        ChangePasswordPage passwordPage =
                new ChangePasswordPage(driver);

        // Login
        passwordPage.clickMyAccount();

        Thread.sleep(1000);

        passwordPage.clickLogin();

        Thread.sleep(2000);

        passwordPage.enterEmail("chanduyadav001@kodnest.com");

        passwordPage.enterPassword("1234567890");

        passwordPage.clickLoginButton();

        Thread.sleep(3000);

        // Click Password
        passwordPage.clickChangePassword();

        Thread.sleep(2000);

        // Enter invalid password details
        passwordPage.enterNewPassword("1818181818");

        passwordPage.enterConfirmPassword("1818181818");

        Thread.sleep(1000);

        passwordPage.clickContinue();

        Thread.sleep(2000);

        // Verify validation message
        String pageText = driver.findElement(By.tagName("body")).getText();

        System.out.println("Actual Result: " + pageText);

        Assert.assertTrue(
                pageText.toLowerCase().contains("password"),
                "Expected password validation message was not displayed"
        );

        driver.quit();
    }
}