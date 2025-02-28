public class ArraysMore {

    public static void main(String[] args) {
    
    double[] values = {33.5, 28.6, 41.9, 50, 34, 41.9};

    // Find the average of an array, for loop
    double sum = 0;
    for(int i = 0; i < values.length; i++) {
        sum += values[i];
    }
    System.out.println("Average: " + sum/values.length);

    // Find the average of an array, for-each loop
    sum = 0;
    for(double num : values) { 
        sum += num;
    }
    System.out.println("Average: " + sum/values.length);

    // Find the max of an array, for loop
    double maximum = values[0];
    for(int i = 0; i < values.length; i++){
        if (values[i] > maximum) {
            maximum = values[i];
        }
    }
    System.out.println("Maximum: " + maximum);

    // Find the max of an array, for-each loop
    maximum = values[0];
    for(double num : values){
        if (num > maximum) {
            maximum = num;
        }
    }
    System.out.println("Maximum: " + maximum);

    // Find the max of an array and its index, for loop
    maximum = values[0];
    int maxindex = 0;
    for(int i = 0; i < values.length; i++){
        if (values[i] > maximum) {
            maximum = values[i];
            maxindex = i;
        }
    }
    System.out.println("Maximum: " + maximum + " at index " + maxindex);


    // Reverse the values in an array
    double[] reversed = new double[values.length];
    for(int i = 0; i < values.length; i ++) {
        // When i = 0, I need to put the first element of values into the last element of reversed
        //                  so, reversed[reversed.length - 1] = values[0]
        // When i = 1, reversed[reversed.length - 2] = values[1]
        // When i = 2, reversed[reversed.length - 3] = values[1]
        reversed[reversed.length - (i+1)] = values[i];
    }
    System.out.println();
    for (double element : reversed) {
        System.out.print(element + "\t");
    }

        // Reverse the values in an array in place
        for(int i = 0; i < values.length/2; i ++) {
            //When i = 0, temporary holds the last element in the array
            //            I then put the first element into the last slot
            //            I then put (temporary, or what was) the last element into the first slot
            double temporary = values[values.length - (i+1)];
            values[values.length - (i+1)] = values[i];
            values[i] = temporary;
        }
        System.out.println();
        for (double element : values) {
            System.out.print(element + "\t");
        }


        //Check if a value is contained in an array
        double target = 50.0;
        for(double value : values) {
            if(value - target == 0) {
                System.out.println("Value found!");
            }
        }

        // Check for duplicates in an array
        for(int i = 0; i < values.length; i++) {
            double targetTwo = values[i];
            int timesFound = 0;
            for(double value : values) {
                if(value - targetTwo == 0) {
                    timesFound++;
                }
            }
            if (timesFound > 1) {
                System.out.println("Duplicate!");
                values[i] = -1;
            }

        }

}
}
