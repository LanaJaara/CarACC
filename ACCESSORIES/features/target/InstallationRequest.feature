Feature: Installation Requests

    Scenario: Customers request valid installation appointment
  
    Given the Customer is login with email "LanaJaara@gmail.com" and password "lana123"
    And Customers request valid installation appointment
    When the Customer with email "LanaJaara@gmail.com"  enter installation details with date "12-4-2021"  time "8:00"  product "bluelight"
    Then Customers can request installation
    
    
    
     Scenario: Customers request unvalid installation appointment
  
    Given the Customer is login with email "LanaJaara@gmail.com" and password "lana123"
    And Customers request unvalid installation appointment
    When the Customer with email "LanaJaara@gmail.com"  enter installation details with date "12-8-2021"  time "4:00"  product "bluelight"
    Then Customers cant request installation
    
    
    
      Scenario: Customers can view Installer availability and appointment 
   
      Given the Customer is login with email "LanaJaara@gmail.com" and password "lana123"
      Then Customers can view Installer availability and appointment