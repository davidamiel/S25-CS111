public class W4EvenSum1 {

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 0; i < 100; i ++) {
            if(i % 2 == 1) {
                continue;
            }
            sum = sum + i;

        }

        System.out.println(sum);



    }
    
}
