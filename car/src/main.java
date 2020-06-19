import java.util.Scanner;
import java.io.IOError;
import java.io.IOException;

public class main {
    public static void main(String[] args) {
        car MyCar = new car();

        Scanner scanner = new Scanner(System.in);
        String way = "";
        int quantity = 99;
        System.out.println("Кудым двигаемся???");
        try {
            System.out.print("куда ");
            way = scanner.nextLine();
            System.out.print("на сколько ");
            quantity = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("нелегально");
        }

        if (way == "forward") {
            MyCar.x = MyCar.x + quantity;
            System.out.println(MyCar.x + " " + MyCar.y);
        }

        if (way == "back") {
            MyCar.x = MyCar.x - quantity;
            System.out.println(MyCar.x + " " + MyCar.y);
        }

        if (way == "right") {
            MyCar.x = MyCar.y + quantity;
            System.out.println(MyCar.x + " " + MyCar.y);
        }

        if (way == "left") {
            MyCar.x = MyCar.y - quantity;
            System.out.println(MyCar.x + " " + MyCar.y);
        }
    }
}
