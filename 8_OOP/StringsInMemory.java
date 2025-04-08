public class StringsInMemory {

	public static void main(String[] args) {

		int a = 4;
		int b = a;
		a = 5;
		StdOut.println("a = " + a);
		StdOut.println("b = " + b);

		int[] arrayA = new int[3];
		arrayA[0] = 6;
		int[] arrayB = arrayA;
		arrayA[0] = 7;
		StdOut.println("arrayA[0] = " + arrayA[0]);
		StdOut.println("arrayB[0] = " + arrayB[0]);
		
 		String s1 = "Hello";
		String s2 = s1;
		s1 += ", World!";
		StdOut.println("s1 = " + s1);
		StdOut.println("s2 = " + s2);

	}
}

