import java.util.Arrays;

public class ArrayEquality {

    public static void main(String[] args) {
        
        int[] a = new int[5];
        Arrays.fill(a, 5);

        int[] b;

        b = a;

        System.out.println(a == b);
        
        // System.out.println("a[2] = " + a[2] + "\tb[2] = " + b[2]);



    }
    
}
