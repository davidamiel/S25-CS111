public class PQWhile
{ 
   public static void main(String[] args)
   {  
      int n = Integer.parseInt(args[0]);
      int i = 0;
      int v = 1;
      while (i <= n) // DANGER infinite loop below (control + c)
         System.out.println(v);
         i = i + 1;
         v = 2 * v;
   }
} 

