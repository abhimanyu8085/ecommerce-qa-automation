# E-Commerce QA Automation Framework

[![Maven UI Tests](https://github.com/abhimanyu8085/ecommerce-qa-automation/actions/workflows/maven-tests.yml/badge.svg)](https://github.com/abhimanyu8085/ecommerce-qa-automation/actions/workflows/maven-tests.yml)

Portfolio QA project covering **Manual Testing + UI Automation** of an e-commerce demo application using Java, Selenium WebDriver, TestNG, Maven and Page Object Model.

## Application Under Test
**SauceDemo** — public demo e-commerce application used for testing practice.

## Tech Stack
Java 17 • Selenium WebDriver • TestNG • Maven • WebDriverManager • Page Object Model • GitHub Actions

## Current Automated Coverage
- Valid and invalid login
- Data-driven login validation
- Blank username/password validation
- Add product to cart
- Cart product verification
- Checkout field validation
- Successful checkout
- Logout
- Automatic screenshots on test failure
- Headless execution support for CI

## Manual QA Documentation
The `manual-testing` directory contains a test plan, test scenarios, functional test cases and a sample defect-report template. Sample defects are explicitly marked as unexecuted and are included to demonstrate defect documentation.

## Framework Structure
```
src/
├── main/java/com/qa/
│   ├── base/
│   ├── pages/
│   └── utils/
└── test/java/com/qa/tests/

manual-testing/
.github/workflows/
pom.xml
testng.xml
```

## Run Locally
Prerequisites: Java 17+, Maven, Chrome and Git.

```bash
git clone https://github.com/abhimanyu8085/ecommerce-qa-automation.git
cd ecommerce-qa-automation
mvn clean test
```

Headless execution:

```bash
mvn clean test -Dheadless=true
```

## CI
GitHub Actions is configured to run the Maven Selenium suite on pushes and pull requests. TestNG/Surefire reports and failure screenshots are uploaded as workflow artifacts when available.

> CI configuration is included in the repository. Check the Actions tab for the latest actual execution status rather than assuming a run passed.

## Test Credentials
```
Username: standard_user
Password: secret_sauce
```

## QA Skills Demonstrated
Functional Testing • Smoke/Regression-ready scenarios • Positive & Negative Testing • Test Case Design • Defect Documentation • Selenium Automation • TestNG • Maven • POM • Data-Driven Testing • CI

## Author
**Abhimanyu Kumar Ram**  
QA Engineer | Manual & Automation Testing | API Testing | SQL
