public class WorstDiceGameEver {

    public static Die[] gameDice = null;

    public static void main(String[] args) {

        StdOut.println("🎲 Welcome! 🎲\n");
        
        while(true) {
            StdOut.println("\nWhat would you like to do?\n");
            printChoices();
            int choice = StdIn.readInt();
            switch(choice) { /// BTW - a switch statemeent is basically a series of if statements! 
                /// you don't "need to know" how to write them, but they are a good way to do this.
                /// the alternative is to write a series of if statements, like this:
                ///   if (choice == 1) {
                ///        seeDice();
                ///   } else if (choice == 2) {
                ///       rollAll();
                ///   ...and so on.
                /// But a switch statement is cleaner and easier to read.
                /// We include continue because we want to go back to the top of the loop after each choice. Otherwise,
                /// we would execute all code after the switch statement, which is not what we want (that's just how switch statements work).
                case 1: 
                    seeDice();
                    continue;
                case 2:
                    rollAll();
                    continue;
                case 3:
                    rollOne();
                    continue;
                case 4:
                    createDie();
                    StdOut.println("Your new die has been added.");
                    continue;
                case 5:
                    deleteDie();
                    StdOut.println("The deed has been done.");
                    continue;
                case 6:
                    StdOut.println("It's been real. We will meet again.");
                    return;
                default: 
                    StdOut.println("Well, that makes no sense.");
            }
        }


    }

    private static void printChoices(){
        StdOut.println("1: See the current dice.");
        StdOut.println("2: Roll the dice!");
        StdOut.println("3: Roll a random die.");
        StdOut.println("4: Create a die.");
        StdOut.println("5: Delete a random die.");
        StdOut.println("6: End the game.");
    }

    private static void seeDice() {
        if(gameDice == null) {
            StdOut.println("Not gonna happen. No dice!");
            return;
        }
        for(int i = 0; i < gameDice.length; i++) {
            StdOut.println("Die #" + (i+1) + ":\n\t" + gameDice[i].toString());
        }
    }

    private static void rollAll(){
        if(gameDice == null) {
            StdOut.println("Not gonna happen. No dice!");
            return;
        }
        for(Die george : gameDice) {
            george.rollDie();
        }
    }

    private static void rollOne(){
        if(gameDice == null) {
            StdOut.println("Not gonna happen. No dice!");
            return;
        }
        int rand = (int) ((Math.random() * gameDice.length) + 1);
        gameDice[rand - 1].rollDie();
    }

    private static void createDie(){
        StdOut.println("How many sides?");
        int sides = StdIn.readInt();
        StdOut.print("What color?");
        String color = StdIn.readString().trim().toLowerCase();
        if (gameDice == null) {
            gameDice = new Die[1];
            gameDice[0] = new Die(sides, color);
            return;
        }
        Die[] newDice = new Die[gameDice.length+1];
        for(int i = 0; i < gameDice.length; i++) {
            newDice[i] = gameDice[i];
        }
        newDice[newDice.length - 1] = new Die(sides, color);
        gameDice = newDice;
    }

    private static void deleteDie() {
        if(gameDice == null || gameDice.length == 1){
            StdOut.println("It simply cannot be done!");
            return;
        }
        int rand = (int) ((Math.random() * gameDice.length) + 1);
        int countOne = 0;
        int countTwo = 0;
        Die[] newDice = new Die[gameDice.length - 1];
        while(countOne < gameDice.length) {
            if(countOne != rand) {
                newDice[countTwo] = gameDice[countOne];
                countOne++;
                countTwo++;
            }
            countOne++;
        }
        gameDice = newDice;
    }
}
