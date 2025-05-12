
import java.util.Scanner;

public class pattern_star9 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // 1. Increasing star pattern
        // Example for n = 5:
        // *
        // * *
        // * * *
        // * * * *
        // * * * * *
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        // 2. Right-aligned stars
        // Output:
        // *
        // **
        // ***
        // ****
        // *****
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // 3. Inverted Right-aligned Triangle
        // Output:
        // *****
        // ****
        // ***
        // **
        // *
        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // 4. All lines same number of stars but right-aligned
        // Output:
        // *****
        // *****
        // *****
        // *****
        // *****
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 5; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // 5. Again right-aligned decreasing stars (repetition of earlier pattern)
        // Output:
        // *****
        // ****
        // ***
        // **
        // *
        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
