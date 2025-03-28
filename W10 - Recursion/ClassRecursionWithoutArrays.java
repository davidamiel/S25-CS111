public class ClassRecursionWithoutArrays {

    public static int threes(int number) {
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

    public static int RThrees(int number) {
        if(number == 0) {
            return 0;
        }
        int ones = number % 10;
        if(ones == 3){
            return 1 + RThrees(number/10);
        } else {
            return RThrees(number/10);
        }
    }

    public static void main(String[] args) {
        System.out.println(threes(31341336));
        System.out.println(RThrees(31341336));

    }


    
}
