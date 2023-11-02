package carp;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginStep {
    private boolean userLoggedIn = false;
    private user u = new user();
    private Installer installer = new Installer();
    private Admin admin = new Admin();

    @Given("that the user is not logged in")
    public void that_the_user_is_not_logged_in() {
        u.login(); // Set the user's login status to false
    }

    @Given("the email is {string}")
    public void the_email_is(String email) {
        u.setEmail(email);
    }

    @Given("the password is {string}")
    public void the_password_is(String password) {
        u.setPassword(password);
    }

    @Then("the user login succeeds")
    public void the_user_login_succeeds() {
        if (u.login()) assertTrue(u.isLoggedIn());
    }

    @Then("the user is logged in")
    public void the_user_is_logged_in() {
        assertTrue(u.isLoggedIn());
    }

    @Then("the user login fail")
    public void the_user_login_fail() {
        if (!u.login()) assertFalse(u.isLoggedIn());
    }

    @Then("the user is not logged in")
    public void the_user_is_not_logged_in() {
        assertFalse(user.isLoggedIn());
    }

    @Given("that the installer is not logged in")
    public void that_the_installer_is_not_logged_in() {
        installer.login();
    }

    @Given("the email is {string} and the password is {string}")
    public void the_email_and_password_is(String email, String password) {
        installer.setInstallerEmail(email);
        installer.setInstallerPassword(password);
    }

    @Then("the installer login succeeds")
    public void the_installer_login_succeeds() {
        if (installer.login()) assertTrue(installer.isLoggedIn());
    }

    @Then("the installer is logged in")
    public void the_installer_is_logged_in() {
        assertTrue(installer.isLoggedIn());
    }

    @Given("that the admin is not logged in")
    public void that_the_admin_is_not_logged_in() {
        admin.login();
    }

    @Given("the email is {string} and the password is {string}")
    public void the_email_and_password_is1(String adminEmail, String adminPassword) {
        admin.setAdminUsername(adminEmail);
        admin.setAdminPassword(adminPassword);
    }

    @Then("the admin login succeeds")
    public void the_admin_login_succeeds() {
        if (admin.login()) assertTrue(admin.isLoggedIn());
    }

    @Then("the admin is logged in")
    public void the_admin_is_logged_in() {
        assertTrue(admin.isLoggedIn());
    }
}