import java.util.Arrays;

public class ArrayEquality {

    public static void main(String[] args) {
        
        int[] a = new int[5];
        Arrays.fill(a, 5);

        int[] b;
        b = a;

        // True - because a and b point to the same array - reference equality!
        System.out.println("a==b is " + (a == b));

        int[] c = {5, 5, 5, 5, 5};

        // False - a and b do NOT point to the same location in memory
        System.out.println("a==c is " + (a == c));

        // Remember - a, b, and c are references/pointers to memory locations!
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);




    }
    
}
