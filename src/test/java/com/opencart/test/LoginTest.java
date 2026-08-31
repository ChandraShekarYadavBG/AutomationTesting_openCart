package com.opencart.test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.opencart.pages.LoginPage;

public class LoginTest {

    WebDriver driver;
    LoginPage loginPage;

    @BeforeMethod
    public void setUp() throws Exception {

        // Launch Chrome
        driver = new ChromeDriver();

        // Maximize browser
        driver.manage().window().maximize();

        // Open TutorialsNinja OpenCart
        driver.get("https://tutorialsninja.com/demo/");

        Thread.sleep(2000);

        // Create LoginPage object
        loginPage = new LoginPage(driver);
    }

    //  Valid Login
    @Test(priority = 1)
    public void validLoginTest() throws Exception {

        loginPage.clickMyAccount();
        Thread.sleep(2000);

        loginPage.clickLogin();
        Thread.sleep(2000);

        loginPage.enterEmail("chanduyadav001@kodnest.com");
        Thread.sleep(2000);

        loginPage.enterPassword("1234567890");
        Thread.sleep(2000);

        loginPage.clickLoginButton();
        Thread.sleep(3000);

        // Verify successful login
        String actualTitle = driver.getTitle();
        String expectedTitle = "My Account";

        Assert.assertEquals(
                actualTitle,
                expectedTitle,
                "Login was not successful"
        );
    }

    
    // Invalid Password
    @Test(priority = 3)
    public void invalidPasswordTest() throws Exception {

        loginPage.clickMyAccount();
        Thread.sleep(2000);

        loginPage.clickLogin();
        Thread.sleep(2000);

        loginPage.enterEmail("chanduyadav001@kodnest.com");
        loginPage.enterPassword("WrongPassword123");

        loginPage.clickLoginButton();
        Thread.sleep(3000);

        // Verify login was not successful
        Assert.assertNotEquals(
                driver.getTitle(),
                "My Account",
                "Login succeeded with invalid password"
        );
    }

    @AfterMethod
    public void tearDown() throws Exception {
         Thread.sleep(2000);
       
         // Close browser
        if (driver != null) {
            driver.quit();
        }
    }
}