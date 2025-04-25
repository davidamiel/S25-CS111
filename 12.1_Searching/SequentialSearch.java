import java.util.ArrayList;

public class SequentialSearch { 

    // Class code - basic sequentialSearch implementation
    public static boolean sequentialSearchBasic(int[] values, int target) {
        for(int i = 0; i < values.length; i++) {
            if(values[i] == target) {
                return true;
            }
        }
        return false;
    }

    // Class code - sequentialSearch returning indices
    public static int sequentialSearch(int[] values, int target) {
        for(int i = 0; i < values.length; i++) {
            if(values[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // Your turn - write with Strings
    public static int sequentialSearch(String[] values, String target) {
        for(int i = 0; i < values.length; i++) {
            if(values[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }

    // Your turn - write with a for-each loop
    public static boolean sequentialSearchForEach(String[] values, String target) {
        for(String current : values) {
            if(current.equals(target)) {
                return true;
            }
        }
        return false;
    }

    // Your turn - implement using an ADT (replace "Object" with your ADT)
    public static int sequentialSearchForEach(Object[] values, Object target) {
        for(int i = 0; i < values.length; i++) {
            if(values[i].equals(target)) {
                return i;
            }
        }
        return -1;
    }

    // Your turn - implement with ArrayList
    public static int sequentialSearch(ArrayList<String> values, String target) {
        for(int i = 0; i < values.size(); i++) {
            if(values.get(i).equals(target)) {
                return i;
            }
        }
        return -1;
    }

}
