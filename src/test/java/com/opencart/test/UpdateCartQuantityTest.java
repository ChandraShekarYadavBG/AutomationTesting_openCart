package com.opencart.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class UpdateCartQuantityTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/");
    }

    @DataProvider(name = "quantity")
    public Object[][] quantity() {
        return new Object[][] {
            {"2"},
            {"3"}
        };
    }

    @Test(dataProvider = "quantity")
    public void updateCartQuantityTest(String qty) {

        driver.findElement(By.linkText("MacBook")).click();

        driver.findElement(By.xpath("//button[@onclick=\"cart.add('43');\"]")).click();

        driver.findElement(By.linkText("shopping cart")).click();

        By quantity = By.xpath("//input[contains(@name,'quantity')]");

        driver.findElement(quantity).clear();
        driver.findElement(quantity).sendKeys(qty);

        driver.findElement(By.xpath("//button[@type='submit']")).click();

        String value = driver.findElement(quantity).getAttribute("value");

        Assert.assertEquals(value, qty);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}