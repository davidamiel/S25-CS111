public class R8_InterestCalculator {

    public static double presentValue(double principal, double rate, int term) {
        if(term == 0) {
            return principal;
        }

        double interestEarned = principal * rate;
        double newValue = principal + interestEarned;
        int remainingTerm = term - 1;

        return presentValue(newValue, rate, remainingTerm); 

    }

    public static void main(String[] args) {

        double principal = 500.00;
        double APY = 0.04;
        int term = 12;

        double projectedValue = presentValue(principal, APY/12, term);

        System.out.println("$" + projectedValue);

        // Can you write a ROUND function and print out only the output to 2 decimals
    }

    
}
