public class MoreCats {

    public static void main(String[] args) {

        StdOut.println("Enter Ana's Cats: ");
        int anasCats = StdIn.readInt();
        StdOut.println("Enter Ellen's Cats: ");
        int ellensCats = StdIn.readInt();

        int totalCats = anasCats + ellensCats;

        StdOut.println("Total Cats: " + totalCats);
        
    }
    
}
