Feature: Account Signup

	Scenario: User signsup with already registered email
	Given User is on the Singup login screen
	When User enters sname as "Satti" and semail as "sattiking@yopmail.com"
	And Clicks SignUp
	Then User get's and error showing Email already exists
	
	Scenario: User signsup with new email
	Given User is on the Singup login screen
	When User enters name as "Rajesh" and email as "rajeshg@yopmail.com"
	And Clicks SignUp
	Then User gets navigates to enter info screen
	