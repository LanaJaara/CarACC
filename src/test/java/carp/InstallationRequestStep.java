package carp;

import io.cucumber.java.en.Given;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

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
    public void enterInstallationDetails(String email, String date, String time, String product) {
        // Validate installation details
        try {
            if (customerLoggedIn && isValidDate(date) && isValidTime(time) && isValidProduct(product)) {
                validInstallationAppointmentRequested = true;
            }
        } catch (ParseException e) {
            // Handle parsing exceptions if needed
            e.printStackTrace();
        }
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
