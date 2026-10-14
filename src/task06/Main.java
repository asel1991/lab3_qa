package task06;

public class Main {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("KG1234567890", "Asel", 1000);
        System.out.println("Account number: " + acc.getAccountNumber());

        // Try 1: change the account number directly from Main
        // acc.accountNumber = "KG0000000000";
        // Error: accountNumber has private access in BankAccount

        // Try 2: use a setter
        // acc.setAccountNumber("KG0000000000");
        // Error: cannot find symbol - symbol: method setAccountNumber(String), location: variable acc of type BankAccount
        // (there is no setter, we made only a getter)

        // Try 3: if the variable was public final (not private), the error would be:
        // Error: cannot assign a value to final variable accountNumber
        // So final means that the value can be set only one time (in the constructor).

        // I put all the wrong lines in comments, because with them the program does not compile.
        System.out.println("The account number is still " + acc.getAccountNumber());
    }
}
