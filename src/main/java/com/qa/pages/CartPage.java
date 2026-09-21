package com.qa.pages;

import com.qa.utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private final WaitUtils wait;
    private final By item = By.cssSelector(".inventory_item_name");
    private final By checkout = By.id("checkout");

    public CartPage(WebDriver driver) { this.wait = new WaitUtils(driver); }
    public String getItemName() { return wait.visible(item).getText(); }
    public void checkout() { wait.clickable(checkout).click(); }
}