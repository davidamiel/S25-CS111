public class Multiples {

	public static void main(String[] args) {

		// Bad Solution!
		System.out.println("1\t2\t3\t4");
		System.out.println("2\t4\t6\t8");
		System.out.println("3\t6\t9\t12");
		System.out.println("4\t8\t12\t16");
		System.out.println("5\t10\t15\t20");

		// Good Solution!
		for(int i = 1; i <= 3; i++) {
            System.out.println();
            for(int j = 1; j <= 3; j++) {
                System.out.print(i*j + "\t");
            }
        }

	}

}