Feature: User Registeration

Scenario: Register with mandatory fields
Given User navigate to Register Account Page
When User enter first name "shaik" into the First Name Field
And User enter last name "abdul" into the Last Name Field
And User enter email address "shaikbaji8727@gmail.com" into the Email Address Field
And User enter telephone "1234567890" into the Telephone Field
And User enter password "12345" into the Password Field
And User enter password "12345" into the Confirm Password Field
And Selects Privacy Policy field
And Clicks on Continue button
Then Account Creaated Successfully.



Scenario: Register with All fields
Given User navigate to Register Account Page
When User enter first name "shaik" into the First Name Field
And User enter last name "abdul" into the Last Name Field
And User enter email address "shaikbaji8727@gmail.com" into the Email Address Field
And User enter telephone "1234567890" into the Telephone Field
And User enter password "12345" into the Password Field
And User enter password "12345" into the Confirm Password Field
And Select Yes for Newsletter
And Selects Privacy Policy field
And Clicks on Continue button
Then Account Creaated Successfully. 


Scenario: Register withou giving any fields
Given User navigate to Register Account Page
When User dont enter details into anyfields
And Clicks on Continue button
Then User should get a proper warning message displayed for the mandatory fields.


Scenario: Register with duplicate fields
Given User navigate to Register Account Page
When User enter first name "shaik" into the First Name Field
And User enter last name "abdul" into the Last Name Field
And User enter email address "shaikbaji8727@gmail.com" into the Email Address Field
And User enter telephone "1234567890" into the Telephone Field
And User enter password "12345" into the Password Field
And User enter password "12345" into the Confirm Password Field
And Selects Privacy Policy field
And Clicks on Continue button
Then Account Creaated Successfully.
And  messaging like duplicate fields.