public class R7_ArrayMax {

    public static int maxI(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int maxR(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }
        int max = maxR(arr, index + 1);
        if (arr[index] > max) {
            return arr[index];
        } else {
            return max;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int max = maxI(arr);
        System.out.println(max); 
        max = maxR(arr, 0);
        System.out.println(max); 
    }
    
}
