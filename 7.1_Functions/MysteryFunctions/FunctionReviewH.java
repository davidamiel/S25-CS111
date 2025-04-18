import java.util.Arrays;

public class FunctionReviewH {

    public static void main(String[] args) {
        int num = 10;
        int[] arr = {1, 2, 3};

        modify(num, arr);

        System.out.println("Final num: " + num);
        System.out.println("Final arr: " + Arrays.toString(arr));
    }

    public static void modify(int x, int[] array) {
        x = x * 2; // Changing x (primitive)
        array[0] = array[0] * 2; // Modifying the first element of array
    }
}
