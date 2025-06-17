package MiniProject.BankManagmentSysytem;

import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.createAccount("Default User", 1234567890L, 0.0, 1234);
        Scanner scanner = new Scanner(System.in);

        BankAccount loggedInAccount = null;

        while (true) {
            System.out.println("\nWelcome to your bank");
            System.out.println("***************************");
            System.out.println("Select an option:");
            System.out.println("1.  Create a Bank account");
            System.out.println("2.  Deposit Money");
            System.out.println("3.  Withdraw Money");
            System.out.println("4.  View all bank accounts");
            System.out.println("5.  Find your bank Details");
            System.out.println("6.  Login to your account");
            System.out.println("7.  Log Out");
            System.out.println("8.  View Transaction History");
            System.out.println("9.  Delete My Account");
            System.out.println("0.  Exit");
            System.out.println("***************************");
            System.out.print("Select an option: ");
            String input = scanner.nextLine();
            int choice;
            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
                continue;
            }

            switch (choice) {
                case 1 -> bank.handleCreateAccount(scanner);
                case 2 -> bank.handleDeposit(loggedInAccount, scanner);
                case 3 -> bank.handleWithdrawl(loggedInAccount, scanner);
                case 4 -> bank.showBankDetails();
                case 5 -> bank.handleFindBankAccountByPinAndNumber(scanner);
                case 6 -> loggedInAccount = bank.handleLoginToExistingBankAccount(scanner);
                case 7 -> {
                    loggedInAccount = null;
                    System.out.println("Logged out successfully.");
                }
                case 8 -> bank.handleTransactionHistory(loggedInAccount);
                case 9 -> {
                    bank.handleDeleteAccount(loggedInAccount, scanner);
                    loggedInAccount = null;
                }
                case 0 -> {
                    System.out.println("Thank you for using the Bank Management System. Goodbye!");
                    System.exit(0);
                }
                default -> System.out.println("Enter a valid option");
            }
        }
    }
}