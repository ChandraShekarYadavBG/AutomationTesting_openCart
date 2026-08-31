package com.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage {

    WebDriver driver;

    By myAccountTitle = By.xpath("//h2[text()='My Account']");

    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isMyAccountPageDisplayed() {
        return driver.findElement(myAccountTitle).isDisplayed();
    }
}