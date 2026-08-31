package com.opencart.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.opencart.pages.LoginPage;

public class LogoutTest {

    WebDriver driver;
    LoginPage loginPage;

    @BeforeMethod
    public void setUp() throws Exception {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://tutorialsninja.com/demo/");

        Thread.sleep(2000);

        loginPage = new LoginPage(driver);
    }

    // Logout from the user account
    @Test
    public void logoutTest() throws Exception {

        // Login first
        loginPage.clickMyAccount();
        Thread.sleep(2000);

        loginPage.clickLogin();
        Thread.sleep(2000);

        loginPage.enterEmail("chanduyadav001@kodnest.com");
        loginPage.enterPassword("1234567890");

        loginPage.clickLoginButton();
        Thread.sleep(3000);

        // Click Logout
        driver.findElement(By.linkText("Logout")).click();
        Thread.sleep(3000);

        // Verify logout
        Assert.assertTrue(
                driver.getTitle().contains("Account"),
                "Logout was not successful"
        );
    }

    @AfterMethod
    public void tearDown() throws Exception {

        Thread.sleep(2000);

        if (driver != null) {
            driver.quit();
        }
    }
}