package com.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartPage {

    WebDriver driver;

    By productName = By.xpath("//div[@class='table-responsive']//td[2]/a");

    By removeButton = By.xpath("//button[@data-original-title='Remove']");

    public ShoppingCartPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getProductName() {
        return driver.findElement(productName).getText();
    }

    public boolean isProductDisplayed() {
        return driver.findElement(productName).isDisplayed();
    }

    public void removeProduct() {
        driver.findElement(removeButton).click();
    }

    public boolean isProductPresent() {
        return !driver.findElements(productName).isEmpty();
    }
}