public class W4Welcome3 {
    /** 
     * Class warm-up excercise - part 2! Now read the name and an assignment number!
     * (PS - YES, you don't need to read in assignmentNumber as an int, but we do for practice!)
     */
    public static void main(String args[]) {

        String name = args[0];
        int assignmentNumber = Integer.parseInt(args[1]);

        String messageOne = "Hello, ";
        String messageTwo = "! I hope you have started A";

        System.out.println(messageOne + name + messageTwo + assignmentNumber + "!");


    }
    
}
