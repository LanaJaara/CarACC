
package carp;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;
public class user {
    private static boolean loggedIn ;
    private static String email;
    private static String password;
    private List<String> purchaseHistory = new ArrayList<>();
    private List<String> installationRequests = new ArrayList<>();
    private List<String> installerAvailability = new ArrayList<>();

    
    private String productId;
    private String name;
    private String price;
    private String availability;
    private String category;
    private String image;

    
    private String phone;
    
    private String address;
    private int age;
    
    public user(String email, String password) {
        this.email = email;
        this.password = password;
        this.loggedIn = false; // Assuming the user is initially not logged in
    }


    
    public static void setEmail(String email) {
        user.email = email;
    }

    public static void setPassword(String password) {
        user.password = password;
    }

    public static boolean login() {
        // Implement your login logic here
        // For example, compare the email and password with predefined values
        if ("jodi@gmail.com".equals(email) && "jodi2".equals(password)) {
            loggedIn = true;
        }
        return loggedIn;
    }

    public static boolean isLoggedIn() {
        return loggedIn;
    }

    public void viewProfile() {
        // TODO: Add logic to view user profile
        System.out.println("Viewing user profile");
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
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

    public void browseProducts() {
        // TODO: Add logic to browse products
        System.out.println("Browsing products");
        
        String productDetails = "product id: " + productId + ", product name: " + name + ", product price: " + price+ ",product availability: " + availability+",product categories:"+ category + ",product image:"+image;
        System.out.println("the order details: " + productDetails);
    }


    public void makePurchases() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter product id: ");
       productId = scanner.next();
        System.out.print("Enter product name: ");
         name = scanner.next();
        System.out.print("Enter product price: ");
         price = scanner.next();
        System.out.print("Enter product availability: ");
         availability = scanner.next();
        System.out.print("Enter product categories: ");
         category = scanner.next();
        System.out.print("Enter product image: ");
         image = scanner.next();
    }

    public void viewOrders() {
        // TODO: Add logic to view orders
        System.out.println("Viewing orders");
        String orderDetails = "product id: " + productId + ", product name: " + name + ", product price: " + price+ ",product availability: " + availability+",product categories:"+ category + ",product image:"+image;
        System.out.println("the order was purchased: " + orderDetails);
    }

    public void editProfile(String newPass, String newPhone, String newName, String newAddress, String newAge) {
        // TODO: Add logic to edit user profile
        if (loggedIn) {
            setPassword(newPass);
            setPhone(newPhone);
          
            setName(newName);
            setAddress(newAddress);
            setAge(Integer.parseInt(newAge));
            System.out.println("Profile updated successfully!");
        } else {
            System.out.println("User not logged in. Please log in first.");
        }
    }

    private void setName(String newName) {
		// TODO Auto-generated method stub
		
	}


	private void setPhone(String newPhone) {
		// TODO Auto-generated method stub
		
	}


	private void setAge(int parseInt) {
		// TODO Auto-generated method stub
		
	}


	private void setAddress(String newAddress) {
		// TODO Auto-generated method stub
		
	}


	  public void viewInstallationRequests() {
	        // TODO: Add logic to view installation requests
	        if (loggedIn) {
	            // Implement logic to retrieve and display installation requests
	            System.out.println("Viewing Installation Requests:");
	            // Display installation request details
	        } else {
	            System.out.println("User not logged in. Please log in first.");
	        }
	    }

	  public void requestInstallationAppointment(String appointmentDate, String appointmentTime, String product) {
	        // Check if the user is logged in
	        if (isLoggedIn()) {
	            // Check if the requested appointment is valid and available
	            if (isValidAppointment(appointmentDate, appointmentTime, product)) {
	                // If valid, schedule the appointment
	                scheduleAppointment(appointmentDate, appointmentTime, product);
	                System.out.println("Installation appointment requested and scheduled successfully!");
	            } else {
	                // Otherwise, inform the user that the appointment is not valid
	                System.out.println("Invalid appointment request. Please choose a different date, time, or product.");
	            }
	        } else {
	            // Inform the user to log in first
	            System.out.println("User not logged in. Please log in first.");
	        }
	    }
	  private boolean isValidAppointment(String appointmentDate, String appointmentTime, String product) {
	        // Implement your logic to check if the appointment is valid
	        // For example, check if the date is in the future, time is within working hours, etc.
	        // Return true if valid, false otherwise
	        return true; // Placeholder, replace with your validation logic
	    }

	    private void scheduleAppointment(String appointmentDate, String appointmentTime, String product) {
	        // Implement your logic to schedule the appointment
	        // For example, add the appointment details to a list or database
	    	installationRequests.add("Date: " + appointmentDate + ", Time: " + appointmentTime + ", Product: " + product);
	    }
    public void viewInstallerAvailabilityAndAppointments() {
    	 if (loggedIn) {
             // Your logic to retrieve and display installer availability and appointments
             System.out.println("Viewing Installer Availability and Appointments:");
             for (String appointment : installerAvailability) {
                 System.out.println(appointment);
             }
         } else {
             System.out.println("User not logged in. Please log in first.");
         }
     }

	


	

}