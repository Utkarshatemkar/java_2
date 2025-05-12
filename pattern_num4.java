public class  pattern_num4{
    public static void main(String[] args) {
        int n = 5;
        // Pyramid of numbers
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}

/*
Output:
    1 
   1 2 
  1 2 3 
 1 2 3 4 
1 2 3 4 5
*/
