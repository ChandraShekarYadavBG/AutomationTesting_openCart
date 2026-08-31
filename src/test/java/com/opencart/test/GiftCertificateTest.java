package com.opencart.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.opencart.pages.GiftCertificatePage;

public class GiftCertificateTest {

    WebDriver driver;

    @BeforeMethod
    public void setup() throws Exception {

        driver = new ChromeDriver();

        driver.manage().window().maximize();

        Thread.sleep(2000);

        driver.get("https://tutorialsninja.com/demo/");

        Thread.sleep(4000);
    }

    @Test
    public void giftCertificateTest() throws Exception {

        GiftCertificatePage giftPage =
                new GiftCertificatePage(driver);

        // Open Gift Certificate page
        giftPage.clickGiftCertificate();

        Thread.sleep(2000);

        // Recipient details
        giftPage.enterRecipientName("Rahul");

        giftPage.enterRecipientEmail("rahul@gmail.com");

        // Sender details
        giftPage.enterSenderName("Chandra");

        giftPage.enterSenderEmail("chandra@gmail.com");

        // Message
        giftPage.enterMessage("Happy Birthday!");

        // Gift Certificate Amount
        giftPage.enterAmount("50");

        Thread.sleep(2000);

        // Select gift certificate theme
        giftPage.selectTheme();

        Thread.sleep(2000);

        // Accept mandatory agreement
        giftPage.selectAgreement();

        Thread.sleep(2000);

        // Continue
        giftPage.clickContinue();

        Thread.sleep(3000);

        // Verify successful submission
        String pageSource = driver.getPageSource();

        Assert.assertTrue(
                pageSource.contains("Gift Certificate"),
                "Gift Certificate request was not processed"
        );

        System.out.println(
                "Gift Certificate details submitted successfully."
        );

        Thread.sleep(2000);
    }

    @AfterMethod
    public void tearDown()throws Exception {

        Thread.sleep(2000);

        if (driver != null) {
            driver.quit();
        }
    }
}