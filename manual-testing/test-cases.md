# Functional Test Cases

| ID | Scenario | Steps | Expected Result |
|---|---|---|---|
| TC-01 | Valid login | Enter standard_user / secret_sauce and Login | Products page opens |
| TC-02 | Invalid login | Enter invalid credentials and Login | Error message displayed |
| TC-03 | Blank username | Leave username blank and Login | Username required error |
| TC-04 | Blank password | Enter username, leave password blank | Password required error |
| TC-05 | Product display | Login successfully | Product list visible |
| TC-06 | Add to cart | Click Add to cart for Backpack | Cart count becomes 1 |
| TC-07 | Cart content | Add Backpack and open cart | Correct product displayed |
| TC-08 | Remove product | Remove product from cart | Product removed |
| TC-09 | Checkout navigation | Open cart and click Checkout | Customer information page opens |
| TC-10 | Valid information | Enter first/last name and ZIP | User proceeds to overview |
| TC-11 | Missing first name | Submit without first name | Validation error displayed |
| TC-12 | Missing last name | Submit without last name | Validation error displayed |
| TC-13 | Missing ZIP | Submit without ZIP | Validation error displayed |
| TC-14 | Finish order | Complete checkout and Finish | Success confirmation displayed |
| TC-15 | Logout | Open menu and click Logout | Login page displayed |
