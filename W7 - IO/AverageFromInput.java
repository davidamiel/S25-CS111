public class AverageFromInput {

    public static void main(String[] args) {
    
        double sum = 0.0;
        int n = 0;
        while (!StdIn.isEmpty())
        {
            double x = StdIn.readDouble();
            sum = sum + x;
            n++;
        }
        StdOut.println(sum / n);
    }
}
