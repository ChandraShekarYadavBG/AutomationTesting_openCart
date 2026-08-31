package com.opencart.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.opencart.pages.CheckoutPage;

public class CheckoutTest {

    @Test
    public void validCheckoutTest() throws Exception {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        // Open application
        driver.get("https://tutorialsninja.com/demo/");

        Thread.sleep(2000);

        CheckoutPage checkoutPage =
                new CheckoutPage(driver);

        // Login
        checkoutPage.clickMyAccount();

        Thread.sleep(1000);

        checkoutPage.clickLogin();

        Thread.sleep(2000);

        checkoutPage.enterEmail("chanduyadav001@kodnest.com");

        checkoutPage.enterPassword("1818181818");

        checkoutPage.clickLoginButton();

        Thread.sleep(3000);


        checkoutPage.clickDesktops();

        Thread.sleep(1000);

        checkoutPage.clickShowAllDesktops();

        Thread.sleep(2000);

        checkoutPage.clickIMac();

        Thread.sleep(2000);

        checkoutPage.clickAddToCart();

        Thread.sleep(2000);

        driver.quit();
    }
}