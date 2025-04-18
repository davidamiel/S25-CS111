public class CheckforEDUs {

    public static void main(String[] args) {
        
        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            if (s.startsWith("http://") && s.endsWith(".edu"))
                StdOut.println(s);
    
        }
    }
}
