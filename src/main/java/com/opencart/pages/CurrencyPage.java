package com.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CurrencyPage {

    WebDriver driver;

    // Currency dropdown
    By currencyDropdown = By.xpath("//button[contains(@class,'dropdown-toggle')]");

    // Euro currency option
    By euroOption = By.xpath("//button[@name='EUR']");

    // First product price
    By productPrice = By.xpath("(//span[contains(@class,'price')])[1]");

    public CurrencyPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickCurrencyDropdown() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(currencyDropdown).click();
        Thread.sleep(2000);
    }

    public void selectEuro() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(euroOption).click();
        Thread.sleep(3000);
    }

    public String getProductPrice() throws InterruptedException {
        Thread.sleep(2000);
        String price = driver.findElement(productPrice).getText();
        Thread.sleep(1000);
        return price;
    }
}