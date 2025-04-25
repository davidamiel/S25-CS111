import java.util.ArrayList;

public class SearchTesting {

    public static void main(String[] args) {

        int[] values = {2, 7, 3, 8, 6, 5, 9, 0, 4, 1};

        for(int i = -1; i < 12; i++) {
            int result = SequentialSearch.sequentialSearch(values, i);
            System.out.println("Sequential search of " + i + ": " + result);
        }

        String[] fruits = {"apples", "oranges", "bananas", "grapefruits", "grapes"};
        String[] searchFruits = {"bananas", "grapes", "strawberrires"};
        for(int i = 0; i < searchFruits.length; i++) {
            int result = SequentialSearch.sequentialSearch(fruits, searchFruits[i]);
            System.out.println("Sequential search of '" + searchFruits[i] + "': " + result);
        }

        ArrayList<String> newFruits = new ArrayList<String>();
        newFruits.add("apples");
        newFruits.add("oranges");
        newFruits.add("bananas");
        newFruits.add("grapefruits");
        newFruits.add("grapes");

        ArrayList<String> newSearchFruits = new ArrayList<String>();
        newSearchFruits.add("bananas");
        newSearchFruits.add("grapes");
        newSearchFruits.add("strawberries");

        for(int i = 0; i < newSearchFruits.size(); i++) {
            int result = SequentialSearch.sequentialSearch(newFruits, newSearchFruits.get(i));
            System.out.println("Sequential search of '" + newSearchFruits.get(i) + "': " + result);
        }

        int[] sortedInts = {1, 2, 3, 4, 5, 6, 7, 8};
        for(int i = -1; i < 12; i++) {
            int result = BinarySearch.binarySearch(sortedInts, i);
            System.out.println("Binary search of " + i + ": " + result);
        }
    }
}
