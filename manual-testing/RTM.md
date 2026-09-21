# Requirement Traceability Matrix (RTM)

This lightweight RTM maps the portfolio requirements to manual and automated coverage.

| Req ID | Requirement | Manual Cases | Automation |
|---|---|---|---|
| REQ-01 | User can authenticate with valid credentials | TC-01 | LoginTest, LoginDataTest |
| REQ-02 | Invalid/blank credentials are rejected | TC-02–TC-04 | LoginTest, LoginDataTest |
| REQ-03 | Authenticated user can view products | TC-05 | LoginTest |
| REQ-04 | User can add a product to cart | TC-06–TC-07 | CartTest |
| REQ-05 | User can remove products from cart | TC-08 | Planned |
| REQ-06 | User can navigate to checkout | TC-09 | CheckoutTest |
| REQ-07 | Checkout validates required customer fields | TC-11–TC-13 | CheckoutValidationTest |
| REQ-08 | User can successfully complete an order | TC-10, TC-14 | CheckoutTest |
| REQ-09 | User can log out | TC-15 | LogoutTest |

**Note:** “Planned” is intentionally used where automation has not yet been implemented.
