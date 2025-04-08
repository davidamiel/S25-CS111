public class StringImmutability {

    public static void main(String[] args) {
        
        String stringA = "dog";
        String stringB = "house";
        String stringC = stringA;
        stringA = "cat";
        stringC = stringC + stringB;

    }
}
