package org.example.oop;

public class BankingApp {
    public static void main(String[] args){
        BankAccount myAccount = new BankAccount(1000.0);
        // System.out.println(myAccount.balance); // ОШИБКА КОМПИЛЯЦИИ: balance is private

        myAccount.deposit(200.0);
        myAccount.withdraw(50.0);
        myAccount.withdraw(2000);
        System.out.println("Current balance: " + myAccount.getBalance());
    }
}
