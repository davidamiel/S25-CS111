public class ArrayOfGrades {

    public static void main(String[] args) {
        
        //int a[] = new int[10];
        //Arrays.fill(a, 20);

        //for(int i = 0; i < 10; i++) {
        //    System.out.println(a[i]);
        //}

        // Say I have in an int array named "grades" all of the homework grades for a student.
        // Write Java code to compute the average homework grade for that student.

        int[] grades = {80, 85, 91, 99, 73};

        double sum = 0;
        for(int i = 0;  i < grades.length; i++) {
            sum = sum + grades[i];
            // sum += grades[i];
        }

        double average = sum/grades.length;

        System.out.println("Average Homework Grade: " + average);

        // Print the maximum value in an array
        int[] values = {80, 85, 91, 99, 73};

        int max = values[0];

        for(int i = 1; i < values.length; i++) {
            if (values[i] > max) {
                max = values[i];
            }
        }
        System.out.println("Max value: " + max);


        // Print the average homework grade, but we drop the lowest grade
        // TRY THIS YOURSELF - the answer is in ArrayOfGradesAnswers.java

        // Print the average homework grade, but we drop the lowest 2 grades
        // TRY THIS YOURSELF - the answer is in ArrayOfGradesAnswers.java

    }
    
}
