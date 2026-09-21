package com.qa.tests;

import com.qa.base.BaseTest;
import com.qa.pages.LoginPage;
import com.qa.pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RemoveFromCartTest extends BaseTest {
    @Test
    public void removeProductFromCart() {
        new LoginPage(driver).login("standard_user", "secret_sauce");
        ProductsPage products = new ProductsPage(driver);
        products.addBackpackToCart();
        Assert.assertEquals(products.getCartCount(), "1");
        products.removeBackpack();
        Assert.assertFalse(products.isCartBadgePresent(), "Cart badge should disappear after removing the only product.");
    }
}