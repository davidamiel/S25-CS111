public class W3F {

    public static void main(String args[]) {

        double hoursWorked = Double.parseDouble(args[0]);
        double hourlyWages = Double.parseDouble(args[1]);
        
        double totalPay = hoursWorked * hourlyWages;

        System.out.println("Total Pay: $" + totalPay);
        
    }
}