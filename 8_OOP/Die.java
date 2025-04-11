public class Die {

    private int numberOfSides;
    private int currentValue;
    private String color;

    public Die(int numberOfSides, String color) {
        this.numberOfSides = numberOfSides;
        this.color = color.toLowerCase();
    }

    public Die() {
        this.numberOfSides = 6;
        this.color = "white";
    }

    public void rollDie() {
        this.currentValue = getRandomNumber();
    }

    private int getRandomNumber() {
        double rand = Math.random();
        return (int) (rand * numberOfSides) + 1;
    }

    private String getDots(int dots, String color) {
        if (dots <= 0) {
            return "";
        }
        String dot = "⚪️";
        if(color.equals("blue")) {
            dot = "🔵";
        }
        if(color.equals("red")) {
            dot = "🔴";
        }
        if(color.equals("black")) {
            dot = "⚫️";
        }
        String dotline = "\t";
        for(int i = 0; i < dots; i ++) {
            dotline += dot;
        }
        return dotline;
    }

    public String toString() {
        if (numberOfSides == 6 && color.equals("white")) {
            if (currentValue == 1) return "⚀: 1\t⚪️";
            if (currentValue == 2) return "⚁: 2\t⚪️⚪️";
            if (currentValue == 3) return "⚂: 3\t⚪️⚪️⚪️";
            if (currentValue == 4) return "⚃: 4\t⚪️⚪️⚪️⚪️";
            if (currentValue == 5) return "⚄: 5\t⚪️⚪️⚪️⚪️⚪️";
            if (currentValue == 6) return "⚅: 6\t⚪️⚪️⚪️⚪️⚪️⚪️";
        }
        String dots = getDots(currentValue, color);
        return new String("🎲: " + this.currentValue + " " + dots);
    }

    public boolean equals(Object other) {
        if (other instanceof Die) {
            Die otherDie = (Die) other;
            boolean sameColor = this.color.equals(otherDie.color);
            boolean sameValue = this.currentValue == otherDie.currentValue;
            boolean sameMaxValue = this.numberOfSides == otherDie.numberOfSides;
            return sameColor && sameValue && sameMaxValue;
        }
        return false;
    }
    
}
