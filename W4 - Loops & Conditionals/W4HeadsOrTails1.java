public class W4HeadsOrTails1 {
    
    // Heads or Tails code (from book/slides)
    // Notice we do not use { } since our if/else each only have one line of code
    // If we went to add more code there, we might forget to add! (again, personal choice)

    // (Challenge) Question to ponder: What if Math.random() <= 0.5 (changing <= to <)? 
    // --- would this perform differently? can you write code to test this?

    public static void main(String[] args)
   {
      if (Math.random() < 0.5)
           System.out.println("Heads");
      else
           System.out.println("Tails");
   }
}
