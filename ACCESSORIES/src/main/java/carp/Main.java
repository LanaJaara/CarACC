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
                        adminMenu();
                    }
                    break;
                case 2:
                    // Handle Installer login
                    Installer installer = new Installer();
                    installerLogin(installer);
                    loggedIn = installer.isLoggedIn();
                    if (loggedIn) {
                        installerMenu();
                    }
                    break;
                case 3:
                    // Handle Customer login
                    user customer = new user();
                    customerLogin(customer);
                    loggedIn = customer.isLoggedIn();
                    if (loggedIn) {
                        customerMenu();
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

        user.setEmail(email);
        user.setPassword(password);

        if (user.login()) {
            System.out.println("Customer login successful.");
        } else {
            System.out.println("Customer login failed.");
        }
    }

    private static void adminMenu() {
        int selection;
        Scanner scanner = new Scanner(System.in);

        do {
            selection = AdminMenu();

            switch (selection) {
                case 1:
                    // Handle admin profile login
                    break;
                case 2:
                    // Handle admin add product
                    break;
                case 3:
                    // Handle admin update product
                    break;
                case 4:
                    // Handle admin delete product
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (selection != 1);
    }

    private static void installerMenu() {
        int selection;
        Scanner scanner = new Scanner(System.in);

        do {
            selection = InstallerMenu();

            switch (selection) {
                case 1:
                    // Handle installer profile login
                    break;
                case 2:
                    // Handle installer view installation requests
                    break;
                case 3:
                    // Handle installer schedule appointments
                    break;
                case 4:
                    // Handle installer view appointments
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (selection != 1);
    }

    private static void customerMenu() {
        int selection;
        Scanner scanner = new Scanner(System.in);

        do {
            selection = CustomerMenu();

            switch (selection) {
                case 1:
                    // Handle customer profile login
                    break;
                case 2:
                    // Handle customer browse products
                    break;
                case 3:
                    // Handle customer make purchases
                    break;
                case 4:
                    // Handle customer view orders
                    break;
                case 5:
                    // Handle customer edit profile
                    break;
                case 6:
                    // Handle customer view installation requests
                    break;
                case 7:
                    // Handle customer request installation appointment
                    break;
                case 8:
                    // Handle customer view installer availability and appointment
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