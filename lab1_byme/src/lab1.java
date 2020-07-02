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
            if (isPrime(from)) {
                System.out.println(from);
            }
            return;
        }

        if (from > to) {
            int temp = to;
            to = from;
            from = temp;
        }

        if (from < 1) {
            from = 2;
        }

        for (int i = from; i <= to; i++) {
            if (isPrime(i)) {
                System.out.println(i + " ");
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
