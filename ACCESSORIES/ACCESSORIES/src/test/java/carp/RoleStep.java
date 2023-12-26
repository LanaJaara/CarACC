package carp;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class RoleStep {
    private boolean adminLoggedIn = false;
    private boolean customerLoggedIn = false;
    private boolean installerLoggedIn = false;

    private boolean productAdded = false;
    private boolean productUpdated = false;
    private boolean productDeleted = false;

    private boolean purchaseMade = false;
    private boolean orderViewed = false;

    private boolean installationRequestsViewed =false ;
    private boolean appointmentsScheduled = false;

    @Given("^that the Admin is logged in$")
    public void adminLogin() {
        // Implement admin login logic (replace with actual logic)
        adminLoggedIn = true;
    }

    @When("^the Admin can add product id \"2\", name \"GreenLight\" , price \"25\" , availability \"Existing\" , categories \"Interior\" , image \"greenlight.jpg\"$")
    public void adminAddProduct(String productId, String name, String price, String availability, String categories, String image) {
        // Implement admin add product logic (replace with actual logic)
        productAdded = true;
    }

    @Then("^Admin can add product$")
    public void adminCanAddProduct() {
        // Implement verification logic for admin add product (replace with actual logic)
        assert adminLoggedIn && productAdded : "Admin should be logged in and product should be added";
    }

    @When("^the Admin can update the product id \"5\", name \"Wheels\" , price \"30\" , availability \"Existing\" , categories \"Interior\" , image \"wheels.jpg\"$")
    public void adminUpdateProduct(String productId, String name, String price, String availability, String categories, String image) {
        // Implement admin update product logic (replace with actual logic)
        productUpdated = true;
    }

    @Then("^Admin can update product$")
    public void adminCanUpdateProduct() {
        // Implement verification logic for admin update product (replace with actual logic)
        assert adminLoggedIn && productUpdated : "Admin should be logged in and product should be updated";
    }

    @When("^the product id \"5\"$")
    public void adminDeleteProduct(String productId) {
        // Implement admin delete product logic (replace with actual logic)
        productDeleted = true;
    }

    @Then("^the Admin can delete the product$")
    public void adminCanDeleteProduct() {
        // Implement verification logic for admin delete product (replace with actual logic)
        assert adminLoggedIn && productDeleted : "Admin should be logged in and product should be deleted";
    }

    @Given("^that the Customer logged in with the email \"jodi@gmail.com\"$")
    public void customerLogin(String email) {
        // Implement customer login logic (replace with actual logic)
        customerLoggedIn = true;
    }

    @Then("^the Customer can Browse products$")
    public void customerCanBrowseProducts() {
        // Implement verification logic for customer browse products (replace with actual logic)
        assert customerLoggedIn : "Customer should be logged in to browse products";
    }

    @When("^the id \"2\", name \"GreenLight\" , price \"25\" , availability \"Existing\" , categories \"Interior\" , image \"greenlight.jpg\"$")
    public void customerMakePurchase(String productId, String name, String price, String availability, String categories, String image) {
        // Implement customer make purchase logic (replace with actual logic)
        purchaseMade = true;
    }

    @Then("^the Customer can make purchases$")
    public void customerCanMakePurchases() {
        // Implement verification logic for customer make purchases (replace with actual logic)
        assert customerLoggedIn && purchaseMade : "Customer should be logged in and purchase should be made";
    }

    @Then("^the Customer can view orders$")
    public void customerCanViewOrders() {
        // Implement verification logic for customer view orders (replace with actual logic)
        assert customerLoggedIn : "Customer should be logged in to view orders";
        orderViewed = true;
    }

    @Given("^that the Installer is logged in$")
    public void installerLogin() {
        // Implement installer login logic (replace with actual logic)
        installerLoggedIn = true;
    }

    @Then("^the Installer can View installation requests$")
    public void installerCanViewInstallationRequests() {
        // Implement verification logic for installer view installation requests (replace with actual logic)
        assert installerLoggedIn : "Installer should be logged in to view installation requests";
        installationRequestsViewed = true;
    }

    @When("^the Installer can schedule appointments with date \"12-8-2023\", time \"8:00PM\", and product to install \"Wheels\"$")
    public void installerScheduleAppointments(String date, String time, String product) {
        // Implement installer schedule appointments logic (replace with actual logic)
        appointmentsScheduled = true;
    }

    @Then("^the Installer can schedule appointments$")
    public void installerCanScheduleAppointments() {
        // Implement verification logic for installer schedule appointments (replace with actual logic)
        assert installerLoggedIn && appointmentsScheduled : "Installer should be logged in and appointments should be scheduled";
    }
}