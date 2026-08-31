package com.opencart.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.opencart.pages.ProductPage;

public class ProductTest {

    WebDriver driver;
    ProductPage productPage;

    @BeforeMethod
    public void setUp() {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://tutorialsninja.com/demo/");

        productPage = new ProductPage(driver);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


//    @Test
//    public void productCompareTest() {
//
//        // Search first product
//        productPage.searchProduct("MacBook");
//
//        // Add first product to compare
//        productPage.addProductToCompare();
//
//        // Search second product
//        productPage.searchProduct("iPhone");
//
//        // Add second product to compare
//        productPage.addProductToCompare();
//
//        // Open Product Comparison
//        productPage.openProductComparison();
//
//        // Verify MacBook
//        Assert.assertTrue(
//            productPage.isProductDisplayed("MacBook"),
//            "MacBook is NOT displayed in Product Comparison"
//        );
//
//        // Verify iPhone
//        Assert.assertTrue(
//            productPage.isProductDisplayed("iPhone"),
//            "iPhone is NOT displayed in Product Comparison"
//        );
//    }

    @Test
    public void productDisplayTest() {

        productPage.searchProduct("MacBook");

        productPage.openProduct("MacBook");

        System.out.println("Checking Product Name...");
        Assert.assertTrue(
            productPage.isProductNameDisplayed(),
            "Product name is NOT displayed"
        );
        System.out.println("Product Name PASS");

        System.out.println("Checking Product Price...");
        Assert.assertTrue(
            productPage.isProductPriceDisplayed(),
            "Product price is NOT displayed"
        );
        System.out.println("Product Price PASS");

        System.out.println("Checking Product Image...");
        
        Assert.assertTrue(
            productPage.isProductImageDisplayed(),
            "Product image is NOT displayed"
        );
        System.out.println("Product Image PASS");

        System.out.println("Checking Product Description...");
        Assert.assertTrue(
            productPage.isProductDescriptionDisplayed(),
            "Product description is NOT displayed"
        );
        System.out.println("Product Description PASS");
    }


    @Test
    public void invalidProductDisplayTest() {

        // Search invalid product
        productPage.searchProduct("XYZInvalidProduct12345");

        // Verify product not found message
        Assert.assertTrue(
            productPage.isProductNotFoundDisplayed(),
            "Product not found message is NOT displayed"
        );
    }

    @AfterMethod
    public void tearDown() {

        if (driver != null) {

            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            driver.quit();
        }
    }
}