package bank;

public class IOBank implements Bank {
    public static String name = "Indian Oversease Bank";

    private double balance;

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (balance >= amount) {
            balance -= amount;
        } else {
            throw new InsufficientBalanceException();
        }
    }

    public double getBalance() {
        return balance;
    }
}
