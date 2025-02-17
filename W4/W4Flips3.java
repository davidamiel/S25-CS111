public class W4Flips3 {

    public static void main(String[] args) {

        int i = 0;
        int N = Integer.parseInt(args[0]);
        int numberOfHeads = 0;

        while (i < N) {
            if(Math.random() > 0.5){
                numberOfHeads++;
            }
            i = i +1;
        }

        System.out.println("Heads: " + numberOfHeads);
    }
    
}
