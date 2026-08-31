package com.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderHistoryPage {

    WebDriver driver;

    By myAccount = By.cssSelector("a[title='My Account']");
    By login = By.linkText("Login");

    By email = By.id("input-email");
    By password = By.id("input-password");
    By loginButton = By.cssSelector("input[type='submit']");

    By orderHistory = By.linkText("Order History");

    public OrderHistoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickMyAccount() {
        driver.findElement(myAccount).click();
    }

    public void clickLogin() {
        driver.findElement(login).click();
    }

    public void enterEmail(String value) {
        driver.findElement(email).sendKeys(value);
    }

    public void enterPassword(String value) {
        driver.findElement(password).sendKeys(value);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public void clickOrderHistory() {
        driver.findElement(orderHistory).click();
    }
}