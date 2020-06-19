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
            System.out.print("from: ");
            from = scanner.nextInt();
            System.out.print("to: ");
            to = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("нелегально");
        }

        if (from == to) {
            System.out.println("Введите два разных числа");
            return;
        }

        if (from < to) {
            for (int i = from; i <= to; i++) {
                if (i <= 1) {
                    i = 2;
                }
                if (isPrime(i)) {
                   System.out.println(i + " ");
                }
            }
        }


        if (from > to) {
            if (to <= 1) {
                to = 2;
            }
            for (int i = from; i >= to; i--) {
                if (isPrime(i)) {
                    System.out.println(i + " ");
                }
            }
        }
    }

    public static boolean isPrime(int x) {
        if (x == 2 || x == 3) {
            return true;
        } else
        if (x % 2 == 0 || x % 3 == 0) {
            return false;
        }
        int i = 5;
        while (i*i <= x) {
            if (x % i == 0 || x % (i + 2) == 0) {
                return false;
            }
            i = i + 6;
        }
        return true;
    }
}
