import java.io.IOError;
import java.io.IOException;
import java.util.Scanner;

public class lab1 {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        int from = 0;
        int to = 99;
        System.out.println("Введите два целых числа ;)");
        try {
            from = scanner.nextInt();
            to = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("нелегально");
        }

        if (from < to) {
            for (int i = from; i <= to; i++) {
                if (i <= 0) {
                    i = 1;
                }
                if (isPrime(i)) {
                    System.out.println(i);
                }
            }
        }


        if (from > to) {
            if (to <= 0) {
                to = 1;
            }
            for (int i = to; i<= from; i--) {
                if (isPrime(i)) {
                    System.out.println(i);
                }
            }
        }
    }

    public static boolean isPrime(int x) {
        if (x == 1) {
            return false;
        }
        for (int i = 2; i<= x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
