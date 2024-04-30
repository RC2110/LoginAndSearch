Feature: Verifying the OMR login and Amazon search page	   
	
	Scenario Outline: Verifying the login credentials of OMR Page
		Given User is on OMR page
		When User enter the "<userName>" and "<passWord>"
		And User click the Login button
		Then Verifying successful login messgage
		
		Examples:
		
		   |userName|passWord|
		   |rajaachandramohan@gmail.com|Ayyappan!1991|
		   
	Scenario Outline: Verifying the search functionality of Amazon page
		Given User is on Amazon page
		When User enter the "<productName>" 
		Then verify search results message
		
		Examples: 
		 |productName|
		 |iPhone|