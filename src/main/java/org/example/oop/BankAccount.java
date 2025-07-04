package org.example.oop;

public class BankAccount {
    private  double balance; // Приватное поле - скрыто

    public BankAccount(double initialBalance) {
        if(initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
            System.out.println("Initial balance cannot be negative. Setting to 0.");
        }
    }

    // Публичный метод для внесения денег (контролируемое изменение)
    public void deposit(double amount) {
        if(amount > 0) {
            this.balance += amount;
            System.out.println("Deposited: " + amount + ". New balance: " + this.balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Публичный метод для снятия денег (контролируемый доступ к данным)
    public void withdraw(double amount) {
        if(amount > 0 && this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Withdrew: " + amount + ". New balance: " + this.balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    // Публичный метод для получения баланса
    public double getBalance(){
        return  this.balance;
    }
}
