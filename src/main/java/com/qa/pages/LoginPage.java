package com.qa.pages;

import com.qa.utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private final WaitUtils wait;
    private final By username = By.id("user-name");
    private final By password = By.id("password");
    private final By loginButton = By.id("login-button");
    private final By error = By.cssSelector("[data-test='error']");

    public LoginPage(WebDriver driver) { this.wait = new WaitUtils(driver); }

    public void login(String user, String pass) {
        wait.visible(username).sendKeys(user);
        wait.visible(password).sendKeys(pass);
        wait.clickable(loginButton).click();
    }
    public String getErrorMessage() { return wait.visible(error).getText(); }
}