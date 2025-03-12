public class ArrayFunctions {

    // Use LOs - can you create methods for each of those objectives?!
    // BTW - GREAT WAY TO STUDY!
    // Answers will be posted AFTER class on Thursday!

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.print("\t" + array[i]);
        } 
    }

    public static void printArray(int[][] array) {
        for(int row = 0; row < array.length; row ++) {
            for(int col = 0; col < array[0].length; col++) {
                System.out.print("\t" + array[row][col]);
            }
            System.out.println();
        }
    }

    public static int[] reverseArray(int[] array) {
        return new int[2];
    }
    
}
