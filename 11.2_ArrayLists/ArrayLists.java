import java.util.ArrayList;

public class ArrayLists {

    public static void main(String[] args) {

        ArrayList<String> shows = new ArrayList<String>();

        shows.add("Breaking Bad");
        shows.add("Stranger Things");

        System.out.println("shows = " + shows);


        shows.set(0, "The Walking Dead");

        System.out.println("shows = " + shows);
        System.out.println("size = " + shows.size());

        shows.add("Unbreakable Kimmy Schmidt");
        System.out.println("shows = " + shows);
        System.out.println("size = " + shows.size());


        
    }




    
}
