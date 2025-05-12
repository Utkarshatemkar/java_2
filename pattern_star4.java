
import java.util.*;

public class pattern_star4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] number = new int[size];
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }
        boolean isacending = true;
        for (int i = 0; i < number.length - 1; i++) {
            if (number[i] > number[i + 1]) {
                isacending = false;
            }
        }
        if (isacending) {
            System.out.print("acending order");
        } else {
            System.out.println("decending order");
        }
    }
}
