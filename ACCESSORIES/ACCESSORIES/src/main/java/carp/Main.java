
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
                    if (loggedIn) {
                        adminMenu(admin);
                    }
                    break;
                case 2:
                    // Handle Installer login
                    Installer installer = new Installer();
                    installerLogin(installer);
                    loggedIn = installer.isLoggedIn();
                    if (loggedIn) {
                        installerMenu(installer);
                    }
                    break;
                case 3:
                    // Handle Customer login
                    user customer = new user("jodi@gmail.com", "jodi2");
                    customerLogin(customer);
                    loggedIn = customer.isLoggedIn();
                    if (loggedIn) {
                        customerMenu(customer);
                    }
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

        user.setEmail(email);
        user.setPassword(password);

        if (user.login()) {
            System.out.println("Customer login successful.");
        } else {
            System.out.println("Customer login failed.");
        }
    }

    private static void adminMenu(Admin admin) {
        int selection;
        Scanner scanner = new Scanner(System.in);

        do {
            selection = AdminMenu();

            switch (selection) {
                case 1:
                    // Handle admin profile login
                    System.out.println("Admin Profile");
                    System.out.println("1. View Profile");
                    System.out.println("2. Logout");
                    System.out.print("Enter your choice: ");
                    int profileChoice = scanner.nextInt();

                    switch (profileChoice) {
                        case 1:
                        	
                            System.out.println("Viewing Admin Profile");
                           admin.viewProfile();
                            // Add logic to view admin profile
                            break;
                        case 2:
                            System.out.println("Logging out...");
                            return;
                        default:
                            System.out.println("Invalid choice. Please try again.");
                            break;
                    }
                    break;

                case 2:
                    // Handle admin add product
                    System.out.println("Add Product");
                    System.out.print("Enter product id: ");
                    String productId = scanner.next();
                    System.out.print("Enter product name: ");
                    String name = scanner.next();
                    System.out.print("Enter product price: ");
                    String price = scanner.next();
                    System.out.print("Enter product availability: ");
                    String availability = scanner.next();
                    System.out.print("Enter product categories: ");
                    String categories = scanner.next();
                    System.out.print("Enter product image: ");
                    String image = scanner.next();
                    System.out.println("the product was added");

                    // Add logic to add product
                    admin.addProduct(productId, name, price, availability, categories, image);
                    break;

                case 3:
                    // Handle admin update product
                    System.out.println("Update Product");
                    System.out.print("Enter product id to update: ");
                     productId = scanner.next();
                    System.out.print("Enter new product name: ");
                    name = scanner.next();
                    System.out.print("Enter new product price: ");
                    price = scanner.next();
                    System.out.print("Enter new product availability: ");
                    availability = scanner.next();
                    System.out.print("Enter new product categories: ");
                    categories = scanner.next();
                    System.out.print("Enter new product image: ");
                    image = scanner.next();
                    System.out.println("the product was updated");


                    // Add logic to update product
                    admin.updateProduct(productId,name, price, availability, categories, image);
                    break;

                case 4:
                    // Handle admin delete product
                    System.out.println("Delete Product");
                    System.out.print("Enter product id to delete: ");
                     productId = scanner.next();
                    System.out.println("the product was deleted");

                    // Add logic to delete product
                    admin.deleteProduct(productId);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (selection != 1);
    }

    private static void installerMenu(Installer installer) {
        int selection;
        Scanner scanner = new Scanner(System.in);

        do {
            selection = InstallerMenu();

            switch (selection) {
                case 1:
                    installer.viewProfile();
                    break;
                case 2:
                    installer.viewInstallationRequests();
                    break;
                case 3:
                    installer.scheduleAppointments();
                    break;
                case 4:
                    installer.viewAppointments();
                    break;
                case 5:
                    System.out.println("Logging out...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (true);
    }
    private static void customerMenu(user loggedInUser) {
        int selection;
        Scanner scanner = new Scanner(System.in);

        do {
            selection = CustomerMenu();

            switch (selection) {
                case 1:
                    // Handle user profile login
                    System.out.println("User Profile");
                    System.out.println("1. View Profile");
                    System.out.println("2. Logout");
                    System.out.print("Enter your choice: ");
                    int profileChoice = scanner.nextInt();

                    switch (profileChoice) {
                        case 1:
                            System.out.println("Viewing User Profile");
                            // Add logic to view user profile
                            loggedInUser.viewProfile();
                            break;
                        case 2:
                            System.out.println("Logging out...");
                            return;
                        default:
                            System.out.println("Invalid choice. Please try again.");
                            break;
                    }
                    break;

                case 2:
                    // Handle user browse products
                    System.out.println("Browse Products");
                    // Add logic to browse products
                    loggedInUser.addProduct("2","GreenLight","25","Existing","Interior","greenlight.jpg");
                    loggedInUser.updateProduct(null, null, null, null, null, null);
                    loggedInUser.deleteProduct("5");
                    loggedInUser.browseProducts();
                    System.out.println("the product");
                    break;

                case 3:
                    // Handle user make purchases
                    System.out.println("Make Purchases");
                    // Add logic to make purchases
                    loggedInUser.makePurchases();
                    System.out.println("The product was purchased");
                    break;

                case 4:
                    // Handle user view orders
                    System.out.println("View Orders");
                    // Add logic to view orders
                    loggedInUser.viewOrders();
                    break;

                case 5:
                	
                        // TODO: Add logic to get new profile details from the user
                	System.out.println("Edit the profile:");
                        System.out.print("Enter new password: ");
                        String newPass = scanner.next();
                        System.out.print("Enter new phone: ");
                        String newPhone = scanner.next();
                        System.out.print("Enter new name: ");
                        String newName = scanner.next();
                        System.out.print("Enter new address: ");
                        String newAddress = scanner.next();
                        System.out.print("Enter new age: ");
                        String newAge = scanner.next();

                        // Call the editProfile method
                        loggedInUser.editProfile(newPass, newPhone, newName, newAddress, newAge);


                case 6:
                    // Handle user view installation requests
                    System.out.println("View Installation Requests");
                    // Add logic to view installation requests
                    loggedInUser.viewInstallationRequests();
                    break;

                case 7:
                	 System.out.println("Request Installation Appointment");
                     System.out.print("Enter appointment date (dd-MM-yyyy): ");
                     String appointmentDate = scanner.next();
                     System.out.print("Enter appointment time: ");
                     String appointmentTime = scanner.next();
                     System.out.print("Enter product for installation: ");
                     String product = scanner.next();

                     // Call the requestInstallationAppointment method
                     loggedInUser.requestInstallationAppointment(appointmentDate, appointmentTime, product);
                     break;

                case 8:
                     loggedInUser.viewInstallerAvailabilityAndAppointments();
                     break;
                 default:
                     System.out.println("Invalid choice. Please try again.");
                     break;
      
              
            }
        } while (selection != 1);
    }
    public static int InstallerMenu() {
        int selection;
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nInstaller Menu:");
        System.out.println("    1- login to my profile                 ");
        System.out.println("   2. View Installation Requests               ");
        System.out.println("3. Schedule Appointments");
        System.out.println("   4 - view My appointments      ");

        selection = scanner.nextInt();

        return selection;
    }

    public static int AdminMenu() {
        int selection;
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nAdminMenu:");
        System.out.println("    1- login to my profile                 ");
        System.out.println("   2. add product               ");
        System.out.println("3. update product");
        System.out.println("   4 - delete product      ");

        selection = scanner.nextInt();

        return selection;
    }

    public static int CustomerMenu() {
        int selection;
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nCustomerMenu:");
        System.out.println("    1- login to my profile                 ");
        System.out.println("   2. Browse products               ");
        System.out.println("3. make purchases");
        System.out.println("   4 - view orders      ");
        System.out.println("   5 - 	edit their profiles	  ");
        System.out.println("   6 - 	View  installation requests  ");
        System.out.println("   7 - 	request valid installation appointment  ");
        System.out.println("   8 - 	view Installer availability and appointment   ");

        selection = scanner.nextInt();

        return selection;
    }
}