package com.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {

    WebDriver driver;

    By myAccount = By.xpath("//span[text()='My Account']");
    By loginLink = By.linkText("Login");
    By forgotPasswordLink = By.linkText("Forgotten Password");
    By emailField = By.id("input-email");
    By continueButton = By.cssSelector("input[value='Continue']");

    public ForgotPasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickMyAccount() {
        driver.findElement(myAccount).click();
    }

    public void clickLogin() {
        driver.findElement(loginLink).click();
    }

    public void clickForgotPassword() {
        driver.findElement(forgotPasswordLink).click();
    }

    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void clickContinue() {
        driver.findElement(continueButton).click();
    }

    public boolean isErrorMessageDisplayed() {

        By errorMessage = By.cssSelector(".alert.alert-danger");

        return driver.findElement(errorMessage).isDisplayed();
    }
	}
