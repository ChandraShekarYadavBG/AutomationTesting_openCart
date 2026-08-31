package com.opencart.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.opencart.pages.HeaderMenuFooterPage;

public class HeaderMenuFooterTest {

    WebDriver driver;

    @BeforeMethod
    public void setup() throws Exception {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        Thread.sleep(2000);

        driver.get("https://tutorialsninja.com/demo/");

        Thread.sleep(4000);
    }

    @Test
    public void headerMenuFooterTest() throws Exception {

        HeaderMenuFooterPage page =
                new HeaderMenuFooterPage(driver);

        // Verify Logo
        Assert.assertTrue(
                page.isLogoDisplayed(),
                "Logo is not displayed"
        );

        Thread.sleep(1000);

        // Verify Search
        Assert.assertTrue(
                page.isSearchDisplayed(),
                "Search box is not displayed"
        );

        Thread.sleep(1000);

        // Verify Cart
        Assert.assertTrue(
                page.isCartDisplayed(),
                "Cart button is not displayed"
        );

        Thread.sleep(1000);

        // Verify Menu
        Assert.assertTrue(
                page.isMenuDisplayed(),
                "Menu is not displayed"
        );

        Thread.sleep(1000);

        // Verify Footer
        Assert.assertTrue(
                page.isFooterDisplayed(),
                "Footer is not displayed"
        );

        Thread.sleep(2000);

        System.out.println(
                "Header, Menu and Footer elements are displayed successfully."
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