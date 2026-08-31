package com.opencart.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencart.pages.AccountInformationPage;

public class AccountInformationTest {

    @Test
    public void updateAccountInformationTest() throws Exception {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        // Open application
        driver.get("https://tutorialsninja.com/demo/");

        Thread.sleep(2000);

        AccountInformationPage accountPage =
                new AccountInformationPage(driver);

        // Login
        accountPage.clickMyAccount();

        Thread.sleep(1000);

        accountPage.clickLogin();

        Thread.sleep(2000);

        accountPage.enterEmail("chanduyadav001@kodnest.com");

        accountPage.enterPassword("1234567890");

        Thread.sleep(1000);

        accountPage.clickLoginButton();

        Thread.sleep(3000);

        // Edit Account
        accountPage.clickEditAccount();

        Thread.sleep(2000);

        // Update information
        accountPage.enterFirstName(" Prince Chandu");

        accountPage.enterLastName("Yadav");

        Thread.sleep(1000);

        // Save
        accountPage.clickContinue();

        Thread.sleep(2000);

        // Verify
        String actualMessage =
                accountPage.getSuccessMessage();

        System.out.println("Actual Result: " + actualMessage);

        Assert.assertTrue(
                actualMessage.contains("successfully"),
                "Account information was not updated"
        );

        driver.quit();
    }
}