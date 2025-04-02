import java.util.Arrays;

public class ArraysInMemoryReview {

    public static int[] increaseByOne(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] ++;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] stuff = {1, 2, 3};
        int[] chair = increaseByOne(stuff);
        chair[2] = 458721;
        System.out.println(Arrays.toString(stuff));
        System.out.println(Arrays.toString(chair));
    }
    
}
