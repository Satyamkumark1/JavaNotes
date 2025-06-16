package MiniProject.BankManagmentSysytem;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    // Bank class to manage bank accounts
    int id;

// List to store all bank accounts
    List<BankAccount> bankAccountList = new ArrayList<>();

    // Method to create a new bank account
    public  void createAccount(String accountHolderName ,long mobileNumber
                                      ,double balance,int pin) {
        // Validate the input for pin and mobile number
        if (pin < 99 || mobileNumber < 999999999L){
            System.out.println("Enter atleast 4 digit:");
            System.out.println("The mobile number should be 10 digits");
        }
        // Check if the account already exists
        else {
            id++;
            BankAccount bankAccount = new BankAccount(accountHolderName,  mobileNumber,
                    balance,id,pin);
            bankAccountList.add(bankAccount);
            System.out.println("Your Bank account has been created:");
            showBankDetails();
        }
    }
    // Method to display all bank account details
    public void showBankDetails() {
        for (BankAccount bankAccount : bankAccountList) { // Iterate through each bank account
            System.out.println(bankAccount.toString());

        }
    }
    // Method to deposit money into all bank accounts
    public void depositMoney(double money) {
        for (BankAccount bankAccount : bankAccountList) { // Iterate through each bank account
            bankAccount.depositMoney(money);
        }
    }
    // Method to check the PIN and withdraw money
    public  void  checkThePin(int pin, double money){
        for (BankAccount bankAccount : bankAccountList) { // Iterate through each bank account
            if (bankAccount.getPin() == pin){
                withdrawMoney(money);
            } else {
                System.out.println("Wrong pin");
            }

        }
    }
    // Method to withdraw money from all bank accounts
    public  void withdrawMoney(double money) {
        for (BankAccount bankAccount : bankAccountList) { // Iterate through each bank account
            bankAccount.withdrawMoney(money);

        }
    }
    // Method to find a bank account by mobile number and PIN
    public BankAccount findAccount(long mobileNumber, int pin) {
        for (BankAccount bankAccount : bankAccountList) { // Iterate through each bank account
            if (bankAccount.getMobileNumber() == mobileNumber && bankAccount.getPin() == pin) {
                return bankAccount;
            }
        }// If no account is found, return null
        System.out.println("Mobile number or PIN doesn't match.");
        return null;
    }




}
