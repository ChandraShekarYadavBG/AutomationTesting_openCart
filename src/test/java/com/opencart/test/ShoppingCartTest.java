package com.opencart.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.opencart.pages.ShoppingCartPage;

public class ShoppingCartTest {

    WebDriver driver;
    ShoppingCartPage shoppingCartPage;

    @BeforeMethod
    public void setUp() throws Exception {

        driver = new ChromeDriver();

        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.get("https://tutorialsninja.com/demo/");
        Thread.sleep(3000);

        shoppingCartPage = new ShoppingCartPage(driver);
        Thread.sleep(1000);
    }

    // Verify product is displayed in shopping cart

    @Test
    public void shoppingCartTest() throws Exception {

        // Click MacBook
        driver.findElement(By.linkText("MacBook")).click();
        Thread.sleep(3000);

        // Click Add to Cart
        driver.findElement(By.id("button-cart")).click();
        Thread.sleep(3000);

        // Click Shopping Cart
        driver.findElement(By.xpath("//a[@title='Shopping Cart']")).click();
        Thread.sleep(3000);

        // Verify product is displayed
        Assert.assertTrue(
                shoppingCartPage.isProductDisplayed(),
                "Product is not displayed in shopping cart"
        );

        Thread.sleep(1000);

        // Get product name
        String productName = shoppingCartPage.getProductName();

        System.out.println("Product displayed in cart: " + productName);

        Thread.sleep(1000);

        // Verify product name
        Assert.assertEquals(
                productName,
                "MacBook",
                "Incorrect product is displayed in shopping cart"
        );

        Thread.sleep(2000);
    }

    // Remove product from shopping cart

    @Test
    public void removeFromCartTest() throws Exception {

        // Click MacBook
        driver.findElement(By.linkText("MacBook")).click();
        Thread.sleep(3000);

        // Click Add to Cart
        driver.findElement(By.id("button-cart")).click();
        Thread.sleep(3000);

        // Click Shopping Cart
        driver.findElement(By.xpath("//a[@title='Shopping Cart']")).click();
        Thread.sleep(3000);

        // Verify product exists before removing
        Assert.assertTrue(
                shoppingCartPage.isProductPresent(),
                "Product is not present in cart before removal"
        );

        Thread.sleep(2000);

        // Click Remove
        shoppingCartPage.removeProduct();
        Thread.sleep(3000);

        // Verify product is removed
        Assert.assertFalse(
                shoppingCartPage.isProductPresent(),
                "Product was not removed from shopping cart"
        );

        Thread.sleep(2000);

        System.out.println("Product successfully removed from shopping cart.");
    }

    @AfterMethod
    public void tearDown() throws Exception {

        Thread.sleep(2000);

        if (driver != null) {
            driver.quit();
        }
    }
}