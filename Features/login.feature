Feature: Login into the app
	Scenario: Login with valid credentials
		Given Open the application
		And Click on the Login or Signup
		When User enter email as "sattiking@yopmail.com" and password as "Satti@123"
		And Clicks login button
		Then User navigated to home screen and logout button appears 