Feature: Validate the login Credentials

 

Scenario Outline: Test the validate login

 

Given user is on Loginpage
When userss enters <username> and <password>
And click the login button
Then user should on Homepage

@Positive
Examples:
    |username|password|
    |Admin   |admin123|
    |Hello   |admin123|

    

@Negative
Examples:
    |username|password|
    |Admin1  |admin123|