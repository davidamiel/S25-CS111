public class W4ThreeSort { 

    /* 
     * After figuring out what TwoSort.java did, your challenge was to
     * write code that would read three numbers from the command line and 
     * print them out in ascending order. 
     * 
     * Below is the code for the strategy I discussed in class on Thursday.
     * This is not the only way - how can you break/remake/change this code
     * or rewrite it completely to accomplish the same task? What about for
     * descending order? What are good test cases?
     */
    public static void main(String[] args) {  
 
       int a = Integer.parseInt(args[0]);
       int b = Integer.parseInt(args[1]);
       int c = Integer.parseInt(args[2]);
 
       if (b < a) {
        int t = a;
        a = b;
        b = t;
        }
       if (c < a) {
        int t = a;
        a = c;
        c = t;
        }
       if (c < b) {
        int t = b;
        b = c;
        c = t;
        }
 
       System.out.println(a + ", " + b + ", " + c);      
       
    }
 }
 