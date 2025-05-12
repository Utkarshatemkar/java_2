
public class pattern_star8 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                if (i == 1 || i == 4 || j == 1 || j == 4) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        /*
         * ****
         * *
         * *
         */
        System.out.println("-------------------------------------------------------------");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 3 || j == 3) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        } /*
          *  
          *  
          *****
          *  
          *  
          */
        System.out.println("-------------------------------------------------------------");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 3 || j == 3) {
                    System.out.print("*");
                } else {
                    System.out.print("o");
                }
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------------------------");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == j) {
                    System.out.print("x");
                } else {
                    System.out.print("o");
                }
            }
            System.out.println();
        }
    }

}
