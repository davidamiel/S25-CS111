public class StringClean {

    public static String stringCleanIterative(String str) {
        if (str.length() < 2) return str;
    
        String result = str.substring(0, 1); // Start with the first character
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(i - 1)) {
                result += str.charAt(i); // Append only if the current character is different from the previous one
            }
        }
    
        return result;
    }

    public static String stringCleanRecursive(String str) {
      if (str.length() < 2) return str;
      if (str.charAt(0) == str.charAt(1))
        return stringCleanRecursive(str.substring(1));
      else
        return str.charAt(0) + stringCleanRecursive(str.substring(1));
    }
    
    public static void main(String[] args) {

        String[] testCases = {
            "yyzzza",  
            "abbbcdd",  
            "hello",   
            "a",        
            "",        
            "aaa",    
            "aabbcc" 
        };
    
        System.out.println("Iterative Method:");
        for (String testCase : testCases) {
            System.out.println("Input: " + testCase + " -> Output: " + stringCleanIterative(testCase));
        }
    
        System.out.println("\nTesting Recursive Method:");
        for (String testCase : testCases) {
            System.out.println("Input: " + testCase + " -> Output: " + stringCleanRecursive(testCase));
        }
        
    }
}
    