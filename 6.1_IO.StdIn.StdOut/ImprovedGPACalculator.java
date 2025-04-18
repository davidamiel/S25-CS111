public class ImprovedGPACalculator {

    public static void main(String[] args) {

        double gradePoints = 0;
        int classes = 0;
        char prevChar = ' ';
        char nextChar = ' ';

        while(StdIn.hasNextChar()) {
            prevChar = nextChar;
            nextChar = StdIn.readChar();

            if (nextChar == 'A'){
                gradePoints += 4.0;
                classes += 1;
            }
            else if (nextChar == 'B'){
                gradePoints += 3.0;
                classes += 1;
            }
            else if (nextChar == 'C'){
                gradePoints += 2.0;
                classes += 1;
            }
            else if (nextChar == 'D'){
                gradePoints += 1.0;
                classes += 1;
            }
            else if (nextChar == 'F'){
                classes += 1;
            }
            else if (nextChar == '+') {
                if(prevChar == 'B' || prevChar == 'C' || prevChar == 'D') {
                    gradePoints += 0.5;
                } else {
                    StdOut.println("Invalid + Used, it's been ignored!");
                }

            }
            else if (prevChar != '\n'){
                StdOut.println("Not a grade.");
            }
        }

        StdOut.println("Total Classes: " + classes);
        StdOut.println("Total Grade-Points: " + gradePoints);
        StdOut.println("GPA: " + gradePoints/classes);

    }
}
