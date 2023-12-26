Feature: user role to the Car accessories 
	
Scenario: Admin role can add products
	Given that the Admin is logged in
	And the email is "lana@gmail.com"
	And the password is "lana"
	When the Admin can add product id "2", name "GreenLight" , price "25" , availability "Existing" , categories "Interior" , image "greenlight.jpg"
  Then Admin can add product
	
	
	
	Scenario: Admin role can update the products
	Given that the Admin is logged in
	And the email is "lana@gmail.com"
	And the password is "lana"
	When the Admin can update the product id "5", name "Wheels" , price "30" , availability "Existing" , categories "Interior" , image "wheels.jpg"
  Then Admin can update product
	

  Scenario: Admin role can delete the products
	Given that the Admin is logged in
	And the email is "lana@gmail.com"
	And the password is "lana"
	When the product id "5"
	Then the Admin can delete the product
	
	
	
	
	Scenario: Customer can Browse products 
	Given that the Customer logged in with the email "jodi@gmail.com"
	And the password is "jodi2"
	Then the Customer can Browse products
	
	
	Scenario: Customer can make purchases 
	Given that the Customer logged in with the email "jodi@gmail.com"
	And the password is "jodi2"
	When the id "2", name "GreenLight" , price "25" , availability "Existing" , categories "Interior" , image "greenlight.jpg"
	Then the Customer can make purchases
	
	Scenario: Customer can view orders
	Given that the Customer logged in with the email "jodi@gmail.com"
	And the password is "jodi2"
	Then the Customer can view orders
	
	
	
	Scenario:  Installer role can View installation requests
	Given that the Installer is logged in 
	And the email is "aya@gmail.com"
	And the password is "ayaaya1"
	Then the Installer can View installation requests
	
	Scenario:  Installer role can schedule appointments
	Given that the Installer is logged in 
	And the email is "aya@gmail.com"
	And the password is "ayaaya1"
	When the Installer can schedule appointments with date "12-8-2023", time "8:00PM", and product to install "Wheels"
	Then the Installer can schedule appointments

