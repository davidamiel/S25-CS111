public class ForEach {

    public static void main(String[] args) {

        double sum = 0;
        double[] grades = {99.5, 74.2, 83.7, 57.6};

        // in a for-each, we give the dataType, the name we will use to refer to each value, and the array we are traversing
        // the dataType is already set (when we declare the array)
        // the arrayName is already set (when we declare the array)
        // we can call the value reference anything we want (but usually we are more thoughtful than unicorn!)
        for(double unicorn : grades) {
            sum += unicorn;
        }
        System.out.println("Average = " + sum/grades.length);

        
        // this for loop does the same thing!
        sum = 0;
        for(int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        System.out.println("Average = " + sum/grades.length);



    }
    
}
