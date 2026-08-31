package com.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GiftCertificatePage {

    WebDriver driver;

    // Gift Certificate link
    By giftCertificateLink =
            By.xpath("//a[contains(text(),'Gift Certificates')]");

    // Recipient details
    By recipientName =
            By.xpath("//input[@name='to_name']");

    By recipientEmail =
            By.xpath("//input[@name='to_email']");

    // Sender details
    By senderName =
            By.xpath("//input[@name='from_name']");

    By senderEmail =
            By.xpath("//input[@name='from_email']");

    // Message
    By message =
            By.xpath("//textarea[@name='message']");

    // Amount
    By amount =
            By.xpath("//input[@name='amount']");

    // Gift certificate theme
    By theme =
            By.xpath("//input[@name='voucher_theme_id'][1]");

    // Agreement
    By agree =
            By.xpath("//input[@name='agree']");

    // Continue
    By continueButton =
            By.xpath("//input[@value='Continue']");

    public GiftCertificatePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickGiftCertificate() throws InterruptedException {

        Thread.sleep(2000);
        driver.findElement(giftCertificateLink).click();
        Thread.sleep(3000);
    }

    public void enterRecipientName(String name)
            throws InterruptedException {

        Thread.sleep(1000);
        driver.findElement(recipientName).sendKeys(name);
        Thread.sleep(1000);
    }

    public void enterRecipientEmail(String email)
            throws InterruptedException {

        Thread.sleep(1000);
        driver.findElement(recipientEmail).sendKeys(email);
        Thread.sleep(1000);
    }

    public void enterSenderName(String name)
            throws InterruptedException {

        Thread.sleep(1000);
        driver.findElement(senderName).sendKeys(name);
        Thread.sleep(1000);
    }

    public void enterSenderEmail(String email)
            throws InterruptedException {

        Thread.sleep(1000);
        driver.findElement(senderEmail).sendKeys(email);
        Thread.sleep(1000);
    }

    public void enterMessage(String text)
            throws InterruptedException {

        Thread.sleep(1000);
        driver.findElement(message).sendKeys(text);
        Thread.sleep(1000);
    }

    public void enterAmount(String value)
            throws InterruptedException {

        Thread.sleep(1000);
        driver.findElement(amount).sendKeys(value);
        Thread.sleep(1000);
    }

    public void selectTheme()
            throws InterruptedException {

        Thread.sleep(1000);
        driver.findElement(theme).click();
        Thread.sleep(1000);
    }

    public void selectAgreement()
            throws InterruptedException {

        Thread.sleep(1000);
        driver.findElement(agree).click();
        Thread.sleep(1000);
    }

    public void clickContinue()
            throws InterruptedException {

        Thread.sleep(1000);
        driver.findElement(continueButton).click();
        Thread.sleep(3000);
    }
}