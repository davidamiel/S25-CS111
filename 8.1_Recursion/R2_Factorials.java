public class R2_Factorials {

    public static int factorialI(int x) {
        int product = 1;
        for(int i = x; i > 1; i--) {
            product *= i;
        }
        return product;
    }


    // X! = X * (X-1)!
    public static int factorialR(int x) {
        if (x==1) {
            return 1;
        }
        int factorial = x * factorialR(x-1);
        return factorial;

    }

    public static void main(String[] args ) {
        int factorial = factorialR(5);
        System.out.println(factorial);
    }
    
    
}
