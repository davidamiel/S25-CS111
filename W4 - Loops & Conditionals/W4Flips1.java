public class W4Flips1 {

    public static void main(String[] args) {

        int i = 0;

        while (i < 10) {
            if(Math.random() > 0.5){
                System.out.println("Heads");
            } else {
                System.out.println("Tails");
            }
            i = i +1;
        }
    }
    
}
