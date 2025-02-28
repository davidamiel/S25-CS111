public class TwoDArrays {

    public static void main(String[] args) {
        // Declare a 2D Array
        int[][] data;

        // Initialize (or create) that 2D array
        data = new int[10][10];

        // Or, you can create a combined declaration/initialization statement
        int[][] info = new int[3][3];

        // Or, you can define a 2D array using literals (of the right data type!)
        int[][] dataTwo = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 10}, 
            {11, 12, 13, 14, 15}
        };
        // ^ don't forget the ; at the end!


        // Let's print out a 2D array:
        for(int row = 0; row < dataTwo.length; row++) {
            System.out.println(); // Create new line to print each row
            for(int col = 0; col < dataTwo[row].length; col++) {
                System.out.print(dataTwo[row][col] + "\t"); // Print each element in the row (the "\t" is for extra space!)
            }
        }

        // Find the average of all the values of a 2D array:
        int sum = 0;
        for(int row = 0; row < dataTwo.length; row++) {
            for(int col = 0; col < dataTwo[row].length; col++) {
                sum += dataTwo[row][col];
            }
        }
        System.out.println("Average = " + (double)sum/(dataTwo.length * dataTwo[0].length));
        // Notice the similarities! Set up some variables at the top, 
        // iterate through the array and update those variables,
        // then use them to get the answer.

        // CHALLENGE FOR YOU - can you rewrite the above with a for-each loop? 
        // The answer is in TwoDForEach.java
        // PS - this is a challenge!
        // Hint: an int[][] is an array of arrays. What is the "data type" of a row? of a value?

    
        // However, we rarely want to look at 2D arrays all as one collection of numbers
        // If we did, why not just use a 1D array?

        // Print the average of each row:
        for(int i = 0; i < dataTwo.length; i++) {
            double sumTwo = 0;
            for(int j = 0; j < dataTwo[i].length; j++) {
                sumTwo += dataTwo[i][j];
            }
            System.out.println("Average of row "  + i + " = " + sumTwo/dataTwo[i].length);
        }
        // what if you wanted to put the average in its own array? 
        // (See GradeChallenges.java for examples!)
    }
}