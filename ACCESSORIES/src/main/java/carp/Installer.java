package carp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Installer {
    private boolean loggedIn ;
    private String installerEmail;
    private String installerPassword;
    private String installerName;

    
  
    private List<String> installationRequests;
    private List<String> appointments;
    
    
    public Installer() {
    	this.installationRequests = new ArrayList<>();
        this.appointments = new ArrayList<>();
    }

    public void setInstallerEmail(String email) {
        this.installerEmail = email;
    }

    public void setInstallerPassword(String password) {
        this.installerPassword = password;
    }

    public boolean login() {
        // Implement your login logic here for installers
        // For example, compare the installerUsername and installerPassword with predefined values
        if ("aya@gmail.com".equals(installerEmail) && "ayaaya1".equals(installerPassword)) {
            loggedIn = true;
        }
        return loggedIn;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }
    public void viewProfile() {
        // TODO: Add logic to view installer profile
        System.out.println("Viewing Installer Profile");
        System.out.println("Email: " + installerEmail);
        System.out.println("Password: " + installerPassword);


    }

    public void viewInstallationRequests() {
        // TODO: Add logic to view installation requests
        System.out.println("Viewing Installation Requests:");
        for (String request : installationRequests) {
            System.out.println(request);
        }
    }

    public void scheduleAppointments() {
        // TODO: Add logic to schedule appointments
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter date (e.g., 12-8-2023): ");
        String date = scanner.next();
        System.out.print("Enter time (e.g., 8:00PM): ");
        String time = scanner.next();
        System.out.print("Enter product to install: ");
        String productToInstall = scanner.next();

        String appointmentDetails = "Date: " + date + ", Time: " + time + ", Product: " + productToInstall;
        appointments.add(appointmentDetails);

        System.out.println("Appointment scheduled successfully: " + appointmentDetails);
    }

    public void viewAppointments() {
        // TODO: Add logic to view scheduled appointments
        System.out.println("Viewing Scheduled Appointments:");
        for (String appointment : appointments) {
            System.out.println(appointment);
        }
    }

    // Getters, setters, and other existing methods...
}