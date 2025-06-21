package MiniProject.Atm;

import java.util.Scanner;

public class Atm {

    private final int atmPin = 2626;
    private double balance = 323232.232;
    private final Scanner scanner = new Scanner(System.in);

    public boolean checkThePin(int enteredPin) {
        return atmPin == enteredPin;
    }




    
    public void showMenu() {
        System.out.println("Welcome to the ATM:");
        System.out.println("1. Check the Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.println("Please enter your choice");
    }

    public void checkBalance() {
        System.out.printf("Your current balance: ₹%.2f%n", balance);
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        balance += amount;
        System.out.printf("₹%.2f deposited successfully.%n", amount);
        System.out.printf("Updated balance: ₹%.2f%n", balance);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient balance.");
            return;
        }
        balance -= amount;
        System.out.printf("You withdrew: ₹%.2f%n", amount);
        System.out.printf("Your current balance: ₹%.2f%n", balance);
    }

    public void startATM() {
        System.out.println("Enter your ATM PIN:");
        int enteredPin = scanner.nextInt();
        scanner.nextLine();

        if (!checkThePin(enteredPin)) {
            System.out.println("Incorrect PIN. Exiting...");
            return;
        }

        while (true) {
            showMenu();
            String input = scanner.nextLine();
            int choice;
            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid choice. Try again.");
                continue;
            }

            switch (choice) {
                case 1 -> checkBalance();
                case 2 -> {
                    System.out.println("Enter amount to deposit:");
                    double depositAmount = scanner.nextDouble();
                    scanner.nextLine();
                    deposit(depositAmount);
                }
                case 3 -> {
                    System.out.println("Enter amount to withdraw:");
                    double withdrawAmount = scanner.nextDouble();
                    scanner.nextLine();
                    withdraw(withdrawAmount);
                }
                case 4 -> {
                    System.out.println("Thank you! Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
