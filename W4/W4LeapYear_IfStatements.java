public class W4LeapYear_IfStatements {
    /* Our class code to read an input from the command line and determine if it is a leap year.
     * See slides for instructions and info on leap years!!!
     * This was attempt #1 - using if statements
     * We talked about the order of if statements
     * and making sure we use else to prevent multiple conditions from being activated.
     * 
     * We also saw "if else" - which is not new to us, but an easier way to do multiple layers
     * of nested if statements (with many potential conditions) because java ignores whitespaces!
     *  ---- it does what we expect, but we don't need tons of layers of indentation/{}'s
     */
     public static void main(String args[]) {

        int year = Integer.parseInt(args[0]);

        if (year % 400 == 0) {
            System.out.println("Leap Year!");
        } else if (year % 4 == 0 && !(year % 100 == 0)) {
            System.out.println("Leap Year!");
        } else {
            System.out.println("No Leap :(");
        }

     }
}
