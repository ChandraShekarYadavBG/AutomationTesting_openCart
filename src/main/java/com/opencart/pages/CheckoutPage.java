package com.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {

    WebDriver driver;

    // My Account
    By myAccount = By.cssSelector("a[title='My Account']");
    By login = By.linkText("Login");

    // Login
    By email = By.id("input-email");
    By password = By.id("input-password");
    By loginButton = By.cssSelector("input[type='submit']");

    // Product
    By desktops = By.linkText("Desktops");
    By showAllDesktops = By.linkText("Show All Desktops");
    By product = By.linkText("iMac");
    By addToCart = By.id("button-cart");

    // Cart / Checkout
    By cart = By.id("cart");
    By checkout = By.linkText("Checkout");

    // Checkout
    By firstName = By.id("input-payment-firstname");
    By lastName = By.id("input-payment-lastname");
    By address = By.id("input-payment-address-1");
    By city = By.id("input-payment-city");
    By postcode = By.id("input-payment-postcode");

    By continueButton = By.id("button-payment-address");

    public CheckoutPage(WebDriver driver) {
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

    public void clickProduct() {
        driver.findElement(product).click();
    }

    public void addToCart() {
        driver.findElement(addToCart).click();
    }

    public void clickCart() {
        driver.findElement(cart).click();
    }

    public void clickCheckout() {
        driver.findElement(checkout).click();
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

    public void clickContinue() {
        driver.findElement(continueButton).click();
    }

	public void clickDesktops1() {
		// TODO Auto-generated method stub
		
	}

	public void clickIMac() {
		// TODO Auto-generated method stub
		
	}

	public void clickDesktops() {
		// TODO Auto-generated method stub
		
	}

	public void clickDesktops11() {
		// TODO Auto-generated method stub
		
	}

	public void clickLogo() {
		// TODO Auto-generated method stub
		
	}

	public void clickShowAllDesktops() {
		// TODO Auto-generated method stub
		
	}

	public void clickAddToCart() {
		// TODO Auto-generated method stub
		
	}
}