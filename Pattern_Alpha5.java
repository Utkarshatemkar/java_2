public class Pattern_Alpha5 {
    public static void main(String[] args) {
        int n = 5;
        // Inverted pyramid
        for (int i = n; i >= 1; i--) {
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
 * Output:
 * ABCDEFGHI
 * ABCDEFG
 * ABCDE
 * ABC
 * A
 */
