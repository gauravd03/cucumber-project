Feature: Test the loging functionality of OrangeHRM

@t1
Scenario: Test the Login with user name passward

Given To Should be on "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login" page
When User Should enters userName and passWord

|admin|admin1|
|admin|admin12|
|admin|admin123|
|Admin|admin123|

Then Validate Homepage