public class Bill {

    private int denomination;

    public Bill(int value){
        this.denomination = value;
    }

    public int getValue() {
        return this.denomination;
    }

    public String toString() {
        return "$" + this.denomination;
    }

    public boolean equals(Object other) {
        if (other instanceof Bill) {
            Bill otherBill = (Bill) other;
            return this.denomination == otherBill.getValue();
        }
        return false;
    }

    public static void main(String[] args) {
        Bill billOne = new Bill(1);
        Bill billTwo = new Bill(2); // the infamous 2-dollar bill!
        Bill billThree = new Bill(1);

        StdOut.println(billOne);
        StdOut.println(billTwo);
        StdOut.println(billThree);

        if (billOne.equals(billTwo)) {
            StdOut.println("Bill One and Two are the same!");
        } else {
            StdOut.println("Bill One and Two are different!");
        }

        if (billOne.equals(billThree)) {
            StdOut.println("Bill One and Three are the same!");
        } else {
            StdOut.println("Bill One and Three are different!");
        }
    }
    
}
