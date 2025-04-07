public class R11_ReverseArray {

    public static void reverseI(int[] array) {
        int length = array.length;
        for (int i = 0; i < length / 2; i++) {
            int temp = array[i];
            array[i] = array[length - 1 - i];
            array[length - 1 - i] = temp;
        }
    }

    public static void reverseR(int[] array, int start, int end) {
        if (start >= end) {
            return;
        }
        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;
        reverseR(array, start + 1, end - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverseI(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        int[] arr2 = {1, 2, 3, 4, 5};
        reverseR(arr2, 0, arr2.length - 1);
        for (int num : arr2) {
            System.out.print(num + " ");
        }
    }

    
    
}
