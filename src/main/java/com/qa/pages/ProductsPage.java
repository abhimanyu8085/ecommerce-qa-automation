package com.qa.pages;

import com.qa.utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductsPage {
    private final WebDriver driver;
    private final WaitUtils wait;
    private final By title = By.cssSelector(".title");
    private final By backpackAdd = By.id("add-to-cart-sauce-labs-backpack");
    private final By backpackRemove = By.id("remove-sauce-labs-backpack");
    private final By cart = By.cssSelector(".shopping_cart_link");
    private final By cartBadge = By.cssSelector(".shopping_cart_badge");
    private final By menu = By.id("react-burger-menu-btn");
    private final By logout = By.id("logout_sidebar_link");

    public ProductsPage(WebDriver driver) { this.driver = driver; this.wait = new WaitUtils(driver); }
    public boolean isDisplayed() { return wait.visible(title).isDisplayed(); }
    public void addBackpackToCart() { wait.jsClick(backpackAdd); }

    public void removeBackpack() {
        wait.jsClick(backpackRemove);
        wait.invisible(cartBadge);
    }

    public void openCart() {
        wait.jsClick(cart);
        wait.urlContains("cart");
    }

    public String getCartCount() { return wait.visible(cartBadge).getText(); }
    public boolean isCartBadgePresent() { return driver.findElements(cartBadge).size() > 0; }

    public void logout() {
        wait.jsClick(menu);
        wait.jsClick(logout);
        wait.urlContains("saucedemo.com");
    }
}