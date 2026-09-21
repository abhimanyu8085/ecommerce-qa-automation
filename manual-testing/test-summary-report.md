# Test Summary Report

## Project
E-Commerce QA Automation Framework

## Scope
Login, product listing, cart, checkout and logout flows on SauceDemo.

## Designed Coverage
- 15 documented functional test cases
- Positive and negative login scenarios
- Cart validation
- Checkout mandatory-field validation
- Successful checkout
- Logout
- Selenium regression suite

## Execution Status
Manual test cases in this repository are portfolio test designs unless an execution result is explicitly recorded.

Automated tests are configured for local Maven execution and GitHub Actions. The current pass/fail result should be taken from the latest GitHub Actions run or a local TestNG/Surefire report.

## Known Gap
Remove-from-cart is documented manually but is not currently automated.

## Next Improvement
Add remove-from-cart automation and browser parameterization after the existing suite is verified stable.
