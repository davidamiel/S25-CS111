public class TwoDForEach {

    public static void main(String[] args) {

        int[][] dataTwo = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10}, 
            {11, 12, 13, 14, 15}
        };

        for(int[] row : dataTwo) {
            System.out.println();
            for(int value : row) {
                System.out.print(value + "\t");
            }
        }
    }
}
