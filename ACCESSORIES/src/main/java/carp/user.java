package carp;

public class user {
    private static boolean loggedIn = false;
    private static String email;
    private static String password;

    public static void setEmail(String email) {
        user.email = email;
    }

    public static void setPassword(String password) {
        user.password = password;
    }

    public static boolean login() {
        // Implement your login logic here
        // For example, compare the email and password with predefined values
        if ("jodi@gmail.com".equals(email) && "jodi2".equals(password)) {
            loggedIn = true;
        }
        return loggedIn;
    }

    public static boolean isLoggedIn() {
        return loggedIn;
    }
}