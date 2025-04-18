public class ClassDie {

    // INSTANCE VARIABLES -- PART ONE OF A "DATA TYPE" = VALUES
    // Note that they are marked private!
    // Only instance methods should change instance variables!
    // Each instance of ClassDie will have its own set of values.
    private int currentValue;
    private int numberOfSides;

    // Note the header! No typical "return type." Must be public.
    public ClassDie(int numberOfSides) {
        this.numberOfSides = numberOfSides;
        this.roll();
    }

    // Default constructor - no arguments!
    // sets the instance variables to what WE say the default should be!
    public ClassDie() {
        this.numberOfSides = 6;
        this.roll();
    }


    // INSTANCE METHODS -- PART ONE OF A "DATA TYPE" = OPERATIONS

    // Accessor methods - since the instance variables are private, we let 
    // clients see the values by returning them through "getter" methods like these!
    public int getCurrentValue() {
        return this.currentValue;
    }

    public int getNumberOfSides(){
        return this.numberOfSides;
    }

    // Other instance method (not an accessor)
    public void roll() {
        this.currentValue = (int) (Math.random() * numberOfSides) + 1;
    }

    // This is a "standard" method - it represents the object in a String!
    // It should always use this header exactly! 
    // When we attempt to print an object of this type, Java will "cast" it to a 
    // String by using this method! (Remember, with arrays, we've gotten a memory location.)
    public String toString() {
        String s1 = this.numberOfSides + "-sided die, currently at " + this.currentValue;
        return s1;
    }

    // This is a "standard" method - it determines equality (since we should not use ==)!
    // It should always use this header exactly!
    // We first make sure we are comparing two objects of the same type!
    public boolean equals(Object other) {
        if (other instanceof ClassDie) {  // is the other object an ClassDie? (BTW THE ISSUE DURING CLASS - LOWERCASE 'o' in instanceof!!!)
            ClassDie otherDie = (ClassDie) other;
            boolean sameValue = this.currentValue == otherDie.getCurrentValue();
            boolean sameSides = this.numberOfSides == otherDie.getNumberOfSides();
            return (sameValue && sameSides);
        }
        return false;
    }

    // A main method inside our object - used for unit tests!
    public static void main(String[] args) {
        ClassDie dieOne = new ClassDie();
        StdOut.println(dieOne); // testing toString
        dieOne.roll(); // testing Roll
        StdOut.println(dieOne); // testing toString

        ClassDie dieTwo = new ClassDie(6);

        // How many rolls until we get the same value? 
        while(dieOne.equals(dieTwo) == false) {
            StdOut.println("Rolling...");
            dieOne.roll();
            dieTwo.roll();
            StdOut.println("\tdieOne = " + dieOne.getCurrentValue());
            StdOut.println("\tdieTwo = " + dieTwo.getCurrentValue());
        }

    }
    
}
