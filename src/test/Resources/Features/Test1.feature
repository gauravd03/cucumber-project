Feature: Test the login functionality


@t1
Scenario: validate login with valid credential
Given user should be on login page
When user enters "Admin" and "admin123"
And user click on login button
Then  user should success	fully get loged in 