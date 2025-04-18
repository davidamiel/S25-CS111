import java.util.Arrays;

public class ArrayMemory {

    public static void increaseInt(int number) {
        number = number + 1;
    }

    public static void increaseArray(int[] numbers) {
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] += 1;
        }

    }

    public static void main(String[] args) {

        int a = 4;
        int b = a;
        increaseInt(a);
        System.out.println("a = " + a + ", b = " + b);

        int[] arr = {1, 2, 3};
        int[] arr2 = arr;
        increaseArray(arr);
        System.out.println("arr = " + Arrays.toString(arr) + ", arr2 = " + Arrays.toString(arr2));



    }
}