class BankAccount {
    int accountNumber;
    int balance;
    int interestrRate;

    void deposit(int amount) {
        balance = balance + amount;
    }
}

class SavingsAccount extends BankAccount {

    void withdraw(int amount) {
        
        super.balance = super.balance - amount;
        System.out.println("Withdraw amount = " + amount + "\nBalance = " + super.balance);
    }
}

public class Bank {
    public static void main(String[] args) {
        BankAccount acc0 = new BankAccount();
        acc0.deposit(1000);
        SavingsAccount acc1 = new SavingsAccount();
        acc1.deposit(1000);
        acc1.withdraw(1000);
        System.out.println("Done");
        }
}