package com.opencart.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencart.base.BaseTest;
import com.opencart.pages.RegisterPage;

public class RegisterTest extends BaseTest {

    RegisterPage registerPage;

    @Test
    public void validRegistrationTest() {

        registerPage = new RegisterPage(driver);

        registerPage.clickMyAccount();
        registerPage.clickRegister();

        registerPage.enterFirstName("Chandu");
        registerPage.enterLastName("Yadav");

        String email = "chandu" + System.currentTimeMillis() + "@gmail.com";

        registerPage.enterEmail(email);
        registerPage.enterTelephone("9876543210");
        registerPage.enterPassword("Test@123");
        registerPage.enterConfirmPassword("Test@123");

        registerPage.selectPrivacyPolicy();
        registerPage.clickContinue();

        String validationMessage = registerPage.getEmailValidationMessage();

        Assert.assertFalse(
                validationMessage.isEmpty(),
                "Email validation message was not displayed"
        );
    }

    @Test
    public void invalidEmailTest() {

        registerPage = new RegisterPage(driver);

        registerPage.clickMyAccount();
        registerPage.clickRegister();

        registerPage.enterFirstName("Chandu");
        registerPage.enterLastName("Yadav");

        registerPage.enterEmail("chandu123");
        registerPage.enterTelephone("9876543210");
        registerPage.enterPassword("Test@123");
        registerPage.enterConfirmPassword("Test@123");

        registerPage.selectPrivacyPolicy();
        registerPage.clickContinue();

        Assert.assertTrue(
        	    registerPage.isEmailErrorDisplayed(),
        	    "Email validation error was not displayed"
        	);
    }
}