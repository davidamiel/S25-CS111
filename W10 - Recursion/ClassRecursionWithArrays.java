import javax.xml.stream.events.StartDocument;

public class ClassRecursionWithArrays {
    
    /**
     * This method was our "mystery" method at the beginning of class.
     * It accepts an array of integers, then creates and returns a nearly 
     * identical array of integers, except without the first number.
     * 
     * We discussed using this in our recursive method with Arrays, but 
     * saw that it would be too costly and not worth it. Instead, we use
     * an integer to track the "start of the array" to artificially
     * make the array smaller with each recursive call.
     * 
     * @param arr   an int[]
     * @return an int[] which is arr without the first element (and is 1 shorter in length)
     * 
     */
    public static int[] mystery(int[] arr) {
        int[] newArray = new int[arr.length-1];
        for(int i = 1; i < arr.length; i++) {
            newArray[i-1] = arr[i];
        }
        return newArray;
    }

    
    /** 
     * This method searches an integer array for a target integer. 
     * It returns a boolean, signifying whether or not the array contains the target.
     * This is an iterative solution, and we use a for-each loop (just for fun!)
     * 
     * @param target    an int value to search for
     * @param array     the int[] to search
     * @return a boolean, true if array contains target
     */
    public static boolean findNumber(int target, int[] array) {
        boolean found = false;
        for(int element: array) {
            if ( element == target) {
                found = true;
            }
        }
        return found;
    }

    
    /** 
     * Our recursive solution to finding a target element in an array.
     * Base Case #1 - The array is empty. Empty arrays do not contain the target, so we return false.
     * Base Case #2 - The first element of the array is equal to the target, so we return true.
     * Recursive Case - We did not reach either base case, so we call Rfind on "the rest" of the array 
     * (the array, but remove the first element). We use an index to keep track of the starting position, 
     * which is how we artificially make the array smaller, instead of wasting computation time and space 
     * recreating arrays with int[] mystery(int[] arr).
     * @param target        The value to search for in the array
     * @param array         The array to search for target
     * @param startIndex    The starting index of the "current array"
     * @return a boolean, true if array contains target
     */
    public static boolean Rfind(int target, int[] array, int startIndex) {
        if(startIndex >= array.length) {
            return false;
        }
        if(array[startIndex] == target) {
            return true;
        }
        return Rfind(target, array, startIndex + 1);
    }

    public static int findMax(int[] array, int startIndex) {
        if(startIndex == array.length - 1) {
            return array[startIndex];
        } else if (array[startIndex] > findMax(array, startIndex + 1)) {
            return array[startIndex];
        } else {
            return findMax(array, startIndex + 1); 
        }

    }

    public static void main(String[] args) {
        int[] array = {1, 8, 4, 5, 6, 7};
        System.out.println(findMax(array, 0));
    }


    
}
