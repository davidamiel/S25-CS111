public class ArraysReview {

    // This is ALL review! We did this during the Exam 2 review session
    // Note how each of these problems are similar in structure! 
    // We have "accumulator" variables declared, then we traverse the array 
    // While we traverse, we can update our accumulator variables (if conditions are met)
    // Then we use the accumulator variables to get our answer!

    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 5, 6};

        // Print the sum of the elements in arr
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);

        // Print the sum of the even elements in arr
        sum = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }
        System.out.println(sum);

        // Print the max value in an array
        int max = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
        
        // We can take this structure and go crazy -
        // Max value of an array that is even, divisible by 5, comes right before a "3", is prime, etc.

        // When might you need more than one accumulator variable??
        // For some counts and some indices, perhaps?
    }

    
    
}
