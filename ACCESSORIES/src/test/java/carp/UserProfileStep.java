package carp;

import static org.junit.Assert.assertEquals; // You can use other assertion libraries as well
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class UserProfileStep {

    private boolean profileEditedSuccessfully;
    private boolean orderHistoryViewedSuccessfully;
    private boolean installationRequestsViewedSuccessfully;

    @Given("^the Customer is login with email \"LanaJaara@gmail.com\" and password\"lana123\"$")
    public void customerLogin(String email, String password) {
        // Implement login logic
    }

    @When("^the Customer with email \"LanaJaara@gmail.com\" can edit his profile newpass \"2822\", newPhone \"0599354282\", newName \"Mira\", newAddress \"Nablus\", newAge \"21\"$")
    public void customerEditProfile(String email, String newPassword, String newPhone, String newName, String newAddress, String newAge) {
        // Implement profile editing logic
       
        profileEditedSuccessfully = true; // Change this based on your actual logic
    }

    @Then("^Customers can edit their profiles$")
    public void customersCanEditProfiles() {
        // Implement verification logic
        assertEquals(true, profileEditedSuccessfully);
    }

    @When("^the Customer with email \"LanaJaara@gmail.com\" can View order history$")
    public void customerViewOrderHistory(String email) {
        orderHistoryViewedSuccessfully = true; 
    }

    @Then("^Customers can View order history$")
    public void customersCanViewOrderHistory() {
        assertEquals(true, orderHistoryViewedSuccessfully);
    }

    @When("^the Customer with email \"LanaJaara@gmail.com\" can View installation requests$")
    public void customerViewInstallationRequests(String email) {
        installationRequestsViewedSuccessfully = true; // Change this based on your actual logic
    }

    @Then("^Customers can View installation requests$")
    public void customersCanViewInstallationRequests() {
        assertEquals(true, installationRequestsViewedSuccessfully);
    }
}