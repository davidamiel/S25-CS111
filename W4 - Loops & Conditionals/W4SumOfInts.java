public class W4SumOfInts {

    public static void main(String[] args) {
 
       int n = 0;
       int N = Integer.parseInt(args[0]);
       int sum = 0;
       
       while(n <= N) {
          sum = sum + n;
          n = n + 1;
       }
 
       System.out.println("Sum: " + sum);
 
    }
 }
 