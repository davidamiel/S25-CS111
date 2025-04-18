public class R6_FindInArray {

    public static boolean FindI(int target, int[] array) {
        boolean found = false;
        for(int element: array) {
            if ( element == target) {
                found = true;
            }
        }
        return found;
    }

    public static boolean FindR(int target, int[] array, int startIndex) {
        if(startIndex >= array.length) {
            return false;
        }
        if(array[startIndex] == target) {
            return true;
        }
        return FindR(target, array, startIndex + 1);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        boolean found = FindI(3, array);
        System.out.println(found); // true
        found = FindR(3, array, 0);
        System.out.println(found); // true
    }

}
