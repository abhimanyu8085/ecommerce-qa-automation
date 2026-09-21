package com.qa.tests;

import com.qa.base.BaseTest;
import com.qa.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTest extends BaseTest {
    @Test
    public void addProductToCart() {
        new LoginPage(driver).login("standard_user", "secret_sauce");
        ProductsPage products = new ProductsPage(driver);
        products.addBackpackToCart();
        products.openCart();
        Assert.assertEquals(new CartPage(driver).getItemName(), "Sauce Labs Backpack");
    }
}