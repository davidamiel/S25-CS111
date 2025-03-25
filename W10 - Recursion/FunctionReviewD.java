public class FunctionReviewD {
    
    public static void main(String[] args) {
        int a = 8;
        int b = 5;

        // int a = Integer.parseInt(args[0]);
        // int b = Integer.parseInt(args[1]);

        int result = alpha(a, b);
        
        System.out.println("Final Output: " + result);
    }

    public static int alpha(int x, int y) {
        int part1 = beta(x - y);
        int part2 = gamma(y);
        return delta(part1, part2, x);
    }

    public static int beta(int num) {
        if (num % 2 == 0) {
            return num / 2;
        } else {
            return num * 2 + 1;
        }
    }

    public static int gamma(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }
        return sum;
    }

    public static int delta(int a, int b, int c) {
        if (a > b) {
            return a - b + c;
        } else if (b > a) {
            return b - a - c;
        } else {
            return a * b;
        }
    }
}
