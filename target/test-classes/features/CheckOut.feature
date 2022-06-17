Feature: Place the Order for Products

@placeOrder
Scenario Outline: Search Experience for product search in both home and offers page

Given User is on Greencart Landing Page
When User searched with ShortName <Name> and extracted actual name of the product
And Added "3" items of the selected product to cart
Then User proceeds t Checkout and validate the <Name> items in checkout page
And verify user has ability to enter promocode and place the order

Examples:
|Name|
|Tom |
|Bee |

