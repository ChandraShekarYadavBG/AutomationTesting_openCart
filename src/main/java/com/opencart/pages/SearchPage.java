package com.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {

    WebDriver driver;

    By searchBox = By.name("search");
    By searchButton = By.cssSelector("button.btn.btn-default.btn-lg");

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterSearch(String product) {
        driver.findElement(searchBox).sendKeys(product);
    }

    public void clickSearch() {
        driver.findElement(searchButton).click();
    }

	public void searchProduct(String product) {
		// TODO Auto-generated method stub
		
	}

	public boolean isProductDisplayed() {
		// TODO Auto-generated method stub
		return false;
	}
}