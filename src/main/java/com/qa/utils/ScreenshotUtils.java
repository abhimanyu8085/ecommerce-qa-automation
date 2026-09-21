package com.qa.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import org.openqa.selenium.*;

public final class ScreenshotUtils {
    private ScreenshotUtils() {}
    public static String capture(WebDriver driver, String testName) {
        try {
            Files.createDirectories(Paths.get("screenshots"));
            String path = "screenshots/" + testName + "-" + System.currentTimeMillis() + ".png";
            File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            Files.copy(source.toPath(), Paths.get(path), StandardCopyOption.REPLACE_EXISTING);
            return path;
        } catch (IOException | WebDriverException e) {
            return "Screenshot capture failed: " + e.getMessage();
        }
    }
}