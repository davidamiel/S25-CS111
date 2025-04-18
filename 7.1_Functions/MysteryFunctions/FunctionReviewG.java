public class FunctionReviewG {

    public static void main(String[] args) {
        int a = 6;
        double b = 3.5;

        int result = alpha(a, b);
        
        System.out.println("Final Output: " + result);
    }

    public static int alpha(int x, double y) {
        double val1 = beta(x, (int) y);
        int val2 = beta(y);
        return delta((int) val1, val2);
    }

    public static double beta(int num1, int num2) {
        double result = 1;
        for (int i = 1; i <= num2; i++) {
            if (num1 % i == 0) {
                result *= i;
            }
        }
        return result / 2;
    }

    public static int beta(double num) {
        if (num < 5) {
            return (int) (num * 3);
        } else if (num % 2 == 0) {
            return (int) num / 2;
        } else {
            return (int) num + 2;
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
