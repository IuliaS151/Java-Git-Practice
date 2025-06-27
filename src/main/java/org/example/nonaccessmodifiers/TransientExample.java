package org.example.nonaccessmodifiers;

import java.io.*;

class UserData implements Serializable { // Класс должен реализовать Serializable
    String username;
    transient String password; // Это поле не будет сериализовано
    int loginCount;

    public UserData(String username, String password, int loginCount) {
        this.username = username;
        this.password = password;
        this.loginCount = loginCount;
    }

    @Override
    public String toString() {
        return "UserData{username='" + username + "', password='" + password + "', loginCount=" + loginCount + '}';
    }
}

public class TransientExample {
    public static void main(String[] args) {
        UserData user = new UserData("alice", "secretPass", 10);
        System.out.println("Original: " + user);

        try {
            // Сериализация (запись объекта в файл)
            FileOutputStream fileOut = new FileOutputStream("user.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(user);
            out.close();
            fileOut.close();
            System.out.println("User object serialized.");

            // Десериализация (чтение объекта из файла)
            FileInputStream fileIn = new FileInputStream("user.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            UserData deserializedUser = (UserData) in.readObject();
            in.close();
            fileIn.close();

            System.out.println("Deserialized: " + deserializedUser); // Deserialized: UserData{username='alice', password='null', loginCount=10}
            // Пароль стал 'null', так как поле было transient
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
