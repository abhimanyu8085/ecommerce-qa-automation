# Sample Defect Report

> This file demonstrates defect-documentation format. The entries below are sample defects for portfolio practice and are not claims about current production defects.

## BUG-001
**Title:** Checkout should prevent submission when postal code is blank  
**Module:** Checkout  
**Severity:** Major  
**Priority:** High  
**Precondition:** User is logged in and has an item in the cart.

**Steps**
1. Open Cart.
2. Click Checkout.
3. Enter first and last name.
4. Leave postal code blank.
5. Click Continue.

**Expected:** Validation message should be displayed and checkout should not continue.  
**Actual (sample):** User proceeds to checkout overview.  
**Status:** Sample / Not executed

## Defect Template
- Bug ID
- Summary
- Environment
- Preconditions
- Steps to Reproduce
- Expected Result
- Actual Result
- Severity
- Priority
- Evidence
- Status
