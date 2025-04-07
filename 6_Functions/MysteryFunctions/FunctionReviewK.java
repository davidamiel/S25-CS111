import java.util.Arrays;

public class FunctionReviewK {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};
        int modifier = 3;

        int[] result = alpha(numbers, modifier);

        System.out.println("Final numbers: " + Arrays.toString(numbers));
        System.out.println("Final result: " + Arrays.toString(result));
    }

    public static int[] alpha(int[] arr, int mod) {
        int[] modifiedArr = beta(arr);
        gamma(modifiedArr, mod);
        return delta(modifiedArr);
    }

    public static int[] beta(int[] arr) {
        int[] newArr = Arrays.copyOf(arr, arr.length);
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] *= 2;
        }
        return newArr;
    }

    public static void gamma(int[] arr, int mod) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += mod;
        }
    }

    public static int[] delta(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }
}
