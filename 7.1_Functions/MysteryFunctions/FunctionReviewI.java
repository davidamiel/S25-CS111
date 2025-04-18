import java.util.Arrays;

public class FunctionReviewI {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        System.out.println("\nBefore function calls:");
        System.out.println("\tarr = " + Arrays.toString(arr));

        firstFunction(arr);
        System.out.println("\nAfter firstFunction:");
        System.out.println("\tarr = " + Arrays.toString(arr));


        int[] newArr1 = secondFunction(arr);
        System.out.println("\nAfter secondFunction:");
        System.out.println("\tarr = " + Arrays.toString(arr));
        System.out.println("\tnewArr1 = " + Arrays.toString(newArr1));

        // RUN DIFFERENT CHUNKS TO TRY DIFFERENT THINGS!
        
        // int[] newArr2 = thirdFunction(arr);
        // System.out.println("\nAfter thirdFunction:");
        // System.out.println("\tarr = " + Arrays.toString(arr));
        // System.out.println("\tnewArr2 = " + Arrays.toString(newArr2));


        // int[] newArr3 = fourthFunction(arr);
        // System.out.println("\nAfter fourthFunction:");
        // System.out.println("\tarr = " + Arrays.toString(arr));
        // System.out.println("\tnewArr3 = " + Arrays.toString(newArr3));


        // int[] newArr4 = fourthFunction(arr);
        // System.out.println("\nAfter fifthFunction:");
        // System.out.println("\tarr = " + Arrays.toString(arr));
        // System.out.println("\tnewArr4 = " + Arrays.toString(newArr4));
    
    }

    public static void firstFunction(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] += 5;
        }
    }

    public static int[] secondFunction(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i] * 2;
        }
        return newArray;
    }

    public static int[] thirdFunction(int[] array) {
        int[] newArray = array;
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = newArray[i] * 2;
        }
        return newArray;
    }

    public static int[] fourthFunction(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= 3;
        }
        int[] newArray = array;
        return newArray;
    }

    public static int[] fifthFunction(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= 2;
        }
        int[] newArray = new int[array.length];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }
}
