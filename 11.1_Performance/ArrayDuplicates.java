public class ArrayDuplicates {

    public static boolean hasDuplicatesOne(int[] array) {
        boolean hasDuplicates = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] == array[j]) {
                    hasDuplicates = true;
                }
            }
        }
        return hasDuplicates;
    }

    public static boolean hasDuplicatesTwo(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i != j && array[i] == array[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean hasDuplicatesThree(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] smallArray = new int[10000];
        for(int i = 0; i < smallArray.length; i++) {
            smallArray[i] = (int) Math.random() * smallArray.length * 2;
        }

        int[] mediumArray = new int[20000];
        for(int i = 0; i < mediumArray.length; i++) {
            mediumArray[i] = (int) Math.random() * mediumArray.length * 2;
        }

        int[] largeArray = new int[40000];
        for(int i = 0; i < largeArray.length; i++) {
            largeArray[i] = (int) Math.random() * largeArray.length * 2;
        }

        double start, end, trialOne, trialTwo, trialThree;

        System.out.println("Small Array: (n = " + smallArray.length + ")");
        start = System.currentTimeMillis();
        hasDuplicatesOne(smallArray);
        end = System.currentTimeMillis();
        trialOne = end - start;
        start = System.currentTimeMillis();
        hasDuplicatesTwo(smallArray);
        end = System.currentTimeMillis();
        trialTwo = end - start;
        start = System.currentTimeMillis();
        hasDuplicatesThree(smallArray);
        end = System.currentTimeMillis();
        trialThree = end - start;
        System.out.println("\tTrial One: " + trialOne + " milliseconds");
        System.out.println("\tTrial Two: " + trialTwo + " milliseconds");
        System.out.println("\tTrial Three: " + trialThree + " milliseconds");

        System.out.println("Medium Array: (n = " + mediumArray.length + ")");
        start = System.currentTimeMillis();
        hasDuplicatesOne(mediumArray);
        end = System.currentTimeMillis();
        trialOne = end - start;
        start = System.currentTimeMillis();
        hasDuplicatesTwo(mediumArray);
        end = System.currentTimeMillis();
        trialTwo = end - start;
        start = System.currentTimeMillis();
        hasDuplicatesThree(mediumArray);
        end = System.currentTimeMillis();
        trialThree = end - start;
        System.out.println("\tTrial One: " + trialOne + " milliseconds");
        System.out.println("\tTrial Two: " + trialTwo + " milliseconds");
        System.out.println("\tTrial Three: " + trialThree + " milliseconds");
        
        System.out.println("Large Array: (n = " + largeArray.length + ")");
        start = System.currentTimeMillis();
        hasDuplicatesOne(largeArray);
        end = System.currentTimeMillis();
        trialOne = end - start;
        start = System.currentTimeMillis();
        hasDuplicatesTwo(largeArray);
        end = System.currentTimeMillis();
        trialTwo = end - start;
        start = System.currentTimeMillis();
        hasDuplicatesThree(largeArray);
        end = System.currentTimeMillis();
        trialThree = end - start;
        System.out.println("\tTrial One: " + trialOne + " milliseconds");
        System.out.println("\tTrial Two: " + trialTwo + " milliseconds");
        System.out.println("\tTrial Three: " + trialThree + " milliseconds");




    }


    
}
