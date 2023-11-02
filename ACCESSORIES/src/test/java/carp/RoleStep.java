package carp;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class RoleStep {
    private boolean adminLoggedIn = false;
    private boolean customerLoggedIn = false;
    private boolean installerLoggedIn = false;
    private Product adminProduct;
    private Product customerProduct;
    private Product installerProduct;

    @Given("that the Admin is logged in")
    public void that_the_Admin_is_logged_in() {
        // Implement logic to simulate admin login
        adminLoggedIn = true; 
    }

    @When("the Admin can add product id {string}, name {string}, price {string}, availability {string}, categories {string}, image {string}")
    public void the_Admin_can_add_product_id_name_price_availability_categories_image(
        String productId, String name, String price, String availability, String categories, String image) {
        adminProduct = new Product(productId, name, price, availability, categories, image);
    }

    @Then("Admin can add product")
    public void admin_can_add_product() {
        assert adminProduct != null;
    }

    @When("the Admin can update the product id {string}, name {string}, price {string}, availability {string}, categories {string}, image {string}")
    public void the_Admin_can_update_the_product_id_name_price_availability_categories_image(
        String productId, String name, String price, String availability, String categories, String image) {
        adminProduct.update(name, price, availability, categories, image);
    }

    @Then("Admin can update product")
    public void admin_can_update_product() {
    	
        assert adminProduct.isUpdated();
    }

    @When("the product id {string}")
    public void the_product_id(String productId) {
       
        if (adminProduct.getId().equals(productId)) {
            adminProduct.delete();
        }
    }

    @Then("the Admin can delete the product")
    public void the_Admin_can_delete_the_product() {
        
        assert adminProduct.isDeleted();
    }

    @Given("that the Customer logged in with the email {string}")
    public void that_the_Customer_logged_in_with_the_email(String email) {
       
        customerLoggedIn = true; 
    }

    @Then("the Customer can Browse products") 
    public void the_Customer_can_Browse_products()
    {
        
        assert customerLoggedIn;
    }

    @When("the id {string}, name {string}, price {string}, availability {string}, categories {string}, image {string}")
    public void the_id_name_price_availability_categories_image(
        String productId, String name, String price, String availability, String categories, String image) {
        
        customerProduct = new Product(productId, name, price, availability, categories, image);
    }

    @Then("the Customer can make purchases") 
    public void the_Customer_can_make_purchases()
    {
        
        assert customerProduct != null;
    }

    @Then("the Customer can view orders")
    public void the_Customer_can_view_orders()
    {
        
        assert customerProduct.hasOrders();
    }

    @Given("that the Installer is logged in")
    public void that_the_Installer_is_logged_in() {
        installerLoggedIn = true; 
    }

    @Then("the Installer can View installation requests") 
    public void the_Installer_can_View_installation_requests()
    {
        assert installerLoggedIn;
    }
    
    @When("the Installer can schedule appointments with date {string}, time {string}, and product to install {string}")
    public void the_Installer_can_schedule_appointments_with_date_time_and_product_to_install(
        String date, String time, String productId) {
        
        installerProduct = new Product(productId, date, time);
    }

    @Then("the Installer can schedule appointments")
    public void the_Installer_can_schedule_appointments()
    {
       
        assert installerProduct.isScheduled();
    }
}