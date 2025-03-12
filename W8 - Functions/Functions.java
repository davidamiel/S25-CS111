public class Functions {

    public static double getArea(double radius) {
        // As a reminder, the area of a circle is pi * r^2
        double area = Math.pow(radius, 2) * Math.PI;
        return area;
    }

    public static double calculateArea(double diameter) {
        double rad = diameter / 2;
        double area = Math.pow(rad, 2) * Math.PI;
        return area;
    }

    public static double getRadius() {
        StdOut.print("Please enter a radius: ");
        double rad = StdIn.readDouble();
        return rad;
    }

    public static void main(String[] args) {

        double radiusRequested;
        radiusRequested = getRadius();

        StdOut.println("The area of the circle is: ");
        double answer = getArea(radiusRequested);
        StdOut.print(answer);
    }


    
}
