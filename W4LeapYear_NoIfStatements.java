public class W4LeapYear_NoIfStatements {

    // This code came right from the slides/book (it's not mine)!
    // We also rewrote our leapyear code to not use if statements. 
    // Interesting how when we can print boolean values directly, we can circumvent needing IF in some cases!

    // Look at HeadsOrTails1 and HeadsOrTails2 first -- there, we also wrote code first with if statements, then again without them
    // --- in both cases, printing booleans was our "trick" to avoid needing ifs!

   public static void main(String[] args)
   {
      int year = Integer.parseInt(args[0]);
      boolean isLeapYear;
      // divisible by 4 but not 100
      isLeapYear = (year % 4 == 0) && (year % 100 != 0);
      
      // or divisible by 400
      isLeapYear = isLeapYear || (year % 400 == 0);

      System.out.println(isLeapYear);
   }
} 
