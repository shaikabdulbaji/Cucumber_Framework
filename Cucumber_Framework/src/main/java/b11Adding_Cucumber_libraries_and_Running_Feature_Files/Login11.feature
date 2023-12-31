Feature: User Login Successfully
Register User should be able to login to access account details

Scenario: Login with valid credentials
Given User navigate to login page
When User enters valid email address "amotooricap1@gmail.com"
And Enter valid password "12345"
Then click on login button
And User should login successfully.

Scenario: Login with invalid credentials
Given User navigate to login page
When User enters invalid email address "amotooricap11111@gmail.com"
And Enter invalid password "json"
Then click on login button
And User should get a proper warning message.

Scenario: Login with valid email address and invalid password credentials
Given User navigate to login page
When User enters invalid email address "amotooricap1@gmail.com"
And Enter invalid password "json"
Then click on login button
And User should get a proper warning message.

Scenario: Login with invalid email address and valid password credentials
Given User navigate to login page
When User enters invalid email address "amotooricap11111@gmail.com"
And Enter invalid password "12345"
Then click on login button
And User should get a proper warning message.

Scenario: Login with invalid email address and invalid password credentials
Given User navigate to login page
When User enters invalid email address "amotooricap11111@gmail.com"
And Enter invalid password "json"
Then click on login button
And User should get a proper warning message.

Scenario: Login with without any credentials
Given User navigate to login page
When User enters invalid email address " "
And Enter invalid password " "
Then click on login button
And User should get a proper warning message.

























#@tag
#Feature: Title of your feature
  #I want to use this template for my feature file
#
  #@tag1
  #Scenario: Title of your scenario
    #Given I want to write a step with precondition
    #And some other precondition
    #When I complete action
    #And some other action
    #And yet another action
    #Then I validate the outcomes
    #And check more outcomes
#
  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
