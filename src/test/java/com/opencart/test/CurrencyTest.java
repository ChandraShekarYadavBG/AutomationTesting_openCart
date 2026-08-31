package com.opencart.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.opencart.pages.CurrencyPage;

public class CurrencyTest {

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
    public void currencyTest() throws Exception {

        CurrencyPage currencyPage = new CurrencyPage(driver);

        // Get product price before currency change
        String priceBefore = currencyPage.getProductPrice();

        System.out.println("Price before currency change: " + priceBefore);

        Thread.sleep(2000);

        // Click currency dropdown
        currencyPage.clickCurrencyDropdown();

        Thread.sleep(2000);

        // Select Euro
        currencyPage.selectEuro();

        Thread.sleep(3000);

        // Get product price after currency change
        String priceAfter = currencyPage.getProductPrice();

        System.out.println("Price after currency change: " + priceAfter);

        Thread.sleep(2000);

        // Verify currency has changed
        Assert.assertNotEquals(
                priceBefore,
                priceAfter,
                "Currency was not changed"
        );

        System.out.println("Currency changed successfully.");

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