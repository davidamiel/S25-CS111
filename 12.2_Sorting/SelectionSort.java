public class SelectionSort {

    public static void sortA(int[] a){
        int n = a.length;
        for (int i= 0; i < n; i++){
            int min = i;
            for (int j = i+1; j < n; j++){
                if (a[j] < a[min])
                    min = j;
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
    }
    
    public static void sortB(int[] a){
        int n = a.length;
        for (int i= 0; i < n; i++){
            int min = i;
            for (int j = i+1; j < n; j++){
                if (a[j] < a[min])
                    min = j;
            }
            swap(a, i, min);
        }
    }
    
    public static void swap(int[] data, int spot1, int spot2){
        int temp = data[spot1];
        data[spot1] = data[spot2];
        data[spot2] = temp;
    }
    
    
    
    
}
