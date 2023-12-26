Feature: User Profile



    
  Scenario: Customers can edit their profiles 
   Given the Customer is login with email "jodi@gmail.com" and password "jodi2"
   When the Customer with email "jodi@gmail.com" can edit his profile newpass"2822",newPhone"0599354282",newName"Mira",newAddress"Nablus",newAge"21"
    Then Customers can edit their profiles 
    
    

     Scenario: Customers can View order history
   Given the Customer is login with email "jodi@gmail.com" and password "jodi2"
    When the Customer  with email "jodi@gmail.com" can View order history
    Then Customers can View order history
    
    
       Scenario: Customers can View  installation requests
   Given the Customer is login with email "jodi@gmail.com" and password "jodi2"
    When the Customer  with email "jodi@gmail.com" can View  installation requests
    Then Customers can View  installation requests
