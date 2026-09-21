# E-Commerce QA Automation Framework

A portfolio-ready Quality Assurance project demonstrating UI automation of an e-commerce application using **Java, Selenium WebDriver, TestNG, Maven and Page Object Model (POM)**.

## Project Objective
The goal is to automate critical customer journeys such as login, product search, cart and checkout while maintaining reusable page objects and readable tests.

## Tech Stack
- Java
- Selenium WebDriver
- TestNG
- Maven
- WebDriverManager
- Page Object Model (POM)
- Git & GitHub

## Application Under Test
**SauceDemo** — a public demo e-commerce application used for automation practice.

## Automated Scenarios
1. Valid login
2. Invalid login
3. Add product to cart
4. Complete checkout
5. Logout

## Framework Structure
```
src
├── main/java/com/qa
│   ├── base/BaseTest.java
│   └── pages/
│       ├── LoginPage.java
│       ├── ProductsPage.java
│       ├── CartPage.java
│       └── CheckoutPage.java
└── test/java/com/qa/tests/
    ├── LoginTest.java
    ├── CartTest.java
    └── CheckoutTest.java

manual-testing/
├── test-scenarios.md
├── test-cases.md
├── bug-report.md
└── test-plan.md
```

## How to Run
### Prerequisites
- Java 17+
- Maven
- Chrome
- Git

### Commands
```bash
git clone https://github.com/abhimanyu8085/ecommerce-qa-automation.git
cd ecommerce-qa-automation
mvn clean test
```

## Test Credentials
```
Username: standard_user
Password: secret_sauce
```

## QA Coverage
This repository demonstrates functional testing, positive/negative testing, regression-ready automation, test case design, defect documentation and maintainable automation framework design.

## Author
**Abhimanyu Kumar Ram**  
QA Engineer | Manual & Automation Testing | API Testing | SQL
