public class Collatz {

    public static int collatz(int n, int remainingRuns) {
        if(n == 1 || remainingRuns == 0) {
            System.out.println(n);
            return 1;
        }
        if(n % 2 == 0) {
            System.out.println(n);
            n = n/2;
            collatz(n, remainingRuns - 1);
            return n;
        } else {
            System.out.println(n);
            n = (3*n) + 1;
            collatz(n, remainingRuns - 1);
            return n;
        }
    }

    // Textbook Collatz code - definitely more efficient then mine!!!! (sorry 🥹)
    // however it is good practice to 
    public static void bookCollatz(int N) {
        StdOut.print(N + " ");
        if (N == 1) {
            return;
        }
        if (N % 2 == 0) {
            bookCollatz(N / 2);
        }
        bookCollatz(3*N + 1);
    }


    public static void main(String[] args) {
        int count = 1;
        collatz(4);
    }
    
}
