package Spring2025;
// task1: Write the InsufficientFundsException class
class InsufficientFundsException extends Exception{
    InsufficientFundsException(String s) {
        super (s);
    }
}
public class Bank {
    private int balance;
    // Constructor
    public Bank(int initialBalance) {
        this.balance = initialBalance;
    }
    // task2: Write the withdraw method
    public void withdraw (int balance) throws InsufficientFundsException{
        if (balance>this.balance)
            throw new InsufficientFundsException("Withdrawal amount exceeds current balance.");
    }

// Main method to test the Bank class
    public static void main(String[] args) {
        Bank myAccount = new Bank(5000);
        try {
            myAccount.withdraw(6000);
        } catch (InsufficientFundsException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            System.out.println("Transaction processing completed.");
        }
    }}
