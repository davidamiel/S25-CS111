public class ArrayRecap {

    public static void main(String[] args) {

        double[][] grades = {{92, 91.5, 84.2}, 
                             {78, 68.7, 72},
                             {100, 90, 74}};

        // Get row-wise average (the average of the numbers in each row)
        // For each row, visit each column. Add each value to a sum, then get the row-average
        // by dividing that sum by the length of the row.

        for(int i = 0; i < grades.length; i++) {
            double sum = 0;
            for(int j = 0; j< grades[i].length; j++) {
                sum += grades[i][j];
            }
            System.out.println("Average of row " + i + " = " + sum/grades[i].length);
        }




    }
    
}
