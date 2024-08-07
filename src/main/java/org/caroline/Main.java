package org.caroline;

import org.caroline.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter account holder: ");
        String name = sc.nextLine();
        System.out.println("Is there na initial deposit (y/n)? ");
        char response = sc.next().charAt(0);

        double amount;

        if (response == 'y') {
            System.out.println("Enter initial deposit value: ");
            amount = sc.nextDouble();
        } else {
            amount = 0.00;
        }

        Account account = new Account(accountNumber, name, amount);

        System.out.println("Account data: ");
        System.out.println(account);

        System.out.println();
        System.out.println("Enter a deposit value: ");
        amount = sc.nextDouble();
        account.deposit(amount);

        System.out.println("Updated account data: ");
        System.out.println(account);

        System.out.println();
        System.out.println("Enter a withdraw value: ");
        amount = sc.nextDouble();
        account.withdraw(amount);

        System.out.println("Updated account data: ");
        System.out.println(account);
    }
}