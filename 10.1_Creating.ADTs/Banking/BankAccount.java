public class BankAccount {

    private String accountNumber;
    private double balance;

    private BankAccount overdraftAccount;

    public BankAccount() {
        this.accountNumber = "000-PLEASE-CHANGE-000";
        this.balance = 0.0;
        this.overdraftAccount = null;
    }

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.overdraftAccount = null;
    }

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        this.overdraftAccount = null;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setOverdraftAccount(BankAccount overdraftAccount) {
        this.overdraftAccount = overdraftAccount;
    }

    public void deposit(double amount) {
        assert amount > 0 : "Deposit amount must be positive.";
        // assert(amount > 0); // The above assertion also includes a message, just different syntax!
        this.balance += amount;
    }

    public void withdraw(double amount) {
        assert amount > 0 : "Withdrawal amount must be positive.";
        if(amount > this.balance) {
            if (this.overdraftAccount != null) { // Try to use overdraft account
                double overdraftAmount = amount - this.balance;
                if(this.overdraftAccount.getBalance() >= overdraftAmount) {
                    this.overdraftAccount.withdraw(overdraftAmount);
                    this.balance = 0.0;
                    return;
                }
            }
            System.out.println("Insufficient funds.");
        }
        this.balance -= amount;
    }

    public void purchase(Transaction t) {
        assert t != null : "Transaction cannot be null.";
        withdraw(t.getAmount());
    }

    public String toString() {
        return "Account Number: " + this.accountNumber + ", Balance: $" + this.balance;
    }

    public boolean equals(Object obj) {
        if (obj instanceof BankAccount) {
            BankAccount other = (BankAccount) obj;
            String otherAccountNumber = other.getAccountNumber();
            return this.accountNumber.equals(otherAccountNumber);
        }
        return false;
    }


    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("123456789", 1000.0);
        BankAccount account2 = new BankAccount("987654321", 500.0);
        System.out.println(account1);
        System.out.println(account2);
        account1.deposit(200.0);
        account2.withdraw(100.0);
        System.out.println(account1);
        System.out.println(account2);
    }

}