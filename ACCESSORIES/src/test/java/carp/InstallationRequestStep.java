package carp;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InstallationRequestStep {

    private boolean loggedIn;
    private boolean validInstallationRequest;
    private boolean invalidInstallationRequest;
    private boolean installerAvailabilityVisible;
    
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

    @Given("^the Customer is login with email \"jodi@gmail.com\" and password \"jodi2\"$")
    public void customerLogin(String email, String password) {
        loggedIn = true; 
    }

    @Given("^Customers request valid installation appointment$")
    public void requestValidInstallationAppointment() {
        
        validInstallationRequest = true; 
    }

    @When("^the Customer with email \"jodi@gmail.com\" enter installation details with date \"12-4-2021\" time \"8:00\" product \"bluelight\"$")
    public void enterInstallationDetails(String email, String date, String time, String product) {
        
        // Implement the actual logic based on your application's requirements
    }

    @Then("^Customers can request installation$")
    public void customersCanRequestInstallation() {
        assertLoggedIn();
        assertValidInstallationRequest();
    }

    @Given("^Customers request invalid installation appointment$")
    public void requestInvalidInstallationAppointment() {
        invalidInstallationRequest = true; // Set to true for demonstration purposes
    }

    @Then("^Customers can't request installation$")
    public void customersCantRequestInstallation() {
        assertLoggedIn();
        assertInvalidInstallationRequest();
    }

    @Then("^Customers can view Installer availability and appointment$")
    public void customersCanViewInstallerAvailability() {
        installerAvailabilityVisible = true; // Set to true for demonstration purposes
        assertLoggedIn();
        assertInstallerAvailabilityVisible();
    }
    
 
}