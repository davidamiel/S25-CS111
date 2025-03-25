public class FunctionReviewC {
    
    public static void main(String[] args) {
        int a = 6;
        int b = 3;

        int result = alpha(a, b);
        
        System.out.println("Final Output: " + result);
    }

    public static int alpha(int x, int y) {
        int part1 = beta(x + y);
        int part2 = gamma(x, y);
        return delta(part1, part2);
    }

    public static int beta(int num) {
        return (num * 2) - 5;
    }

    public static int gamma(int p, int q) {
        return (p % q) + (q * q);
    }

    public static int delta(int u, int v) {
        return (u + v) / 2;
    }
}
