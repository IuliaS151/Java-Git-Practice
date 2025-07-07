package org.example.SetExamples;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

class SessionManager {
    private Set<String> activeSessions;

    public SessionManager() {
        this.activeSessions = new HashSet<>();
    }

    // Добавить новую активную сессию
    public  boolean startSession(String sessionId) {
        if (activeSessions.add(sessionId)) {
            System.out.println("Сессия " + sessionId + " успешно начата.");
            return true;
        } else {
            System.out.println("Сессия " + sessionId + " уже активна.");
            return false;
        }
    }

    // Завершить сессию
    public boolean endSession(String sessionId) {
        if (activeSessions.remove(sessionId)) {
            System.out.println("Сессия " + sessionId + " успешно завершена.");
            return true;
        } else {
            System.out.println("Сессия " + sessionId + " не найдена или уже завершена.");
            return false;
        }
    }

    public boolean isSessionActive(String sessionId){
        return activeSessions.contains(sessionId);
    }

    public  void printActiveSessions() {
        System.out.println("Активные сессии (" + activeSessions.size() + "): " + activeSessions);
    }
}

public class UserSessionExample {
    public static void main(String[] args) {
        SessionManager manager = new SessionManager();

        String user1Session = UUID.randomUUID().toString();
        String user2Session = UUID.randomUUID().toString();
        String user3Session = UUID.randomUUID().toString();

        manager.startSession(user1Session);
        manager.startSession(user2Session);
        manager.startSession(user1Session);

        manager.printActiveSessions();

        System.out.println("\nПроверяем активность сессии " + user2Session + ": " + manager.isSessionActive(user2Session));
        System.out.println("Проверяем активность несуществующей сессии: " + manager.isSessionActive("non-existent-session"));

        manager.endSession(user1Session);
        manager.startSession(user3Session);
        manager.endSession("non-existent-session");

        manager.printActiveSessions();

        manager.endSession(user1Session);
        manager.endSession(user2Session);
        manager.endSession(user3Session);

        manager.printActiveSessions();

    }
}
