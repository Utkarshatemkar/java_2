public class Pattern_Num7 {
    public static void main(String[] args) {
        int n = 5;
        // Right-aligned inverted triangle of numbers
        for (int i = n; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {
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
