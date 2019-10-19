Feature: Create account of Facebook

Scenario: Validate First Name faeld
Given User need to be on Facebook login page
When User enters user first name 
Then User checks user first name is present
Then close browser


Scenario: validate create user multiple field
Given User need to be on Facebook login page
When User enters user first name
And User enters user surname
Then User checks user first name is present 
But User mobile field shoulde be blank 
Then close browser
