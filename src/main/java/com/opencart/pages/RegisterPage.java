package com.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

    WebDriver driver;

    // Locators
    By myAccount = By.xpath("//span[text()='My Account']");
    By registerLink = By.linkText("Register");

    By firstName = By.id("input-firstname");
    By lastName = By.id("input-lastname");
    By email = By.id("input-email");
    By telephone = By.id("input-telephone");
    By password = By.id("input-password");
    By confirmPassword = By.id("input-confirm");

    By privacyPolicy = By.name("agree");
    By continueButton = By.xpath("//input[@value='Continue']");

    By accountCreatedMessage =
            By.xpath("//h1[text()='Your Account Has Been Created!']");
    
    // invalid email
    By emailError = By.xpath("//input[@id='input-email']/following-sibling::div[contains(@class,'text-danger')]");

    // Constructor
    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isEmailErrorDisplayed1() {
        return driver.findElement(emailError).isDisplayed();
        }
    
    public String getEmailValidationMessage() {
        return driver.findElement(email).getAttribute("validationMessage");
    } 
    // Click My Account
    public void clickMyAccount() {
        driver.findElement(myAccount).click();
    }

    // Click Register
    public void clickRegister() {
        driver.findElement(registerLink).click();
    }

    // Enter First Name
    public void enterFirstName(String firstNameValue) {
        driver.findElement(firstName).sendKeys(firstNameValue);
    }

    // Enter Last Name
    public void enterLastName(String lastNameValue) {
        driver.findElement(lastName).sendKeys(lastNameValue);
    }

    // Enter Email
    public void enterEmail(String emailValue) {
        driver.findElement(email).sendKeys(emailValue);
    }

    // Enter Telephone
    public void enterTelephone(String telephoneValue) {
        driver.findElement(telephone).sendKeys(telephoneValue);
    }

    // Enter Password
    public void enterPassword(String passwordValue) {
        driver.findElement(password).sendKeys(passwordValue);
    }

    // Enter Confirm Password
    public void enterConfirmPassword(String confirmPasswordValue) {
        driver.findElement(confirmPassword).sendKeys(confirmPasswordValue);
    }

    // Select Privacy Policy
    public void selectPrivacyPolicy() {
        driver.findElement(privacyPolicy).click();
    }

    // Click Continue
    public void clickContinue() {
        driver.findElement(continueButton).click();
    }

    // Verify Account Created
    public boolean isAccountCreated() {
        return driver.findElement(accountCreatedMessage).isDisplayed();
    }
    
  

// verify email error
public boolean isEmailErrorDisplayed() {
    return driver.findElement(emailError).isDisplayed();
}
}