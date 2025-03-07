public class SeatingChart {
    public static void main(String[] args) {

        int numCols = StdIn.readInt();

        StdIn.readChar(); // READ THE NEWLINE CHARACTER!

        String[] students = StdIn.readAllLines();
        int totalStudents = students.length;

        int numRows = totalStudents / numCols;
        if(totalStudents % numCols != 0) {
            numRows += 1;
        }

        String[][] seating = new String[numRows][numCols];
        int counter = 0;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (counter < totalStudents) {
                    seating[i][j] = students[counter++];
                } else {
                    seating[i][j] = "";
                }
            }
        }

        StdOut.println("Seating Chart:");
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                StdOut.print(seating[i][j] + "\t");
            }
            StdOut.println();
        }
    }
}