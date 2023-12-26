package carp;

public class Admin {
    private boolean loggedIn = false;
    private String adminEmail;
    private String adminPassword;
    
    


    public Admin() {
        // Constructor for the Admin class
    }

    public void setAdminUsername(String username) {
        this.adminEmail = username;
    }

    public void setAdminPassword(String password) {
        this.adminPassword = password;
    }

    public boolean login() {
    	
        if ("lana@gmail.com".equals(adminEmail) && "lana".equals(adminPassword)) {
            loggedIn = true;
        }
        return loggedIn;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }
    
    
    public void viewProfile() {
        // TODO: Add logic to view user profile
        System.out.println("Viewing user profile");
        System.out.println("Email: " + adminEmail);
        System.out.println("Password: " + adminPassword);
       
       

    }

	public void updateProduct(String productId, String name, String price, String availability,
			String categories, String image) {
		// TODO Auto-generated method stub
		
	}

	public void deleteProduct(String productId) {
		// TODO Auto-generated method stub
		
	}

	public void addProduct(String productId, String name, String price, String availability, String categories,
			String image) {
		// TODO Auto-generated method stub
		
	}


}