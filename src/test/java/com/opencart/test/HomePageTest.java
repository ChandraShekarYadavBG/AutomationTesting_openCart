package com.opencart.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencart.pages.HomePage;

public class HomePageTest {

    @Test
    public void homePageTest() throws Exception {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        // Open application
        driver.get("https://tutorialsninja.com/demo/");

        Thread.sleep(2000);

        // Create Page Object
        HomePage homePage = new HomePage(driver);

        // Verify Home Page
        Assert.assertTrue(
                homePage.isLogoDisplayed(),
                "Home page did not load successfully"
        );

        System.out.println("Home Page loaded successfully");

        driver.quit();
    }
}