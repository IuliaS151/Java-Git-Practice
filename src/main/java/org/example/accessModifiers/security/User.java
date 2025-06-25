package org.example.accessModifiers.security;


public class User {
    private String username; // Приватное поле
    private String password; // Приватное поле
    private int id; // Приватное поле (часто только геттер, без сеттера)

    public User(String username, String password) { // Публичный конструктор
        this.username = username;
        this.password = password;
        this.id = generateUniqueId(); // Используем приватный метод
    }

    private int generateUniqueId() { // Приватный метод
        // Какая-то логика генерации ID, не предназначенная для прямого вызова извне
        return (int) (Math.random() * 100000);
    }

    public String getUsername() { // Публичный геттер для username
        return  username;
    }

    // public String getPassword() { return password; } // Обычно пароли не возвращают
    // public void setPassword(String newPassword) { this.password = newPassword; } // Обычно для паролей сложная логика установки

    private void authenticate() { // Приватный вспомогательный метод аутентификации
        System.out.println("Authenticating " + username + "...");
    }
}

