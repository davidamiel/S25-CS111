public class ArraySum {

    public static double getSum(double[] array) {
        double sum = 0;
        for(int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        
        double[] smallArray = new double[1000000];
        for(int i = 0; i < smallArray.length; i++) {
            smallArray[i] = Math.random();
        }

        double[] mediumArray = new double[2000000];
        for(int i = 0; i < mediumArray.length; i++) {
            mediumArray[i] = Math.random();
        }

        double[] largeArray = new double[4000000];
        for(int i = 0; i < largeArray.length; i++) {
            largeArray[i] = Math.random();
        }

        double start, end; 

        start = System.currentTimeMillis();
        getSum(smallArray);
        end = System.currentTimeMillis();
        System.out.println("small array: " + (end - start) + " milliseconds");

        start = System.currentTimeMillis();
        getSum(mediumArray);
        end = System.currentTimeMillis();
        System.out.println("medium array: " + (end - start) + " milliseconds");

        start = System.currentTimeMillis();
        getSum(largeArray);
        end = System.currentTimeMillis();
        System.out.println("large array: " + (end - start) + " milliseconds");

    }
    
}
