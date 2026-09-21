# Project Walkthrough — Interview Notes

## 30-second explanation
I created an e-commerce QA portfolio project on SauceDemo. I first identified critical user flows such as login, cart, checkout and logout, then documented test scenarios and functional test cases. I automated the regression-friendly flows using Java, Selenium WebDriver, TestNG and Maven with Page Object Model. I also added data-driven login testing, negative checkout validation, screenshots on failure and GitHub Actions configuration.

## Why Page Object Model?
It separates page locators/actions from test logic. If the UI changes, maintenance is focused mainly in the relevant page class instead of every test.

## Why TestNG?
I use TestNG for annotations, assertions, test organization and DataProvider-based test data.

## Why Maven?
Maven manages dependencies and provides a consistent command to execute the suite.

## What would I improve next?
I would first review actual execution reports, stabilize any flaky selectors/waits, then add the remaining cart coverage and browser parameterization.

## Important
Do not say every test passed unless you have checked the latest execution report.
