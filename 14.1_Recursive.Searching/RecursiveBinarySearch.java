public class RecursiveBinarySearch {

    // Inclusive upper bound!
    public static int search(int target, int[] values, int L, int H) {
        if (L > H) {return -1;} // base case #1 - target NOT found

        int M = L + (H - L) / 2;

        if (values[M] == target) {return M;} // base case #2 - search success!

        if (values[M] > target) {
            return search(target, values, L, M-1);
        } else {
            return search(target, values, M + 1, H);
        }

    }



    public static int search (String key, String[] a, int lo, int hi) {
        if (hi <= lo)
            return -1;
        int mid = lo + (hi - lo) / 2;
        int cmp = a[mid].compareTo(key); // Can’t use .equals here!
        if (cmp > 0)
            return search(key, a, lo, mid);
        else if (cmp < 0)
            return search(key, a, mid+1, hi);
        else
            return mid;
    }

        // (Overloaded) Helper Function (hides some parameters!)
        public static int search (String key, String[] a) {
            return search(key, a, 0, a.length);
        }
}
