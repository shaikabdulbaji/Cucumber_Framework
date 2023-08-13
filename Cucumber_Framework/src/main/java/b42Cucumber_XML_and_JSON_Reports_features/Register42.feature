@all
Feature: User Registeration

Background:
Given User navigate to Register Account Page


@register @mandatoryfields @smoke @regression
Scenario: Register with mandatory fields
When User enter below details into the fields
|firstname    |shaik|
|lastname     |abdul|
|emailaddress |shaikbaji8727@gmail.com|
|telephone    |1234567890|
|password     |12345|
And Selects Privacy Policy field
And Clicks on Continue button
Then Account Creaated Successfully.


@register @allfields @smoke @regression
Scenario: Register with All fields
When User enter below details into the fields
|firstname    |shaik|
|lastname     |abdul|
|emailaddress |shaikbaji8727@gmail.com|
|telephone    |1234567890|
|password     |12345|
And Select Yes for Newsletter
And Selects Privacy Policy field
And Clicks on Continue button
Then Account Creaated Successfully. 

@register @withoutfields @regression
Scenario: Register without giving any fields
When User dont enter details into anyfields
And Clicks on Continue button
Then User should get a proper warning message displayed for the mandatory fields.

@register @duplicatefields @regression
Scenario: Register with duplicate fields
When User enter below details into the fields
|firstname    |shaik|
|lastname     |abdul|
|emailaddress |shaikbaji8727@gmail.com|
|telephone    |1234567890|
|password     |12345|
And Selects Privacy Policy field
And Clicks on Continue button
Then Account Creaated Successfully.
And  messaging like duplicate fields.