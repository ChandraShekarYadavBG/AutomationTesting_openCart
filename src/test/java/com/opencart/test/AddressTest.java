package com.opencart.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AddressTest {

    @Test
    public void addAddressTest() {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        // Open application
        driver.get("https://tutorialsninja.com/demo/");

        // My Account → Login
        driver.findElement(By.cssSelector("a[title='My Account']")).click();
        driver.findElement(By.linkText("Login")).click();

        // Login
        driver.findElement(By.id("input-email"))
                .sendKeys("chanduyadav001@kodnest.com");

        driver.findElement(By.id("input-password"))
                .sendKeys("1234567890");

        driver.findElement(By.cssSelector("input[type='submit']")).click();

        // Address Book
        driver.findElement(By.linkText("Address Book")).click();

        // New Address
        driver.findElement(By.linkText("New Address")).click();

        // Address details
        driver.findElement(By.id("input-firstname")).sendKeys("Chandu");
        driver.findElement(By.id("input-lastname")).sendKeys("Yadav");
        driver.findElement(By.id("input-address-1")).sendKeys("12 MG Road");
        driver.findElement(By.id("input-city")).sendKeys("Bangalore");
        driver.findElement(By.id("input-postcode")).sendKeys("560001");

        // Save
        driver.findElement(By.cssSelector("input[type='submit']")).click();

        driver.quit();
    }
}