import java.util.ArrayList;

public class BinarySearch {

    // Class code - binary search
    public static int binarySearch(int[] values, int target) {
        int low = 0;
        int high = values.length - 1;
        int mid;

        while(low <= high) {
            mid = ((high-low)/2) + low;
            if(values[mid] == target) {
                return mid;
            } else if(values[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    // Your turn - boolean version
    public static boolean binarySearchBoolean(int[] values, int target) {
        int low = 0;
        int high = values.length - 1;
        int mid;

        while(low <= high) {
            mid = ((high-low)/2) + low;
            if(values[mid] == target) {
                return true;
            } else if(values[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }

    // Your turn - with Strings
    public static int binarySearch(String[] values, String target) {
        int low = 0;
        int high = values.length - 1;
        int mid;

        while(low <= high) {
            mid = ((high-low)/2) + low;
            if(values[mid].equals(target)) {
                return mid;
            } else if(values[mid].compareTo(target) < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    // Your turn - with ArrayLists
    public static int binarySearch(ArrayList<String> values, String target) {
        int low = 0;
        int high = values.size() - 1;
        int mid;

        while(low <= high) {
            mid = ((high-low)/2) + low;
            if(values.get(mid).equals(target)) {
                return mid;
            } else if(values.get(mid).compareTo(target) < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    // Your Turn - with ADTs, you need a comparison function!





    
}
