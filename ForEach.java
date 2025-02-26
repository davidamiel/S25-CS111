public class ForEach {

    public static void main(String[] args) {
        double sum, average;
        double[] grades = {99.5, 74.2, 83.7, 57.6};


        sum = 0;
        for(double unicorn : grades) {
            sum += unicorn;
        }
        average = sum/grades.length; 
        System.out.println("Average = " + average);

        sum = 0;
        for(int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        average = sum/grades.length; 
        System.out.println("Average = " + average);



    }
    
}
