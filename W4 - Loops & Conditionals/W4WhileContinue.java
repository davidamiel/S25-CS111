public class W4WhileContinue {
    public static void main(String[] args) {
        
        int i = 0;
        
        while (i <= 15) {
            i = i + 1;
            if(i % 2 == 0)
                continue;
            System.out.print(i + " ");

        }
    }
}
