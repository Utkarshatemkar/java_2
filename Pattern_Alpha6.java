public class Pattern_Alpha6 {
    public static void main(String[] args) {
        int n = 5;
        // Upper half
        for (int i = 1; i <= n; i++) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            char ch = 'A';
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

        // Lower half
        for (int i = n - 1; i >= 1; i--) {
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            char ch = 'A';
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}

/*
Output:
    A
   ABC
  ABCDE
 ABCDEFG
ABCDEFGHI
 ABCDEFG
  ABCDE
   ABC
    A
*/
