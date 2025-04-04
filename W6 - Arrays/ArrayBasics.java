import java.util.Arrays;

public class ArrayBasics {

    public static void increaseInt(int number) {
        number = number + 1;
    }

    public static void increaseArray(int[] numbers) {
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] += 1;
        }

    }

    public static void main(String[] args) {

        int[] a = new int[6];
        int[] aTwo = {1, 2, 3};

        String blah = new String("heya");
        String blahTwo = "yall"
        

        String stringOne = "Hello";
        String stringTwo = "Goodbye";

        String stringThree = stringOne;

        System.out.println(stringOne);
        System.out.println(stringThree);

        stringOne += ", David";

        System.out.println(stringOne);
        System.out.println(stringThree);




    }
}