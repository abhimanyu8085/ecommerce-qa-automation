package com.qa.tests;

import com.qa.base.BaseTest;
import com.qa.pages.LoginPage;
import com.qa.pages.ProductsPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginDataTest extends BaseTest {
    @DataProvider(name = "loginData")
    public Object[][] loginData() {
        return new Object[][] {
            {"standard_user", "secret_sauce", true},
            {"invalid_user", "wrong_password", false},
            {"", "secret_sauce", false},
            {"standard_user", "", false}
        };
    }

    @Test(dataProvider = "loginData")
    public void verifyLogin(String username, String password, boolean valid) {
        LoginPage login = new LoginPage(driver);
        login.login(username, password);
        if (valid) {
            Assert.assertTrue(new ProductsPage(driver).isDisplayed());
        } else {
            Assert.assertFalse(login.getErrorMessage().isBlank());
        }
    }
}