public class AverageInputImproved {

    public static void main(String[] args) {
    
        StdOut.println("Enter numbers, followed by enter, to calculate their averages.");
        double sum = 0.0;
        int n = 0;
        StdOut.println("Enter a number, or Ctrl+D to stop: ");
        while (!StdIn.isEmpty())
        {
            StdOut.print("Enter a number, or Ctrl+D to stop: ");
            double x = StdIn.readDouble();
            sum = sum + x;
            n++;
        }
        StdOut.println("\n\nThe average of the numbers is: " + sum / n);
    }
}
