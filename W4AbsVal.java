public class W4AbsVal {

    // We wrote this code when we were first introduced to conditionals (if statements)!
    // We did this exact algorithm in pseudocode, now we're translating it into Java!
    // Note that you do not need { } for if statements with one line, but it's good practice
    // This code is the Java implementation of the flow chart from the slides!
    public static void main(String args[]) {

        double x = Double.parseDouble(args[0]);

        if (x < 0) {

            x = x * -1;

        }

        System.out.println(x);

    }
    
}
