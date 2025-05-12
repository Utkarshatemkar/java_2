
public class pattern_num5 {
    public static void main(String[] args) {
        int n = 5;
        // Inverted pyramid of numbers
        for (int i = n; i >= 1; i--) {
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
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1
*/
