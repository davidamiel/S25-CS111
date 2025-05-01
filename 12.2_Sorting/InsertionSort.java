public class InsertionSort {

    public static void printArray(int[] array) {
        System.out.print("\n\n[");
        for(int item : array) {
            System.out.print(item + "  ");
        }
        System.out.print("]");

    }

    public static void insertionSort(int[] A){
		int itemsSorted;
		for (itemsSorted = 1; itemsSorted < A.length; itemsSorted++){
			int temp = A[itemsSorted];
			int loc = itemsSorted - 1;
			while (loc >= 0 && A[loc] > temp){
				A[loc + 1] = A[loc];
				loc = loc - 1;
			}
			A[loc + 1] = temp;
			printArray(A);
		}
	}


    public static void main(String[] args) {
        int[] arrayToSort = {6, 2, 8, 238, 6912, 37, 5, 1};

        insertionSort(arrayToSort);
        
    }
    
}
