
public class pattern_star5 {

    public static void main(String[] args) {
        for (int i = 2; i <= 6; i++) {
            for (int j = 2; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 5; k >= i; k--) {
                System.out.print("*");
            }
            for (int p = 4; p >= i; p--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i = 1; i < 6; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 3; k <= i; k++) {
                System.out.print("*");
            }
            for (int p = 2; p <= i; p++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
