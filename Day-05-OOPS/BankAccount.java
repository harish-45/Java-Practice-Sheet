//  Create a class BankAccount with attributes balance, accountNumber, and accountHolder. Implement methods for deposit(), withdraw(), and checkBalance(). Track the number of transactions using a static variable(hint: increase counter in deposit and withdraw).

public class BankAccount {
    private int balance = 100_000;
    private long accountNumber = 767802803782l;
    private String accountHolder = "Harry";

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    static int counter = 0;

    public void deposit(int val) {
        this.balance += val;
        System.out.println("-- Amount 'deposit' Succesfully --");
        checkBalance();

        counter++;
    }

    public void withdrow(int val) {
        if (val > balance) {
            System.out.println("No sufficient Balance");
        } else {
            this.balance -= val;
            System.out.println("-- Amount 'Withdrow' Succesfully --");
            checkBalance();

            counter++;
        }
        System.out.println();
    }

    public void checkBalance() {
        System.out.println("Your current AccountBalance are: " + this.balance);
    }

    public void numOfTransaction() {
        System.out.println("The number of transaction you Do : ");
    }

}
