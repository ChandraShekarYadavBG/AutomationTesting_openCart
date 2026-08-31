package com.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class AddressPage {

    WebDriver driver;

    By firstName = By.id("input-firstname");
    By lastName = By.id("input-lastname");
    By address = By.id("input-address-1");
    By city = By.id("input-city");
    By postcode = By.id("input-postcode");
    By country = By.id("input-country");
    By state = By.id("input-zone");
    By continueButton = By.cssSelector("input[type='submit'], button[type='submit']");

    public AddressPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterFirstName(String value) {
        driver.findElement(firstName).sendKeys(value);
    }

    public void enterLastName(String value) {
        driver.findElement(lastName).sendKeys(value);
    }

    public void enterAddress(String value) {
        driver.findElement(address).sendKeys(value);
    }

    public void enterCity(String value) {
        driver.findElement(city).sendKeys(value);
    }

    public void enterPostcode(String value) {
        driver.findElement(postcode).sendKeys(value);
    }

    public void selectCountry(String value) {
        new Select(driver.findElement(country))
                .selectByVisibleText(value);
    }

    public void selectState(String value) {
        new Select(driver.findElement(state))
                .selectByVisibleText(value);
    }

    public void clickContinue() {
        driver.findElement(continueButton).click();
    }
}