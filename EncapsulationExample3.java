class BankAccount {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance amount!");
        }
    }
}

public class EncapsulationExample3 {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.setBalance(5000);
        System.out.println("Balance: " + acc.getBalance());

        acc.setBalance(-1000); // invalid
    }
}
