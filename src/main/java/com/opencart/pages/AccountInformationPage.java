package com.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountInformationPage {

    WebDriver driver;

    By myAccount = By.cssSelector("a[title='My Account']");
    By login = By.linkText("Login");

    By email = By.id("input-email");
    By password = By.id("input-password");
    By loginButton = By.cssSelector("input[type='submit']");

    By editAccount = By.linkText("Edit Account");
    By firstName = By.id("input-firstname");
    By lastName = By.id("input-lastname");

    By continueButton = By.cssSelector("input[type='submit']");
    By successMessage = By.cssSelector(".alert-success");

    public AccountInformationPage(WebDriver driver) {
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

    public void clickEditAccount() {
        driver.findElement(editAccount).click();
    }

    public void enterFirstName(String value) {
        driver.findElement(firstName).clear();
        driver.findElement(firstName).sendKeys(value);
    }

    public void enterLastName(String value) {
        driver.findElement(lastName).clear();
        driver.findElement(lastName).sendKeys(value);
    }

    public void clickContinue() {
        driver.findElement(continueButton).click();
    }

    public String getSuccessMessage() {
        return driver.findElement(successMessage).getText();
    }
}