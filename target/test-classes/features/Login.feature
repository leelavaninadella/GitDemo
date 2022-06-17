Feature: Application Login



 @WebTest
Scenario: Home page default Login
Given user is on landing page
When user login into application with "jin" and password "1234"
Then Home page is populated
 And cards displayed are "true"
 
 @MobileTest
 Scenario: Home page default Login
Given user is on landing page
When user login into application with "john" and password "3456"
Then Home page is populated
 And cards displayed are "false"
 
 @MobileTest
 Scenario: Home page default Login
Given user is on landing page
When user signup with following details
|LeelaVani | Nadendla | leelavaninadella@gmail.com | 1234 |
Then Home page is populated
 And cards displayed are "false"
 
 @WebTest
 Scenario Outline: Home page default Login
Given user is on landing page
When user login with <userName> and <password>
Then Home page is populated
 And cards displayed are "false"
 
 Examples: 
|userName | password |
|user1 | pass1 |
|user2 | pass2 |
|user3 | pass3 |
|user4 | pass4 |
 


 

