package task05;

public class BankAccount {
    private String accountNumber;
    private String owner;
    private double balance;

    public BankAccount(String accountNumber, String owner, double balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        if (balance < 0) {
            this.balance = 0;
        } else {
            this.balance = balance;
        }
    }

    // getters (there is no setter for balance)
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    // deposit accepts only amount > 0
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Error: deposit amount must be greater than 0 (you tried " + amount + ")");
            return;
        }
        balance = balance + amount;
        System.out.println("Deposited " + amount + ". New balance: " + balance);
    }

    // withdraw does not allow more than current balance
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Error: withdraw amount must be greater than 0 (you tried " + amount + ")");
            return;
        }
        if (amount > balance) {
            System.out.println("Error: not enough money. Balance is " + balance + ", you tried " + amount);
            return;
        }
        balance = balance - amount;
        System.out.println("Withdrawn " + amount + ". New balance: " + balance);
    }
}
