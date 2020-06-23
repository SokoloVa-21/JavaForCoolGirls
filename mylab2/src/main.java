import shapes.Dot;
import shapes.Triangle;
import shapes.Circle;
import shapes.Rectangle;
import shapes.Shape;

import java.awt.*;
import java.util.concurrent.ThreadLocalRandom;

public class main {

    private static int randInt(int lower, int bound)
    {
        return ThreadLocalRandom.current().nextInt(lower, bound);
    }

    public static void main(String[] args) {

        Shape[] shapes = new Shape[10];

        for (int i = 0; i < 10; i++) {
            int n = (int) (Math.random()*3);
            switch(n) {
                case 0: {
                    Dot center = new Dot (randInt(-20, 20), randInt(-20, 20));
                    shapes[i] = new Circle(center, randInt(1, 20));
                }
                break;

                case 1: {
                    Dot dot1 = new Dot(randInt(-20, 20), randInt(-20, 20));
                    Dot dot2 = new Dot(randInt(-20, 20), randInt(-20, 20));
                    Dot dot3 = new Dot(randInt(-20, 20), randInt(-20, 20));
                    shapes[i] = new Triangle(new Dot[] {dot1, dot2, dot3}, randInt(0, 360));
                }
                break;

                case 2: {
                    shapes[i] = new Rectangle(randInt(0, 33), randInt(0, 33), randInt(0, 360));
                }
                break;

                default :
                    System.out.println("Smt wrong");
            }

        }

        for (Shape shape : shapes) {
            shape.printShape();
        };

        System.out.println("Shape(s) with max area: ");

        float maxArea = MaxArea(shapes);
        for (Shape shape : shapes) {
            if (shape.getArea() == maxArea) {
                shape.printShape();
            }
        }
        
        /*
         * TODO: Выполнить действия над массивом 'shapes'
         *
         * 1. Проинициализировать переменную 'shapes' массивом
         *    содержащим 10 произвольных фигур. Массив должен
         *    содержать экземпляры классов Circle, Rectangle
         *    и Triangle.
         *
         * 2. Найти в массиве 'shapes' фигуру с максимальной
         *    площадью. Для поиска фигуры необходимо создать
         *    статический метод в текущем классе (Main).
         */
    }

    public static float MaxArea (Shape[] shapes) {
        float maxArea = shapes[0].getArea();

        for (Shape shape : shapes) {
            if (shape.getArea() > maxArea) {
                maxArea = shape.getArea();
            }
        }

        return maxArea;
    }
}
