public class ArrayOperations{

    public static void printArray(int[] array) {

        for(int value : array) {
            System.out.print("\t" + value);
        }
        System.out.println();

    }

    public static void doubleArray(int[] array) {
        for(int i = 0; i < array.length; i++)
            array[i] = 2 * array[i];
    }

    public static void doubleInt(int a) {
        a = a*2;
    }

    public static int[] reverseArray(int[] array) {
        for(int i = 0; i < array.length/2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3};
        int value = 2;

        printArray(numbers);
        doubleArray(numbers);
        printArray(numbers);

        StdOut.print(value);
        doubleInt(value);
        StdOut.print(value);

        printArray(numbers);
        int[] reversed = reverseArray(numbers);
        printArray(reversed);

        System.out.println(numbers);
        System.out.println(reversed);



    }




}