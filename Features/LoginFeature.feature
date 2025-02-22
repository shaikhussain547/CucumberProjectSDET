Feature: Login 
@sanity
Scenario: Successful Login with Valid Credentials 
	Given User Launch Chrome browser 
	When User opens URL "https://acme-test.uipath.com/login" 
	And User enters Email as "n130547rguktn@gmail.com" and Password as "Hyder#584" 
	And Click on Login 
	Then Page Title should be "ACME System 1 - Dashboard" 
	When User click on Log out link 
	Then Page Title should be "ACME System 1 - Log In" 
	And close browser
@regression
Scenario Outline: Successful Login with Valid Credentials DDT
	Given User Launch Chrome browser 
	When User opens URL "https://acme-test.uipath.com/login" 
	And User enters Email as "<email>" and Password as "<password>" 
	And Click on Login 
	Then Page Title should be "ACME System 1 - Dashboard" 
	When User click on Log out link 
	Then Page Title should be "ACME System 1 - Log In" 
	And close browser
	
Examples:
|email|password|
|n130547@gmail.com|Hyder#584|
|n130547rgu@gmail.com|Hyder#123|
	

