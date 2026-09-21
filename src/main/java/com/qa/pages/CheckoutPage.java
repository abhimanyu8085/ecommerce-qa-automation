package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    private final WebDriver driver;
    public CheckoutPage(WebDriver driver) { this.driver = driver; }

    public void enterInformation(String first, String last, String zip) {
        driver.findElement(By.id("first-name")).sendKeys(first);
        driver.findElement(By.id("last-name")).sendKeys(last);
        driver.findElement(By.id("postal-code")).sendKeys(zip);
        driver.findElement(By.id("continue")).click();
    }
    public void finish() { driver.findElement(By.id("finish")).click(); }
    public String confirmation() { return driver.findElement(By.cssSelector(".complete-header")).getText(); }
}