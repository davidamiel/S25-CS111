public class ArrayRecap {

    public static void main(String[] args) {

        double[][] grades = {{92, 91.5, 84.2}, 
                             {78, 68.7, 72},
                             {100, 90, 74}};

        // Get row-wise average (the average of the numbers in each row)
        // For each row, visit each column. Add each value to a sum, then get the row-average
        // by dividing that sum by the length of the row.

        double[] averages = new double[grades.length];

        for(int i = 0; i < grades.length; i++) {
            double sum = 0;
            for(int j = 0; j< grades[i].length; j++) {
                sum += grades[i][j];
            }
            averages[i] = sum/grades[i].length;
        }


        // Get col-wise average (the average of the numbers in each col)
        // For each col, visit each row. Add each value to a sum, then get the col-average
        // by dividing that sum by the length of the col.

        for(int col = 0; col < grades[0].length; col++) {
            double sum = 0;
            for(int row = 0; row < grades.length; row++){
                sum += grades[row][col];
            }
            System.out.println("Average of col "  + col + " = " + sum/grades[0].length);

        }





    }
    
}
