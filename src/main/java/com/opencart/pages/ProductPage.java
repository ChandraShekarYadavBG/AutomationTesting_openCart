package com.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {

    WebDriver driver;

    // Constructor
    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    By searchBox = By.name("search");
    By searchButton = By.cssSelector("button.btn.btn-default.btn-lg");

    public void searchProduct(String productName) {

        WebElement search = driver.findElement(searchBox);

        search.clear();
        search.sendKeys(productName);

        driver.findElement(searchButton).click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

 
    public void openProduct(String productName) {

        By productLink = By.linkText(productName);

        driver.findElement(productLink).click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public boolean isProductNameDisplayed() {

        try {

            By productName = By.xpath(
                "/html/body/div[2]/div/div/div/div[2]/ul[2]/li[1]/h2"
            );

            return driver.findElement(productName).isDisplayed();

        } catch (Exception e) {

            return false;
        }
    }

  
    public boolean isProductPriceDisplayed() {

        try {

            By productPrice = By.cssSelector(
                "ul.list-unstyled li h2"
            );

            return driver.findElement(productPrice).isDisplayed();

        } catch (Exception e) {

            return false;
        }
    }

   
    public boolean isProductImageDisplayed() {

        try {

            By productImage = By.xpath(
                "/html/body/div[2]/div/div/div/div[1]/ul[1]/li[1]/a"
            );

            return driver.findElement(productImage).isDisplayed();

        } catch (Exception e) {

            return false;
        }
    }


    public boolean isProductDescriptionDisplayed() {

        try {

            By description = By.xpath(" /html/body/div[2]/div/div/div/div[1]/ul[2]/li[1]/a");

            return driver.findElement(description).isDisplayed();

        } catch (Exception e) {

            return false;
        }
    }


    public boolean isProductNotFoundDisplayed() {

        try {

            By notFoundMessage = By.xpath(
                "//*[contains(text(),'There is no product that matches the search criteria')]"
            );

            return driver.findElement(notFoundMessage).isDisplayed();

        } catch (Exception e) {

            return false;
        }
    }


    public void addProductToCompare() {

        By compareButton = By.xpath(
            "//button[contains(@onclick,'compare.add')]"
        );

        driver.findElement(compareButton).click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void openProductComparison() {

        By comparisonLink = By.linkText("product comparison");

        driver.findElement(comparisonLink).click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public boolean isProductDisplayed(String productName) {

        try {

            By product = By.xpath(
                "//table//a[contains(text(),'" + productName + "')]"
            );

            return driver.findElement(product).isDisplayed();

        } catch (Exception e) {

            return false;
        }
    }
}