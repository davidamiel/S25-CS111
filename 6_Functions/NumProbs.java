public class NumProbs {

    public static int factorial(int n) {
        int product = 1;
        for(int i = 1; i <= n; i ++) {
            product *= i;
        }
        return product;

    }

    public static double power(double x, double n) {
        return Math.pow(x, n);
        /*
         * Want to give this a shot on your own?
         * Check out the official documentation for the Math.pow method!
         * https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/lang/Math.html#pow(double,double)
         */
    }

    public static int numberOfDigits(int n) {
        if(n == 0) {
            return 1;
        }
        int digits = 0;
        n = Math.abs(n);
        while(n > 0) {
            n = n/10;
            digits ++;
        }
        return digits;
    }

    public static int properFactors(int n) {
        // proper factors are factors of n except 1 and n
        int factors = 0;
        for(int i = 2; i < n; i ++) {
            if(n % i == 0) {
                factors += i;
            }
        }
        return factors;
    }
    
}
