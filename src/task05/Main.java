package task05;

public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("KG1234567890", "Asel", 1000);
        System.out.println("Owner: " + acc.getOwner() + ", account: " + acc.getAccountNumber());
        System.out.println("Start balance: " + acc.getBalance());

        System.out.println("--- good operations ---");
        acc.deposit(500);
        acc.withdraw(200);

        System.out.println("--- wrong operations ---");
        acc.deposit(-50);
        acc.deposit(0);
        acc.withdraw(5000);
        acc.withdraw(-10);

        System.out.println("Final balance: " + acc.getBalance());

        // acc.balance = 1000000;   // does not work, balance is private
    }
}
