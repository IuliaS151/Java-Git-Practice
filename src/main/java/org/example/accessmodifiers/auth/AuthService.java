package org.example.accessmodifiers.auth;

import org.example.accessmodifiers.security.User;

public class AuthService {
    public static void main(String[] args) {
        User user = new User("admin", "pass123");

        System.out.println("User: " + user.getUsername());
        // System.out.println(user.password); // ОШИБКА: 'password' является приватным
        // user.authenticate();             // ОШИБКА: 'authenticate()' является приватным
    }
}
