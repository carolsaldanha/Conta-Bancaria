package org.caroline.entities;

public class Account {
    private int accountNumber;
    private String name;
    private double amount;

    //construtores
    public Account() {
    }

    public Account(int accountNumber, String name, double amount) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.amount = amount;
    }

    //metodo para fazer o deposito
    public void deposit(double amount) {
        this.amount += amount;
    }

    //metodo para fazer o saque
    public void withdraw(double amount) {
        this.amount -= amount + 5.00;
    }

    //getters e setters
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public String toString() {
        return "Account " + accountNumber
                + ", Holder: " + name
                + ", Balance: $ " + String.format("%.2f", amount);
    }
}
