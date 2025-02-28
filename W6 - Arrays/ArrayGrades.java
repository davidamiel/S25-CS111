public class ArrayGrades {

    public static void main(String[] args) {

        System.out.println("\nPart 1: Average Grade");

        int[] grades = {80, 85, 91, 99, 73};

        // Part 1 - get average grade
        int sum = 0;
        for(int grade : grades)
            sum += grade;
        System.out.println("Average: " + (double) sum / grades.length);

        // Part 2 - average grade, drop 1 lowest score
        sum = 0;
        int lowest = grades[0];
        for(int grade : grades) {
            if (grade < lowest)
                lowest = grade;
            sum += grade;
        }
        sum -= lowest;
        System.out.println("\n\nPart 2: Average Grade with Lowest Grade Dropped");
        System.out.println("Lowest Grade: " + lowest);
        System.out.println("Average: " + (double) sum /(grades.length-1));

        // Part 3 - average grade, drop 2 lowest scores
        lowest = Math.min(grades[0], grades[1]);
        int secondLowest = Math.max(grades[0], grades[1]);
        sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
            if (grades[i] < lowest) {
                secondLowest = lowest;
                lowest = grades[i];
            } else if (grades[i] < secondLowest) {
                secondLowest = grades[i];
            }
        }
        sum = sum - lowest - secondLowest;
        System.out.println("\n\nPart 3: Average Grade with Lowest 2 Grades Dropped");
        System.out.println("Lowest Grades: " + lowest + ", " + secondLowest);
        System.out.println("Average: " + (double) sum / (grades.length - 2));
    } 
}
