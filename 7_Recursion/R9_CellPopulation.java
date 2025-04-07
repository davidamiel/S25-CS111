public class R9_CellPopulation {

    public static long popCount(int rounds, long currentPopulation) {
        if (rounds == 0) {
            return currentPopulation;
        }
        long newPop = currentPopulation * 2;
        return popCount(rounds - 1, newPop);
    }

    public static void main(String[] args) {

        long populationAfter25 = popCount(25, 1);
        long populationAfter35 = popCount(35, 1);

        System.out.println("After 25 rounds of division, there will be " + populationAfter25 + " cells.");
        System.out.println("After 35 rounds of division, there will be " + populationAfter35 + " cells.");

    }
    
}
