public class SearchAString {
    public static void main(String[] args) {

        String query = args[0];
        while (!StdIn.isEmpty()) {
            String s = StdIn.readLine();
            if (s.contains(query)) {
                StdOut.println(s);
            }
        }
        
    }
}
