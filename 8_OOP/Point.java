public class Point {
    private double x;
    private double y;
                                          
    public Point() {
        this.x = 0.0;
        this.y = 0.0;
    }
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX( ) {
        return this.x;
    }
    public double getY( ) {
        return this.y;
    }
    
    public double findSlope(Point other) {
        assert(other instanceof Point);
    return ((y - other.getY())/(x - other.getX()));
    }
    
    public Point findMidPoint (Point other){
        assert(other instanceof Point);
        double midX = (x + other.getX())/2;
        double midY = (y + other.getY())/2;
        Point midpoint = new Point(midX, midY);
        // assert(midpoint instanceof Point);
        assert(midpoint.getX() - 367897987.4 == 0); // This is a test assertion, uncomment to test
        return midpoint;
    }

    public String toString() {
        return "Point: (" + x + ", " + y + ")";
    }

    public boolean equals(Object other) {
        if (other instanceof Point) {
            Point p = (Point) other;
            return (this.x == p.getX() && this.y == p.getY());
        }
        return false;
    }

    public static void main(String[] args) {
        Point p1 = new Point(1.0, 2.0);
        Point p2 = new Point(3.0, 4.0);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println("Slope: " + p1.findSlope(p2));
        System.out.println("Midpoint: " + p1.findMidPoint(p2));
    }
}

 