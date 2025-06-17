package MiniProject.BankManagmentSysytem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bank {
    private int id;
    private final List<BankAccount> bankAccountList = new ArrayList<>();

    public void handleCreateAccount(Scanner scanner) {
        System.out.println("Enter your Name:");
        String name = scanner.nextLine();

        System.out.println("Enter your Mobile Number:");
        long number = scanner.nextLong();

        System.out.println("Deposit some amount:");
        double money = scanner.nextDouble();

        System.out.println("Set Your 4-digit PIN:");
        int pin = scanner.nextInt();
        scanner.nextLine(); // consume newline

        createAccount(name, number, money, pin);
    }

    public void createAccount(String accountHolderName, long mobileNumber, double balance, int pin) {
        for (BankAccount acc : bankAccountList) {
            if (acc.getMobileNumber() == mobileNumber) {
                System.out.println("Account already exists with this mobile number.");
                return;
            }
        }
        if (!isValidPin(pin)) {
            System.out.println("PIN should be exactly 4 digits.");
            return;
        }
        if (!isValidMobile(mobileNumber)) {
            System.out.println("The mobile number should be exactly 10 digits.");
            return;
        }
        id++;
        BankAccount bankAccount = new BankAccount(accountHolderName, mobileNumber, balance, id, pin);
        bankAccountList.add(bankAccount);
        System.out.println("Your Bank account has been created:");
        System.out.println(bankAccount);
    }

    public void showBankDetails() {
        if (bankAccountList.isEmpty()) {
            System.out.println("No accounts found.");
            return;
        }
        for (BankAccount bankAccount : bankAccountList) {
            System.out.println(bankAccount.toString());
        }
    }

    public void handleDeposit(BankAccount account, Scanner scanner) {
        if (account != null && !account.isLocked()) {
            System.out.println("Enter the amount you want to deposit:");
            double amount = scanner.nextDouble();
            scanner.nextLine();
            account.depositMoney(amount);
        } else if (account != null && account.isLocked()) {
            System.out.println("Account is locked. Please contact the bank.");
        } else {
            System.out.println("Please login first.");
        }
    }

    public void handleWithdrawl(BankAccount account, Scanner scanner) {
        if (account != null && !account.isLocked()) {
            System.out.println("Enter the amount you want to withdraw");
            double amount = scanner.nextDouble();
            scanner.nextLine();
            account.withdrawMoney(amount);
        } else if (account != null && account.isLocked()) {
            System.out.println("Account is locked. Please contact the bank.");
        } else {
            System.out.println("Login first");
        }
    }

    public void handleTransactionHistory(BankAccount account) {
        if (account != null) {
            account.printTransactionHistory();
        } else {
            System.out.println("Please login first.");
        }
    }

    public void handleDeleteAccount(BankAccount account, Scanner scanner) {
        if (account == null) {
            System.out.println("Please login first.");
            return;
        }
        System.out.println("Are you sure you want to delete your account? Type 'YES' to confirm:");
        String confirm = scanner.nextLine();
        if ("YES".equalsIgnoreCase(confirm)) {
            bankAccountList.remove(account);
            System.out.println("Account deleted successfully.");
        } else {
            System.out.println("Account deletion cancelled.");
        }
    }

    public void handleFindBankAccountByPinAndNumber(Scanner scanner) {
        System.out.println("Enter your mobile number");
        long number = scanner.nextLong();
        System.out.println("Enter the Pin");
        int pin = scanner.nextInt();
        scanner.nextLine();
        BankAccount account = findAccount(number, pin);
        if (account != null) {
            System.out.println(account);
        } else {
            System.out.println("Account not found.");
        }
    }

    public BankAccount handleLoginToExistingBankAccount(Scanner scanner) {
        System.out.println("Enter your mobile number:");
        long mobile = scanner.nextLong();
        System.out.println("Enter your PIN:");
        int pin = scanner.nextInt();
        scanner.nextLine(); // consume leftover newline

        BankAccount account = findAccountByMobile(mobile);
        if (account == null) {
            System.out.println("Account not found.");
            return null;
        }
        if (account.isLocked()) {
            System.out.println("Account is locked due to multiple failed login attempts. Please contact the bank.");
            return null;
        }
        if (account.getPin() == pin) {
            account.resetFailedLoginAttempts();
            System.out.println("Login successful! Welcome, " + account.getAccountHolderName());
            return account;
        } else {
            account.incrementFailedLoginAttempts();
            if (account.isLocked()) {
                System.out.println("Account locked due to 3 failed login attempts.");
            } else {
                System.out.println("Login failed. Invalid credentials.");
            }
            return null;
        }
    }

    private boolean isValidMobile(long mobile) {
        return String.valueOf(mobile).length() == 10;
    }

    private boolean isValidPin(int pin) {
        return String.valueOf(pin).length() == 4;
    }

    public BankAccount findAccount(long mobileNumber, int pin) {
        for (BankAccount bankAccount : bankAccountList) {
            if (bankAccount.getMobileNumber() == mobileNumber && bankAccount.getPin() == pin) {
                return bankAccount;
            }
        }
        return null;
    }

    public BankAccount findAccountByMobile(long mobileNumber) {
        for (BankAccount bankAccount : bankAccountList) {
            if (bankAccount.getMobileNumber() == mobileNumber) {
                return bankAccount;
            }
        }
        return null;
    }
}
