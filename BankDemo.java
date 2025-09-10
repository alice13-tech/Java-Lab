class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + " | New Balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount!");
        } else if (amount > balance) {
            System.out.println("Withdrawal of " + amount + " failed. Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrew: " + amount + " | New Balance: " + balance);
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class BankDemo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Alice", 500);

        acc.deposit(200);      // success
        acc.withdraw(100);     // success
        acc.withdraw(700);     // fail - insufficient funds
        acc.deposit(-50);      // fail - invalid deposit

        System.out.println("Final Balance: " + acc.getBalance());
    }
}