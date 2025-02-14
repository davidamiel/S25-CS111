public class W4TwoSort { 
    
    /* 
     * This was our "mystery" code! Without knowing the name of the class,
     * we were able to figure out what this code is doing. One of our usual 
     * tools for doing that is to TRACE the code - that works here as well!
     */
    public static void main(String[] args) {
   
       int a = Integer.parseInt(args[0]);
       int b = Integer.parseInt(args[1]);
 
       if (b < a) { 
          int t = a;
          a = b;
          b = t;
       }
       
       System.out.println(a);
       System.out.println(b);
 
    }
 }
 
 