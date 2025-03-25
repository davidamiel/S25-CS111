public class FunctionReviewF {

    public static void main(String[] args) {
        int x = 7;
        double y = 4.5;

        int result = alpha(x, y);
        
        System.out.println("Final Output: " + result);
    }

    public static int alpha(int a, double b) {
        int val1 = beta(a);
        double val2 = beta(b, a);
        return delta(val1, (int) val2);
    }

    public static int beta(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += (i % 2 == 0) ? i : 0;
        }
        return sum;
    }

    public static double beta(double x, int y) {
        if (x > y) {
            return x / 2;
        } else {
            return x * 2 + y;
        }
    }

    public static int delta(int p, int q) {
        if (p == q) {
            return p * q;
        } else if (p > q) {
            return p - q;
        } else {
            return q - p;
        }
    }
}
