public class StringPalindromes {

    public static boolean isPalindrome(String s) { 
        int N = s.length();
        for (int i = 0; i < N/2; i++)
        if (s.charAt(i) != s.charAt(N-1-i))
           return false;
        return true;
    }

    private static boolean isPalindromeRecursive(String s, int left, int right) {
        // Base case
        if (left >= right) {
            return true;
        }

        // Solve one step
        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }

        // Recursive call on a smaller step
        return isPalindromeRecursive(s, left + 1, right - 1);
    }

    public static void main(String[] args) {
        String str1 = "George";
        String str2 = "123454321";
        String str3 = "123456789";
        String str4 = "abccba";
        String str5 = "CS111 is Great";

        StdOut.println("\n\nisPalindrome (iterative version):");
        StdOut.println(str1 + ": " + isPalindrome(str1));
        StdOut.println(str2 + ": " + isPalindrome(str2));
        StdOut.println(str3 + ": " + isPalindrome(str3));
        StdOut.println(str4 + ": " + isPalindrome(str4));
        StdOut.println(str5 + ": " + isPalindrome(str5));

        StdOut.println("\n\nisPalindrome (recursive version):");
        StdOut.println(str1 + ": " + isPalindromeRecursive(str1, 0, str1.length()-1));
        StdOut.println(str2 + ": " + isPalindromeRecursive(str2, 0, str2.length()-1));
        StdOut.println(str3 + ": " + isPalindromeRecursive(str3, 0, str3.length()-1));
        StdOut.println(str4 + ": " + isPalindromeRecursive(str4, 0, str4.length()-1));
        StdOut.println(str5 + ": " + isPalindromeRecursive(str5, 0, str5.length()-1));

    }

}
