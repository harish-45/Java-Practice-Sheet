// Q. Create a class `Account` with the following attributes:
//   - accountNumber (private int)
//    - accountHolderName (public String)
//    - balance (protected double)
// The class should have a private constructor to initialize accountNumber and balance.
// Add a public method setAccountHolderName() to set the account holder's name.
// Create a subclass SavingsAccount that extends Account.
// Add a method displayAccountInfo() that prints the account details.

public class Account {
    private int accountNumber;
    public String accountHolderName;
    protected double balance;

    protected Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    

    // here constructor is private so the only one option left to initialize Account that is using factory function 
    // but our next step is inherit property of Account in SavingAccount and Account is not visible in SavingAccount then we are not able to create the object of SavingAccount so We make Account constructor as protected

    public Account fAccount(int accountNumber, double balance) {
        return new Account(accountNumber, balance);
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }


}
