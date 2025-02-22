Feature: Vendors
@sanity
Scenario: Search a vendor
	Given User Launch Chrome browser 
	When User opens URL "https://acme-test.uipath.com/login" 
	And User enters Email as "n130547rguktn@gmail.com" and Password as "Hyder#584" 
	And Click on Login 
	Then User can view Dashboard
	When User hover to Vendors tab
	And Click on Search for Vendor
	Then User can view Vendors page
	When User enter TaxID
	And Click on search
	Then User can view Vendors search results
	When User extract vendor name
	And close browser

@regression
Scenario: Search a vendor
	Given User Launch Chrome browser 
	When User opens URL "https://acme-test.uipath.com/login" 
	And User enters Email as "n130547rguktn@gmail.com" and Password as "Hyder#584" 
	And Click on Login 
	Then User can view Dashboard
	When User hover to Vendors tab
	And Click on Vendor Inventory
	Then User can view Vendors inventory page
	When User select vendor code from dropdown
	And Click on check inventory
	Then User can view Vendors inventory results
	And close browser
