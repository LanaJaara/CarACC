
package carp;
import java.util.Scanner;


public class Main {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        boolean loggedIn = false;
	        
	        while (!loggedIn) {
	            System.out.println("Main Menu");
	            System.out.println("1. Log in as Admin");
	            System.out.println("2. Log in as Installer");
	            System.out.println("3. Log in as Customer");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            
	            int choice = scanner.nextInt();
	            
	            switch (choice) {
	                case 1:
	                    // Handle Admin login
	                    Admin admin = new Admin();
	                    adminLogin(admin);
	                    loggedIn = admin.isLoggedIn();
	                    break;
	                case 2:
	                    // Handle Installer login
	                    Installer installer = new Installer();
	                    installerLogin(installer);
	                    loggedIn = installer.isLoggedIn();
	                    break;
	                case 3:
	                    // Handle Customer login
	                    user customer = new user();
	                    customerLogin(customer);
	                    loggedIn = customer.isLoggedIn();
	                    break;
	                case 4:
	                    System.out.println("Exiting...");
	                    System.exit(0);
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	                    break;
	            }
	        }
	        
	        // At this point, the user is logged in and you can continue with the respective role.
	        System.out.println("You are now logged in as " + (loggedIn ? "Admin/Installer/Customer" : "Unknown"));
	    }
	    
	    private static void adminLogin(Admin admin) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter admin email: ");
	        String email = scanner.next();
	        System.out.print("Enter admin password: ");
	        String password = scanner.next();
	        
	        admin.setAdminUsername(email);
	        admin.setAdminPassword(password);
	        
	        if (admin.login()) {
	            System.out.println("Admin login successful.");
	        } else {
	            System.out.println("Admin login failed.");
	        }
	    }
	    
	    private static void installerLogin(Installer installer) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter installer email: ");
	        String email = scanner.next();
	        System.out.print("Enter installer password: ");
	        String password = scanner.next();
	        
	        installer.setInstallerEmail(email);
	        installer.setInstallerPassword(password);
	        
	        if (installer.login()) {
	            System.out.println("Installer login successful.");
	        } else {
	            System.out.println("Installer login failed.");
	        }
	    }
	    
	    private static void customerLogin(user customer) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter customer email: ");
	        String email = scanner.next();
	        System.out.print("Enter customer password: ");
	        String password = scanner.next();
	        
	        customer.setEmail(email);
	        customer.setPassword(password);
	        
	        if (customer.login()) {
	            System.out.println("Customer login successful.");
	        } else {
	            System.out.println("Customer login failed.");
	        }
	    }

	
	
}
