public class Pattern_Num8 {
    public static void main(String[] args) {
        int n = 5;
        // Reverse number pyramid
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = n; k >= i; k--) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}

/*
Output:
5 4 3 2 1 
 4 3 2 1 
  3 2 1 
   2 1 
    1
*/
