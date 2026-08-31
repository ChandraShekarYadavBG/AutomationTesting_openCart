package com.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    // Locators
    By myAccount = By.xpath("//span[text()='My Account']");
    By loginLink = By.linkText("Login");
    By emailField = By.id("input-email");
    By passwordField = By.id("input-password");
    By loginButton = By.xpath("//input[@value='Login']");

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Click My Account
    public void clickMyAccount() {
        driver.findElement(myAccount).click();
    }

    // Click Login link
    public void clickLogin() {
        driver.findElement(loginLink).click();
    }

    // Enter Email
    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    // Enter Password
    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    // Click Login button
    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }
}