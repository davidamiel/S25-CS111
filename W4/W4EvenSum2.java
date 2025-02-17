public class W4EvenSum2 {

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 2; i < 100; i+=2) {
		sum = sum + i;
        }

        System.out.println(sum);

    }
}

