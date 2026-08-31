package com.opencart.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.opencart.pages.ContactUsPage;

public class ContactUsTest {

    WebDriver driver;

    @BeforeMethod
    public void setup() throws Exception {

        driver = new ChromeDriver();

        Thread.sleep(2000);

        driver.manage().window().maximize();

        Thread.sleep(2000);

        driver.get("https://tutorialsninja.com/demo/index.php?route=information/contact");

        Thread.sleep(5000);
    }

    @Test
    public void invalidContactUsTest() throws Exception {

        ContactUsPage contactPage =
                new ContactUsPage(driver);

        // Verify Contact Us page
        Assert.assertTrue(
                contactPage.isContactUsPageDisplayed(),
                "Contact Us page is not displayed"
        );

        Thread.sleep(2000);

        // VALID NAME
        contactPage.enterName("Chandra Shekar Yadav");

        Thread.sleep(1500);

        // INVALID EMAIL
        contactPage.enterEmail("chandU");

        Thread.sleep(1500);

        // VALID ENQUIRY
        contactPage.enterEnquiry(
                "I would like to know more information about the product."
        );

        Thread.sleep(2000);

        // Submit the form
        contactPage.clickSubmit();

        Thread.sleep(3000);

        
        Assert.assertTrue(
                contactPage.isFormStillDisplayed(),
                "Form was submitted even though invalid email was entered"
        );

        System.out.println(
                "PASS: Contact Us form rejected the invalid email."
        );

        Thread.sleep(2000);
    }

    @AfterMethod
    public void tearDown() throws Exception {

        Thread.sleep(2000);

        if (driver != null) {

            driver.quit();
        }
    }
}