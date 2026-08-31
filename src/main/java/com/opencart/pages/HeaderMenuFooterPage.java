package com.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderMenuFooterPage {

    WebDriver driver;

    // Header elements
    By logo = By.xpath("/html/body/header/div/div/div[1]/div/h1/a");
    By searchBox = By.xpath("//input[@name='search']");
    By cartButton = By.xpath("//div[@id='cart']//button");

    // Menu
    By menu = By.xpath("//nav[@id='menu']");

    // Footer
    By footer = By.xpath("//footer");

    public HeaderMenuFooterPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isLogoDisplayed() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(logo).isDisplayed();
    }

    public boolean isSearchDisplayed() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(searchBox).isDisplayed();
    }

    public boolean isCartDisplayed() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(cartButton).isDisplayed();
    }

    public boolean isMenuDisplayed() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(menu).isDisplayed();
    }

    public boolean isFooterDisplayed() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(footer).isDisplayed();
    }
}