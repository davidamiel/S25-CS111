public class R3_Exponents {

    public static int exponentI(int x, int y) {
        int product = 1;
        for(int i = 0; i < y; i++) {
            product *= x;
        }
        return product;
    }

    public static int exponentR(int x, int y) {
        if (y == 0) {
            return 1;
        } else if (y == 1) {
            return x;
        } else {
            return x * exponentR(x, y-1);
        }
    }

    public static void main(String[] args) {
        int exponent = exponentR(2, 3);
        System.out.println(exponent);
    }

}
