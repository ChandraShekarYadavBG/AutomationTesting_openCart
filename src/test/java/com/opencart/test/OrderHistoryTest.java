package com.opencart.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencart.pages.OrderHistoryPage;

public class OrderHistoryTest {

    @Test
    public void orderHistoryTest() throws Exception {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        // Open application
        driver.get("https://tutorialsninja.com/demo/");

        Thread.sleep(2000);

        OrderHistoryPage orderPage =
                new OrderHistoryPage(driver);

        // Login
        orderPage.clickMyAccount();

        Thread.sleep(1000);

        orderPage.clickLogin();

        Thread.sleep(2000);

        orderPage.enterEmail("chanduyadav001@kodnest.com");
        orderPage.enterPassword("1818181818");

        orderPage.clickLoginButton();

        Thread.sleep(3000);

        // Click Order History
        orderPage.clickOrderHistory();

        Thread.sleep(2000);

        // Verify Order History page
        String pageText = driver.findElement(By.tagName("body")).getText();

        System.out.println("Order History Page: " + pageText);

        Assert.assertTrue(
                pageText.contains("Order History"),
                "Order History page is not displayed"
        );

        driver.quit();
    }
}