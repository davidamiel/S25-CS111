public class EvenSums {

    public static void main(String[] args) {

        int sum = 0;

        for (int i = 0; i < 100; i ++) {
            if(i % 2 == 1)
                continue;
            sum = sum + i;
        }

        System.out.println(sum);

        sum = 0;

        for (int i = 2; i < 100; i+=2) {
		    sum = sum + i;
        }

        System.out.println(sum);



    }
    
}
