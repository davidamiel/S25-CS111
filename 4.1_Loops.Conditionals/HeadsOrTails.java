public class HeadsOrTails {
    public static void main(String[] args) {

          /* Heads or Tails code (from book/slides)
          Notice we do not use { } since our if/else each only have one line of code
          If we went to add more code there, we might forget to add! (again, personal choice)
          (Challenge) Question to ponder: What if Math.random() <= 0.5 (changing <= to <)? 
          --- would this perform differently? can you write code to test this? */
          if (Math.random() < 0.5)
               System.out.println("Heads");
          else
               System.out.println("Tails");

          // This was our solution to heads/tails if we did not need to print "Heads"/"Tails"
          // and instead could print out just true/false. 
          // "Math.random() < 0.5" is a boolean! - we are taking two numerics and using a comparison operator
          // Then, printing out the value of the result. This is important!!!
          System.out.println(Math.random() < 0.5);

   }
}