package se.lexicon;

public class BankAccount {
    private static int nextAccountNumber = 1000; // Starting account number
    private final int accountNumber;
    private double balance;

    public BankAccount(double initialBalance) {
        this.accountNumber = nextAccountNumber++;
        this.balance = initialBalance;
    }


    public void deposit(double amount) {
        // todo: needs completion
        if (amount < 0) {
            throw new IllegalArgumentException("Deposit must be positive.");
        }
        balance += amount;
        System.out.println("Deposit successful. New Balance: " + balance);

    }

    public void withdraw(double amount) {
        // todo: needs completion

        if (amount < 0) {
            throw new IllegalArgumentException("Deposit must be positive.");
        }
        if (amount > balance) throw new InsufficientFoundsException("Balance is insufficient.");

        balance -= amount;
        System.out.println("Withdrawal successful. New Balance: " + balance);

    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}