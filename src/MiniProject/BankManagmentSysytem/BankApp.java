package MiniProject.BankManagmentSysytem;

import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Bank bank = new Bank();
        // Create a default account for testing purposes
        bank.createAccount("Default User", 1234567890, 0.0, 1234); // Create a default account
        Scanner scanner = new Scanner(System.in); // Scanner for user input


        BankAccount loggedInAccount = null; // Variable to store the currently logged-in account


    // Main loop to display the menu and handle user input
        while (true) {
            System.out.println("Welcome to your bank");
            System.out.println("***************************");
            System.out.println("Select a option:");
            System.out.println("***************************");
            System.out.println("1.  Create a Bank account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. View your bank details");
            System.out.println("5. Find your bank Details");
            System.out.println("6. Login to your account");

            System.out.println("***************************");
            System.out.println("Select An option");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> { // Create a new bank account
                    System.out.println("Enter your Name");
                    String name = scanner.nextLine();
                    System.out.println("Enter your Mobile Number:");
                    long number = scanner.nextLong();
                    System.out.println("Deposit some amount");
                    double money = scanner.nextDouble();
                    System.out.println("Set Your PIN it must be a 4 digit pin");
                    int pin = scanner.nextInt();
                    bank.createAccount(name, number, money, pin);
                }
                case 2 -> { // Deposit money into the logged-in account
                    if (loggedInAccount != null) {
                        System.out.println("Enter the amount you want to deposit:");
                        double amount = scanner.nextDouble();
                        loggedInAccount.depositMoney(amount);
                    } else {
                        System.out.println("Please login first.");
                    }
                }

                case 3 -> { // Withdraw money from the logged-in account
                    if (loggedInAccount != null) {
                        System.out.println("Enter the amount you want to withdraw:");
                        double amount = scanner.nextDouble();
                        loggedInAccount.withdrawMoney(amount);
                    } else {
                        System.out.println("Please login first.");
                    }
                }

                case 4 -> bank.showBankDetails(); // View all bank account details
                case 5 ->{ // Find a bank account by mobile number and PIN

                    System.out.println("Enter your mobile number");
                    long number = scanner.nextLong();
                    System.out.println("Enter the Pin");
                    int pin = scanner.nextInt();
                    System.out.println( bank.findAccount(number,pin));
                }
                case 6 -> { // Login to an existing bank account
                    System.out.println("Enter your mobile number:");
                    long mobile = scanner.nextLong();
                    System.out.println("Enter your PIN:");
                    int pin = scanner.nextInt();
                    scanner.nextLine(); // consume leftover newline
                    BankAccount account = bank.findAccount(mobile, pin);
                    if (account != null) {
                        loggedInAccount = account;
                        System.out.println("Login successful! Welcome, " + loggedInAccount.getAccountHolderName());
                    }
                }
                default -> {    // Handle invalid option
                    System.out.println("Enter a vaild option");
                }


            }
        }
    }
}