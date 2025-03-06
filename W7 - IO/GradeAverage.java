public class GradeAverage {

    public static void main(String[] args) {

        char[] grades = new char[3];

        char gradeOne = StdIn.readChar();
        grades[0] = gradeOne;

        char gradeTwo = StdIn.readChar();
        grades[1] = gradeTwo;

        char gradeThree = StdIn.readChar();
        grades[2] = gradeThree;

        int sum = 0;
        for(int i = 0; i < grades.length; i ++) {
            if(grades[i] == 'A'){
                sum += 4;
            }
            if(grades[i] == 'B'){
                sum += 3;
            }
            if(grades[i] == 'C'){
                sum += 2;
            }
        }
        StdOut.println("GPA: " + (double) sum/3);








        
    }
    
}
