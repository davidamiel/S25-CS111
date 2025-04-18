public class ArrayMemory {

    public static void main(String[] args) {

        int a = 4;
        int b = a;
        a = 5;
        System.out.println("a = " + a); // 5
        System.out.println("b = " + b); // 4

        int[] A = new int[5];
        A[0] = 1;
        int[] B = A;
        A[0] = 2;
        System.out.println("a[0] = " + A[0]);
        System.out.println("b[0] = " + B[0]); 

    }
    
}
