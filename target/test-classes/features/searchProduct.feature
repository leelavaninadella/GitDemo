Feature: Search and place the order for products

@offersPage
Scenario Outline: Search Experience for product search in both home and offers page

Given User is on Greencart Landing Page
When User searched with ShortName <Name> and extracted actual name of the product
Then User searched for same <Name> shortname in offers page 
And validate product name in offersPage matches with LandingPage 

Examples:
|Name|
|Tom |
|Bee |
|Pot |
