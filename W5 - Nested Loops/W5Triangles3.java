package W5;
public class W5Triangles3 {

    public static void main(String[] args) {
        
        
        for(int i = 1; i <= 5; i++) {
            System.out.println();

            for(int j = 1; j <= 5; j++) {

                if(j < i)
                    System.out.print("\t");
                else
                    System.out.print(j + "\t");

            }

            
        }


    }
    
}
