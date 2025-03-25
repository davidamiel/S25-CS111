public class ArrayFunctions {

    /* 
    Traverse and display the elements in an array in order and in reverse order.
    Reverse the elements in an array.
    Find and report the minimum/maximum value in an array.
    Find and report the index of the minimum/maximum value in an array.
    Find the average of numerical values in an array.
    Exchange values of two elements in an array.
    Shift elements in array to the right/left as specifications describe.
    Count the number of elements in an array satisfying given specifications.
    Remove elements that satisfy certain conditions from an array.
    Remove duplicate values from an array.
    */

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.print("\t" + array[i]);
        } 
    }

    public static void printArrayReversed(int[] array) {
        for(int i = array.length - 1; i >= 0; i--) {
            System.out.print("\t" + array[i]);
        } 
    }

    public static void reverseArray(int[] array) {
        for(int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }

    public static int getMaxValue(int[] array) {
        int max = array[0]; 

        for(int i = 1; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }

        return max;
    }

    public static int getMinValue(int[] array) {
        int min = array[0]; 

        for(int i = 1; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
            }
        }

        return min;
    }

    public static int getMaxIndex(int[] array) {
        int max = array[0]; 
        int maxIndex = 0;

        for(int i = 1; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
                maxIndex = i;
            }
        }

        return maxIndex;
    }

    public static int getMinIndex(int[] array) {
        int min = array[0]; 
        int minIndex = 0;

        for(int i = 1; i < array.length; i++) {
            if (array[i] < min){
                min = array[i];
                minIndex = i;
            }
        }

        return minIndex;
    }

    public static double getAverage(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }

    public static void swapElements(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void shiftRight(int[] array) {
        if (array.length == 0) {
            return;
        }
        int last = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = last;
    }

    public static void shiftLeft(int[] array) {
        if (array.length == 0) {
            return;
        }
        int first = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[array.length - 1] = first;
    }

    public static int countFives(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num == 5) {
                count++;
            }
        }
        return count;
    }

    public static int[] removeElements(int[] array, int target) {
        int count = 0;

        // Shift elements to the left to remove the target values
        for (int i = 0; i < array.length; i++) {
            if (array[i] != target) {
                array[count++] = array[i];
            }
        }

        // Create a new array with the remaining elements
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = array[i];
        }

        return result;
    }

    public static int[] removeDuplicates(int[] array) {
        int count = 0;

        // Use a temporary array to store unique elements
        int[] temp = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            boolean isDuplicate = false;

            // Check if the current element is already in the temp array
            for (int j = 0; j < count; j++) {
                if (array[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // If not a duplicate, add it to the temp array
            if (!isDuplicate) {
                temp[count++] = array[i];
            }
        }

        // Create a new array with the unique elements
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }

        return result;
    }
    
}
