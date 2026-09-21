package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {
    private final WebDriver driver;
    private final By title = By.cssSelector(".title");
    private final By backpackAdd = By.id("add-to-cart-sauce-labs-backpack");
    private final By cart = By.cssSelector(".shopping_cart_link");
    private final By menu = By.id("react-burger-menu-btn");
    private final By logout = By.id("logout_sidebar_link");

    public ProductsPage(WebDriver driver) { this.driver = driver; }
    public boolean isDisplayed() { return driver.findElement(title).isDisplayed(); }
    public void addBackpackToCart() { driver.findElement(backpackAdd).click(); }
    public void openCart() { driver.findElement(cart).click(); }
    public void logout() { driver.findElement(menu).click(); driver.findElement(logout).click(); }
}