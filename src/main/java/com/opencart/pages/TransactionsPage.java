package com.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TransactionsPage {

    WebDriver driver;

    // Your Transactions page heading
    By transactionsHeading =
            By.xpath("//h1[contains(text(),'Your Transactions')]");

    public TransactionsPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isTransactionsPageDisplayed()
            throws InterruptedException {

        Thread.sleep(2000);

        return driver.findElement(transactionsHeading).isDisplayed();
    }
}