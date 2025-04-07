public class CoinFlips {

    public static void main(String[] args) {

        // Part 1 - Flipping a coin 10 times
        int i = 0;

        while (i < 10) {
            if(Math.random() > 0.5){
                System.out.println("Heads");
            } else {
                System.out.println("Tails");
            }
            i = i +1;
        }

        // Part 2 - Counting the number of heads in 10 flips
        i = 0;
        int numberOfHeads = 0;

        while (i < 10) {
            if(Math.random() > 0.5){
                numberOfHeads++;
            }
            i = i +1;
        }
        System.out.println("Heads: " + numberOfHeads);


        // Part 3 - Counting the number of heads in N flips
        i = 0;
        int N = Integer.parseInt(args[0]);
        numberOfHeads = 0;

        while (i < N) {
            if(Math.random() > 0.5){
                numberOfHeads++;
            }
            i = i +1;
        }

        System.out.println("Heads: " + numberOfHeads);
    }
    
}
