package bank;

public interface Bank {
    void deposit(double amount);

    void withdraw(double amount) throws InsufficientBalanceException;
}
