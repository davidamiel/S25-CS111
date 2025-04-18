public class R10_Collatz {
    
    public static void Collatz(int N) {
        StdOut.print(N + " ");
        if (N == 1) {
            return;
        }
        if (N % 2 == 0) {
            Collatz(N / 2);
        }
        Collatz(3*N + 1);
    }

    public static void main(String[] args) {
        Collatz(4);
    }
    
}
