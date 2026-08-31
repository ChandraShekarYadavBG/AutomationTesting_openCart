package com.opencart.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCartPage {

    WebDriver driver;
    WebDriverWait wait;

    By macBook = By.linkText("MacBook");

    By addToCartButton = By.id("button-cart");

    By successMessage = By.cssSelector(".alert-success");

    public AddToCartPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clickMacBook() {

        wait.until(ExpectedConditions.elementToBeClickable(macBook)).click();
    }

    public void clickAddToCart() {

        wait.until(ExpectedConditions.elementToBeClickable(addToCartButton)).click();
    }

    public String getSuccessMessage() {

        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(successMessage)
        ).getText();
    }
}