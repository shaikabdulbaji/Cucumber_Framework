
@all
Feature: User Login Successfully
Register User should be able to login to access account details

@login @validcredentials @all @smoke @regression @dev
Scenario Outline: Login with valid credentials
Given User navigate to login page
When User enters valid email address <email>
And Enter valid password <password>
And User should login successfully.
Then click on login button
Examples: 
|         email		    	|password|		
|amotooricap1@gmail.com |12345|
|amotooricap3@gmail.com |12345|
|amotooricap9@gmail.com |12345| 

@login @invalidcredentials @smoke @regression @wip
Scenario: Login with invalid credentials
Given User navigate to login page
When User enters invalid email address "amotooricap11111@gmail.com"
And Enter invalid password "json"
Then click on login button
And User should get a proper warning message.

@login @validemailandinvalidpassword @regression
Scenario: Login with valid email address and invalid password credentials
Given User navigate to login page
When User enters invalid email address "amotooricap1@gmail.com"
And Enter invalid password "json"
Then click on login button
And User should get a proper warning message.


@login @invalidemailandvalidpassword @regression
Scenario: Login with invalid email address and valid password credentials
Given User navigate to login page
When User enters invalid email address "amotooricap11111@gmail.com"
And Enter invalid password "12345"
Then click on login button
And User should get a proper warning message.


@login @invalidemailandinvalidpassword @regression
Scenario: Login with invalid email address and invalid password credentials
Given User navigate to login page
When User enters invalid email address "amotooricap11111@gmail.com"
And Enter invalid password "json"
Then click on login button
And User should get a proper warning message.

@login @nocredentials @regression @ignore
Scenario: Login with without credentials
Given User navigate to login page
When User not enter email address 
And Enter no password 
Then click on login button
And User should get a proper warning message.