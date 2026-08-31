package com.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUsPage {

    WebDriver driver;

    // Contact Us page fields
    By nameField = By.name("name");
    By emailField = By.name("email");
    By enquiryField = By.name("enquiry");

    // Submit button
    By submitButton = By.xpath("//input[@value='Submit']");

    // Contact Us heading
    By contactUsHeading = By.xpath("//h1[text()='Contact Us']");

    public ContactUsPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isContactUsPageDisplayed() throws InterruptedException {

        Thread.sleep(2000);

        return driver.findElement(contactUsHeading).isDisplayed();
    }

    public void enterName(String name) throws InterruptedException {

        Thread.sleep(1000);

        driver.findElement(nameField).clear();

        driver.findElement(nameField).sendKeys(name);

        Thread.sleep(1500);
    }

    public void enterEmail(String email) throws InterruptedException {

        Thread.sleep(1000);

        driver.findElement(emailField).clear();

        driver.findElement(emailField).sendKeys(email);

        Thread.sleep(1500);
    }

    public void enterEnquiry(String enquiry) throws InterruptedException {

        Thread.sleep(1000);

        driver.findElement(enquiryField).clear();

        driver.findElement(enquiryField).sendKeys(enquiry);

        Thread.sleep(1500);
    }

    public void clickSubmit() throws InterruptedException {

        Thread.sleep(2000);

        driver.findElement(submitButton).click();

        Thread.sleep(3000);
    }

    public boolean isFormStillDisplayed() throws InterruptedException {

        Thread.sleep(2000);

        return driver.findElement(contactUsHeading).isDisplayed();
    }
}