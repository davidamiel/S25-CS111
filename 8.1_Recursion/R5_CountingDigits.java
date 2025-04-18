public class R5_CountingDigits {

    public static int ThreesI(int number) {
        int count = 0;
        while(number > 0) {
            int ones = number % 10;
            if(ones == 3) {
                count++;
            }
            number = number / 10;
        }
        return count;
    }

    public static int ThreesR(int number) {
        if(number == 0) {
            return 0;
        }
        int ones = number % 10;
        if(ones == 3){
            return 1 + ThreesR(number/10);
        } else {
            return ThreesR(number/10);
        }
    }

    public static void main(String[] args) {
        System.out.println(ThreesI(31341336));
        System.out.println(ThreesR(31341336));

    }


    
}
