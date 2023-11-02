package carp;

public class Installer {
    private boolean loggedIn = false;
    private String installerEmail;
    private String installerPassword;

    public Installer() {
        // Constructor for the Installer class
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
}

