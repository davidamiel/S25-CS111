public class Triangles {

    public static void main(String[] args) {
        
        // Triangles 1
        for(int i = 1; i <= 5; i++) {
            System.out.println();
            for(int j = 1; j <= i; j++) {
                System.out.print(i + "\t");
            }
        }

        // Triangles 2
        for(int i = 1; i <= 5; i++) {
            System.out.println();
            for(int j = i; j <= 5; j++)
                System.out.print(j + "\t");  
        }


        // Triangles 3
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
