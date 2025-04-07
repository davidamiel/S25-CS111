public class R1_PiecewiseFunction {

    public static int f(int x) {
        if (x < 5) {
            return x * x + 1;
        } else if (x == 5) {
            return x * x - 3;
        } else {
            return f(x-2);
        }
    }

    public static void main(String[] args) {
        System.out.println("f(0) = " + f(0));
        System.out.println("f(6) = " + f(6));
    }
    
}
