package com.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChangePasswordPage {

    WebDriver driver;

    // My Account → Change Password
    By myAccount = By.cssSelector("a[title='My Account']");
    By login = By.linkText("Login");

    // Login
    By email = By.id("input-email");
    By password = By.id("input-password");
    By loginButton = By.cssSelector("input[type='submit']");

    // Change Password
    By changePassword = By.linkText("Password");

    By newPassword = By.id("input-password");
    By confirmPassword = By.id("input-confirm");

    By continueButton = By.cssSelector("input[type='submit']");

    public ChangePasswordPage(WebDriver driver) {
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

    public void clickChangePassword() {
        driver.findElement(changePassword).click();
    }

    public void enterNewPassword(String value) {
        driver.findElement(newPassword).sendKeys(value);
    }

    public void enterConfirmPassword(String value) {
        driver.findElement(confirmPassword).sendKeys(value);
    }

    public void clickContinue() {
        driver.findElement(continueButton).click();
    }
}