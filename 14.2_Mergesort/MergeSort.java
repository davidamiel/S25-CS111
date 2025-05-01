public class MergeSort {

    // Helper method
    public static void printArray(int[] a){
		for(int elt: a){
			System.out.print(elt + ",\t");
		}
		System.out.println();
    }

    // Before we saw merge sort, we discussed how to sort two sorted arrays!
    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int[] merged = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                merged[k] = arr1[i];
                k++;
                i++;
            } else {
                merged[k] = arr2[j];
                k++;
                j++;
            }
        }

        while (i < arr1.length) {
            merged[k] = arr1[i];
            k++;
            i++;
        }

        while (j < arr2.length) {
            merged[k] = arr2[j];
            k++;
            j++;
        }

        return merged;
    }

    // Then, we saw the Mergesort algorithm!
    public static void mergeSort (int[] a, int l, int r){
		if (l >= r) return;

		int middle = (l + r)/ 2;

	    mergeSort(a, l, middle);
		mergeSort(a, middle + 1, r);


        // We need a new version of our method that deals with indices instead of two arrays!
		merge(a, l, r);


		printArray(a);
	
    }


    // This is that new version! 
    // Remember, it is the same logic and process as the combining arrays code we started with.
    // However, we are now using pointers instead of two arrays. 
    // Don't let the pointers be your downfall! Understand the process, and take your time!

    public static void merge (int[] a, int left, int right){
	
        int[] temp = new int[right - left + 1];
        if (left >= right ) return;
    
        int mid = (left + right)/2; 
        int i = 0;//fills temp array
        int leftIndex = left;
        int rightIndex = mid + 1; 
    
        while ((leftIndex <= mid) && (rightIndex <= right)){
          if (a[leftIndex] <= a[rightIndex]){
              temp[i]= a[leftIndex];
            leftIndex++;
             } else{
                 temp[i]= a[rightIndex];
                 rightIndex++;
             }
             i++;
        }
    
        while (leftIndex <= mid){
            temp[i] = a[leftIndex];
            leftIndex++;
            i++;
            }
        while (rightIndex <= right){
            temp[i] = a[rightIndex];
            rightIndex++;
            i++;
        }
        for (i  = left; i <= right; i++){
            a[i] = temp[i-left];
        }
    }
    public static void main(String[] args) {

        int[] testarray = {7, 3, 2, 67, 8, 3, 2, 7};

        // Inclusive upper bound!
        mergeSort(testarray, 0, testarray.length-1);
        int[] a = {1, 3, 5, 7};
        int[] b = {2, 4, 6, 8, 10};


        int[] merged = mergeSortedArrays(a, b);

        System.out.print("Merged Array: ");
        for (int num : merged) {
            System.out.print(num + " ");
        }
    }
}