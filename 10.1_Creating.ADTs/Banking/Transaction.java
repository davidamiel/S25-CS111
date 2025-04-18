public class Transaction {

    private String description;
    private double amount;

    public Transaction(String description, double amount) {
        this.description = description;
        this.amount = amount;
    }
    public String getDescription() {
        return description;
    }
    public double getAmount() {
        return amount;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String toString() {
        return "Transaction [description=" + description + ", amount=$" + amount + "]";
    }

    public boolean equals(Object obj) {
        if (obj instanceof Transaction) {
            Transaction other = (Transaction) obj;
            return this.description.equals(other.description) && this.amount == other.amount;
        }
        return false;
    }

    public static void main(String[] args) {
        Transaction t1 = new Transaction("Uber Eats Subtotal", 50.00);
        Transaction t2 = new Transaction("Uber Eats Fees", 75.0);
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t1.equals(t2));
    }

}
