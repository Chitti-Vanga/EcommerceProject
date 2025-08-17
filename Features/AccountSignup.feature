Feature: Account Signup

	Scenario: User signs us with already registered email
	Given User is on the Sinup login screen
	When User enters sname as "Satti" and semail as "sattiking@yopmail.com"
	And Clicks SignUp
	Then User get's and error showing Email already exists
	