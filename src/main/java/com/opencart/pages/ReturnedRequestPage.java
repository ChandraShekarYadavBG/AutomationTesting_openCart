package com.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ReturnedRequestPage {

    WebDriver driver;

    // Returned Returns page heading
    By returnsHeading =
            By.xpath("//h1[contains(text(),'Product Returns')]");

    public ReturnedRequestPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isReturnedRequestPageDisplayed() throws Exception {

        Thread.sleep(2000);

        return driver.findElement(returnsHeading).isDisplayed();
    }
}