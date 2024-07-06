Feature: Simple Test for login and logout from web https://www.automationexercise.com/


  @tag1
  Scenario: As User I should not be able to login with unregister credentials
  	Given Open chrome and access website
  	When Click button login
  	And Fill field valid Email Address and Password
  	And click button Login
  	Then Success access homepage
