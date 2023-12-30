package carp;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import path.to.InstallationRequestManager;
import java.util.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class InstallationRequestStep {

    private boolean loggedIn;
    private boolean validInstallationRequest;
    private boolean invalidInstallationRequest;
    private boolean installerAvailabilityVisible;
    private boolean customerLoggedIn;
    private boolean validInstallationAppointmentRequested;
    private InstallationRequestManager requestManager = new InstallationRequestManager();

    private void assertLoggedIn() {
        assert loggedIn : "Customer should be logged in.";
    }

    private void assertValidInstallationRequest() {
        assert validInstallationRequest : "Customers should be able to request a valid installation.";
    }

    private void assertInvalidInstallationRequest() {
        assert invalidInstallationRequest : "Customers should not be able to request an invalid installation.";
    }
    
    private void assertInstallerAvailabilityVisible() {
        assert installerAvailabilityVisible : "Customers should be able to view Installer availability.";
    }

    @Given("the Customer is login with email {string} and password {string}")
    public void customerLogin(String email, String password) {
        // Simulate customer login (for demonstration purposes, always consider secure authentication mechanisms in a real application)
        if ("jodi@gmail.com".equals(email) && "jodi2".equals(password)) {
            customerLoggedIn = true;
        }
    }

    @Given("^Customers request valid installation appointment$")
    public void requestValidInstallationAppointment() {
        
        validInstallationRequest = true; 
    }

    @When("the Customer with email {string} enter installation details with date {string} time {string} product {string}")
    public void the_Customer_with_email_enter_installation_details_with_date_time_product(String email, String date, String time, String product) {
        // Implement the logic to handle installation request
        // Assuming you have a method in InstallationRequestManager to handle requests
        try {
            Date installationDate = parseDate(date);
            requestManager.submitInstallationRequest(email, installationDate, time, product);
        } catch (ParseException e) {
            e.printStackTrace();
            // Handle parsing exception as needed
        }
    }

    private Date parseDate(String date) throws ParseException {
        // Your date parsing logic, adjust as per your requirements
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.parse(date);
    }
    @Then("^Customers can request installation$")
    public void customersCanRequestInstallation() {
        assertLoggedIn();
        assertValidInstallationRequest();
    }

    @Given("Customers request unvalid installation appointment")
    public void customersRequestUnvalidInstallationAppointment() {
        // Simulate an invalid installation appointment request
        validInstallationAppointmentRequested = false;
    }

    private boolean isValidDate(String date) throws ParseException {
        // Validate that the date is in the future (you might have more complex validation logic)
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
        Date currentDate = new Date();
        Date inputDate = sdf.parse(date);
        return inputDate.after(currentDate);
    }

    private boolean isValidTime(String time) {
        // Validate that the time is within working hours (you might have more complex validation logic)
        return !time.isEmpty(); // For simplicity, consider time as valid if not empty
    }

    private boolean isValidProduct(String product) {
        // Validate that the product is valid (you might have more complex validation logic)
        return !product.isEmpty(); // For simplicity, consider the product as valid if not empty
    }

 @When("the Customer with email {string} can View installation requests")
    public void the_Customer_with_email_can_View_installation_requests(String email) {
        // Implement the logic to view installation requests for the customer
        List<InstallationRequestManager.InstallationRequest> installationRequests =
                requestManager.getInstallationRequestsForCustomer(email);

        // Your logic to handle the retrieved installation requests
        if (installationRequests.isEmpty()) {
            System.out.println("No installation requests found for customer: " + email);
        } else {
            System.out.println("Installation requests for customer: " + email);
            for (InstallationRequestManager.InstallationRequest request : installationRequests) {
                System.out.println("Date: " + request.getInstallationDate() +
                        ", Time: " + request.getInstallationTime() +
                        ", Product: " + request.getProduct());
            }
        }
    }
    @Then("Customers cant request installation")
    public void customersCantRequestInstallation() {
        // Throw an exception if the conditions for a valid installation request are not met
        if (!customerLoggedIn || !validInstallationAppointmentRequested) {
            throw new RuntimeException("Customers can't request installation.");
        }
    }

    @Then("^Customers can view Installer availability and appointment$")
    public void customersCanViewInstallerAvailability() {
        installerAvailabilityVisible = true; // Set to true for demonstration purposes
        assertLoggedIn();
        assertInstallerAvailabilityVisible();
    }
    
 
}
