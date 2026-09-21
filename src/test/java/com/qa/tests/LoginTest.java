package com.qa.tests;

import com.qa.base.BaseTest;
import com.qa.pages.LoginPage;
import com.qa.pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test
    public void validLogin() {
        new LoginPage(driver).login("standard_user", "secret_sauce");
        Assert.assertTrue(new ProductsPage(driver).isDisplayed());
    }

    @Test
    public void invalidLogin() {
        LoginPage page = new LoginPage(driver);
        page.login("invalid_user", "wrong_password");
        Assert.assertTrue(page.getErrorMessage().contains("Username and password do not match"));
    }
}