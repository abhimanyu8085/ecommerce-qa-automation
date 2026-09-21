package com.qa.tests;

import com.qa.base.BaseTest;
import com.qa.pages.*;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.*;
import java.time.Duration;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogoutTest extends BaseTest {
    @Test
    public void userCanLogout() {
        new LoginPage(driver).login("standard_user", "secret_sauce");
        new ProductsPage(driver).logout();
        new WebDriverWait(driver, Duration.ofSeconds(10))
            .until(ExpectedConditions.visibilityOfElementLocated(By.id("login-button")));
        Assert.assertTrue(driver.findElement(By.id("login-button")).isDisplayed());
    }
}