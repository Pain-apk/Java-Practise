package test;

import java.util.Scanner;

// Class representing a bank account
public class Account {

    // Method for withdrawing money from the account
    static int WithDraw(int amount, double withdraw) {
        // Check if the account has sufficient balance
        if (amount > withdraw) {
            // Deduct the withdrawal amount from the balance
            amount -= withdraw;
        } else {
            // Print a message if the balance is insufficient
            System.out.println("Insufficient amount");
        }
        // Return the updated balance
        return amount;
    }

    // Method for depositing money into the account
    static int Deposit(int amount, double deposit) {
        // Check if the deposit amount is valid
        if (deposit > 0) {
            // Add the deposit amount to the balance
            amount += deposit;
        } else {
            // Print a message if the deposit amount is invalid
            System.out.println("Invalid amount");
        }
        // Return the updated balance
        return amount;
    }

    // Default constructor for the Account class
    public Account() {
        // No specific initialization required
    }

    // Main method to execute the program
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the account number
        System.out.print("Enter Account Number: ");
        String number = sc.nextLine();

        // Prompt the user to enter the account name
        System.out.print("Enter Account Name: ");
        String name = sc.nextLine();

        // Prompt the user to enter the initial account balance
        System.out.print("Enter Account Balance: ");
        int balance1 = sc.nextInt();

        // Prompt the user to enter the amount to deposit
        System.out.println("Enter the amount to deposit");
        double depositAmt = sc.nextDouble();
        // Update the balance after deposit
        balance1 = Deposit(balance1, depositAmt);

        // Prompt the user to enter the amount to withdraw
        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = sc.nextDouble();
        // Update the balance after withdrawal
        balance1 = WithDraw(balance1, withdrawAmount);

        // Print the updated balance after withdrawal
        System.out.println("Withdrawal successful! Current balance: " + balance1);

        // Close the Scanner object
        sc.close();

        // Print exit message
        System.out.println("Exit Code");
    }
}