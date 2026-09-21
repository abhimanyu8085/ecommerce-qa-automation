package com.qa.pages;

import com.qa.utils.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    private final WaitUtils wait;
    private final By firstName = By.id("first-name");
    private final By lastName = By.id("last-name");
    private final By postalCode = By.id("postal-code");
    private final By continueButton = By.id("continue");
    private final By finishButton = By.id("finish");
    private final By confirmation = By.cssSelector(".complete-header");

    public CheckoutPage(WebDriver driver) { this.wait = new WaitUtils(driver); }

    public void enterInformation(String first, String last, String zip) {
        wait.visible(firstName).sendKeys(first);
        wait.visible(lastName).sendKeys(last);
        wait.visible(postalCode).sendKeys(zip);
        wait.clickable(continueButton).click();
    }
    public void finish() { wait.clickable(finishButton).click(); }
    public String confirmation() { return wait.visible(confirmation).getText(); }
}