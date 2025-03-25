import java.util.Arrays;

public class FunctionReviewJ {

    public static void main(String[] args) {
        int num = 5;
        int[] arr = {2, 4, 6};

        int result = alpha(num, arr);

        System.out.println("Final num: " + num);
        System.out.println("Final arr: " + Arrays.toString(arr));
        System.out.println("Final Output: " + result);
    }

    public static int alpha(int x, int[] array) {
        int val1 = beta(x);
        gamma(array);
        return delta(val1, array);
    }

    public static int beta(int n) {
        n *= 2;
        return n + 1;
    }

    public static void gamma(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] += 3;
        }
    }

    public static int delta(int p, int[] array) {
        return p + array[0] + array[array.length - 1];
    }
}
