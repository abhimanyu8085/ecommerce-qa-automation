package com.qa.utils;

public final class ConfigReader {
    private ConfigReader() {}
    public static String baseUrl() { return System.getProperty("baseUrl", "https://www.saucedemo.com/"); }
    public static String username() { return System.getProperty("username", "standard_user"); }
    public static String password() { return System.getProperty("password", "secret_sauce"); }
}