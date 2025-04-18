public class R4_Fibonacci {

    public static int FibR(int N) {
        if (N == 0 || N == 1)
            return 1;
        else
            return FibR(N-1) + FibR(N-2);
    }
  
    public static int FibI(int N) {
        if (N == 0 || N == 1)
            return 1;
        else {
            int prev = 1; 
            int prevprev = 1;
            int next = 0;
            for (int i=2; i<=N; i++) {
                next = prev + prevprev;
                prevprev = prev;
                prev = next;
            }
            return next;
        }
    }

    public static void main(String[] args) {
        int fib = FibR(5);
        System.out.println(fib);
        fib = FibI(5);
        System.out.println(fib);
    }
    
}
