class BankAccount {
    private double balance;

    // Deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }
}

public class EncapsulationExample8 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(1000);
        account.withdraw(300);
        System.out.println("Current Balance: ₹" + account.getBalance());
    }
}
