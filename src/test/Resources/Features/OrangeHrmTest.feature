Feature: validate admin login page


Scenario: valdate is user logged in
	Given user should open URL
	When users enter "Admin" and "admin123"
	And user should login
	When user click on admin button
	Then user should get on admin page
	

