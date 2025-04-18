public class StringComparisons {

    public static void main(String[] args) {
        
        // Code Snippet A
        String s3 = new String("goodbye"); 
        String s4 = new String("goodbye");

        if (s3 == s4)	
            StdOut.println("s3, s4 are equal");
        else
            StdOut.println("s3, s4 not equal");


        // Code Snippet B
        String s1 = "Hello";
        String s2 = "Hello";

        if (s1 == s2)	
            StdOut.println("s1, s2 are equal");
        else
            StdOut.println("s1, s1 not equal");

        // String.compareTo(String t)
        String str1 = "Hello";
        String str2 = "bye";
        if (str1.compareTo(str2) < 0)
            StdOut.println(str1 + " is first.");
        else if (str1.compareTo(str2) > 0) 	StdOut.print(str2 + " is first.");
        else
            StdOut.println("Strings are same");

        // String.equals(Object anObject)
        str1 = "Hello";
        str2 = "Hello";
        String str3 = "hey :P";
        int a = 4;

        StdOut.println(str1.equals(str2));
        StdOut.println(str1.equals(str1));
        StdOut.println(str2.equals(str1));
        StdOut.println(str1.equals(str3));
        StdOut.println(str3.equals(a));
    }
    
}
