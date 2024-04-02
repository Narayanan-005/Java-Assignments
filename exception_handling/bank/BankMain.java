package bank;

import java.util.Scanner;

public class BankMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IOBank bank = new IOBank();
        System.out.println("___Welcome To " + IOBank.name + "___");
        while (true) {
            System.out.println("\n1.Deposit\n2.Withdraw\n3.Check Balance\n0.Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the Amount");
                    bank.deposit(scanner.nextDouble());
                    System.out.println("Amount depositted sucessfully");
                    break;
                case 2:
                    System.out.println("Enter the Amount");
                    try {
                        bank.withdraw(scanner.nextDouble());
                        System.out.println("Withdrawn amount sucessfully");
                    } catch (InsufficientBalanceException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println(bank.getBalance());
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid Input");
            }
        }
    }
}
