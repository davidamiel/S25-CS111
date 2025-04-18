public class WelcomeWarmUp {

	// Our warm up assignment. This was my solution, but probably not yours!
	// See other W4Welcome code for other solutions.
	// I'm using += for Strings - what is the + operator here (context!!!)?
	public static void main(String args[]) {

		// Welcome 1
		String name = args[0];

		String toPrint = "Hello, ";
		toPrint += name;
		toPrint += "! I hope you have started A2!";

		System.out.println(toPrint);

		// Welcome 2
		// String name = args[0];
		System.out.println("Hello, " + name + 
                        "! I hope you have started A2!");


		// Welcome 3 (PS - YES, you don't need to read in assignmentNumber as an int, but we do for practice!)
		// String name = args[0];
        int assignmentNumber = Integer.parseInt(args[1]);

        String messageOne = "Hello, ";
        String messageTwo = "! I hope you have started A";

        System.out.println(messageOne + name + messageTwo + assignmentNumber + "!");

	}

}