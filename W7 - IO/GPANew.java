public class GPANew {

    // This was our class code - YOU need to add the "previous character" stuff!
    // For an example with the previous character stuff, see "ImprovedGPACalculator.java"

    public static void main(String[] args) {

        double sum = 0;
        int classes = 0;

        while(StdIn.hasNextChar()) {
            char nextCharacter = StdIn.readChar();

            if (nextCharacter == '+') {
                sum += 0.5;
            } else if(nextCharacter == 'A') {
                sum += 4.0;
                classes ++;
            }
            else if(nextCharacter == 'B') {
                sum += 3.0;
                classes ++;
            }
            else if(nextCharacter == 'C') {
                sum += 2.0;
                classes ++;
            }
            else if(nextCharacter == 'D') {
                sum += 1.0;
                classes ++;
            }
            else if(nextCharacter == 'F') {
                sum += 0;
                classes ++;
            } else if(nextCharacter != '\n') {
                StdOut.println("Not a grade.");
            }
        }

        StdOut.println("Total Classes: " + classes);
        StdOut.println("Total GradePoints: " + sum);
        StdOut.println("GPA: " + sum/classes);
        

    }
    
}
