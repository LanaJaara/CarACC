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
}