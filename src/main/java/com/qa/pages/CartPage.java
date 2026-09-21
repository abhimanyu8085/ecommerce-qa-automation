package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private final WebDriver driver;
    private final By item = By.cssSelector(".inventory_item_name");
    private final By checkout = By.id("checkout");

    public CartPage(WebDriver driver) { this.driver = driver; }
    public String getItemName() { return driver.findElement(item).getText(); }
    public void checkout() { driver.findElement(checkout).click(); }
}