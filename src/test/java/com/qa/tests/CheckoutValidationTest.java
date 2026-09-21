package com.qa.tests;

import com.qa.base.BaseTest;
import com.qa.pages.*;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutValidationTest extends BaseTest {
    private void reachCheckout() {
        new LoginPage(driver).login("standard_user", "secret_sauce");
        ProductsPage products = new ProductsPage(driver);
        products.addBackpackToCart();
        products.openCart();
        new CartPage(driver).checkout();
    }

    @Test
    public void firstNameIsRequired() {
        reachCheckout();
        new CheckoutPage(driver).enterInformation("", "Kumar", "110096");
        Assert.assertTrue(driver.findElement(By.cssSelector("[data-test='error']")).getText().contains("First Name is required"));
    }

    @Test
    public void lastNameIsRequired() {
        reachCheckout();
        new CheckoutPage(driver).enterInformation("Abhimanyu", "", "110096");
        Assert.assertTrue(driver.findElement(By.cssSelector("[data-test='error']")).getText().contains("Last Name is required"));
    }

    @Test
    public void postalCodeIsRequired() {
        reachCheckout();
        new CheckoutPage(driver).enterInformation("Abhimanyu", "Kumar", "");
        Assert.assertTrue(driver.findElement(By.cssSelector("[data-test='error']")).getText().contains("Postal Code is required"));
    }
}