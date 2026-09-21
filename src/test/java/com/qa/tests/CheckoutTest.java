package com.qa.tests;

import com.qa.base.BaseTest;
import com.qa.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutTest extends BaseTest {
    @Test
    public void completeCheckout() {
        new LoginPage(driver).login("standard_user", "secret_sauce");
        ProductsPage products = new ProductsPage(driver);
        products.addBackpackToCart();
        products.openCart();
        new CartPage(driver).checkout();
        CheckoutPage checkout = new CheckoutPage(driver);
        checkout.enterInformation("Abhimanyu", "Kumar", "110096");
        checkout.finish();
        Assert.assertEquals(checkout.confirmation(), "Thank you for your order!");
    }
}