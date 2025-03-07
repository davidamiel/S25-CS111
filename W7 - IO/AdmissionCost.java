public class AdmissionCost {

    public static void main(String[] args) {
        
        StdOut.println("How many people?");
        int people = StdIn.readInt();

        StdOut.println("Do you need parking (true/false)?");
        boolean parking = StdIn.readBoolean();

        int cost = people * 15;
        if (parking)
            cost += 10;

        StdOut.println(cost);
    }
    
}
