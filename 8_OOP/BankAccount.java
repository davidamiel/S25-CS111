public class BankAccount {

    private String accountHolder;
    private double balance;
    private String accountNumber;
    private String accountType;

    public BankAccount() {
        this.accountHolder = "Jane Doe";
        this.balance = 2.0;
        this.accountNumber = "TBD";
        this.accountType = "Checking";
    }

    public BankAccount(String accountHolder, double balance, String accountNumber, String accountType) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public String getAccountType() {
        return this.accountType;
    }

    public String getAccountHolder() {
        return this.accountHolder;
    }

    public void setAccounHolder(String newName) {
        this.accountHolder = newName;
    }

    public void setAccountNumber(String newNumber) {
        this.accountNumber = newNumber;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdrawal(double amount) {
        this.balance -= amount;
    }

    public String toString() {
        return this.accountHolder + "'s " + this.accountType + " Account: " + this.accountNumber;
    }

    public static void main(String[] args) {
        
        BankAccount accountOne = new BankAccount();
        StdOut.println(accountOne.getAccountHolder());

        accountOne.setAccountNumber("11111111");
        StdOut.println(accountOne.getAccountNumber());
        StdOut.println(accountOne);

        BankAccount accountTwo = new BankAccount("CS111", 123.56, "198111", "Savings");
        accountTwo.deposit(10);
        StdOut.println(accountTwo.getBalance());




    
    }
}
