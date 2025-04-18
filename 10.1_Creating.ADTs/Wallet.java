public class Wallet {

    private Bill[] cash;
    private int currentBillCount;
    private int maxBillCount;
    private int value;


    public Wallet() {
        this.currentBillCount = 0;
        this.maxBillCount = 10;
        this.value = 0;
        this.cash = new Bill[10];
    }

    public Wallet(int maxBillCount) {
        this.currentBillCount = 0;
        this.maxBillCount = maxBillCount;
        this.value = 0;
        this.cash = new Bill[maxBillCount];
    }

    public Wallet(Bill[] cash) {
        this.currentBillCount = cash.length;
        this.maxBillCount = cash.length;
        this.value = 0;
        this.cash = new Bill[cash.length];
        for(int i = 0; i < cash.length; i++) {
            this.cash[i] = cash[i];
            this.value += cash[i].getValue();
        }
    }

    public void insertBill(Bill newBill) {
        for(int i = 0; i < cash.length; i++) {
            if(cash[i] == null) {
                cash[i] = newBill;
                this.value += newBill.getValue();
                this.currentBillCount++;
                StdOut.println("Inserted " + newBill.getValue() + " into wallet.");
                return;
            }
        }
        StdOut.println("Wallet is full. Cannot insert " + newBill.getValue() + ".");
    }

    public Bill[] getCash() {
        return this.cash;
    }

    public int getCurrentBillCount() {
        return this.currentBillCount;
    }

    public int getMaxBillCount() {
        return this.maxBillCount;
    }

    public int getValue() {
        return this.value;
    }

    public Bill getBill(int index) {
        if(index < 0 || index >= cash.length) {
            StdOut.println("Index out of bounds.");
            return null;
        }
        return cash[index];
    }

    public Bill getBillByAmount(int amount) {
        for(int i = 0; i < cash.length; i++) {
            if(cash[i] != null && cash[i].getValue() == amount) {
                Bill temp = cash[i];
                cash[i] = null;
                this.value -= temp.getValue();
                this.currentBillCount--;
                return temp;
            }
        }
        StdOut.println("No bill of that amount found.");
        return null;
    }

    public static void main(String[] args) {
        // Test the Wallet class
        Wallet myWallet = new Wallet(5);
        Bill bill1 = new Bill(10);
        Bill bill2 = new Bill(20);
        Bill bill3 = new Bill(50);
        Bill bill4 = new Bill(100);
        Bill bill5 = new Bill(200);
        myWallet.insertBill(bill1);
        myWallet.insertBill(bill2);
        myWallet.insertBill(bill3);
        myWallet.insertBill(bill4);
        myWallet.insertBill(bill5);

        StdOut.println("Current bill count: " + myWallet.getCurrentBillCount());
        StdOut.println("Max bill count: " + myWallet.getMaxBillCount());
        StdOut.println("Total value: " + myWallet.getValue());
        StdOut.println("Bill at index 2: " + myWallet.getBill(2).getValue());
        StdOut.println("Getting bill of amount 50: " + myWallet.getBillByAmount(50).getValue());
        StdOut.println("Current bill count after getting bill: " + myWallet.getCurrentBillCount());
        StdOut.println("Total value after getting bill: " + myWallet.getValue());
        StdOut.println("Trying to get bill of amount 50 again: " + myWallet.getBillByAmount(50));
        StdOut.println("Current bill count after trying to get bill again: " + myWallet.getCurrentBillCount());
        StdOut.println("Total value after trying to get bill again: " + myWallet.getValue());
        StdOut.println("Trying to insert bill of amount 50 again: ");
        myWallet.insertBill(bill3);
        StdOut.println("Current bill count after trying to insert bill again: " + myWallet.getCurrentBillCount());
        StdOut.println("Total value after trying to insert bill again: " + myWallet.getValue());
       
    }

}

