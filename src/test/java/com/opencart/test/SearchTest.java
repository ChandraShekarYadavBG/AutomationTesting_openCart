package com.opencart.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencart.pages.SearchPage;

public class SearchTest {

    @Test
    public void invalidSearchTest() throws Exception {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        // Open application
        driver.get("https://tutorialsninja.com/demo/");

        Thread.sleep(2000);

        SearchPage searchPage = new SearchPage(driver);

        // Search non-existing product
        searchPage.enterSearch("XYZNonExistingProduct123");

        Thread.sleep(1000);

        searchPage.clickSearch();

        Thread.sleep(2000);

        // Verify no product found
        String pageText = driver.findElement(By.tagName("body")).getText();

        System.out.println("Actual Result: " + pageText);

        Assert.assertTrue(
                pageText.contains("There is no product that matches the search criteria."),
                "Expected no-product message was not displayed"
        );

        driver.quit();
    }
}