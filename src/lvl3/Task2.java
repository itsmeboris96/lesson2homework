package lvl3;

import java.util.Scanner;

/**
 * Напишите программу, которая запрашивает у пользователя
 * радиус круга (вещественное число) и печатает на консоль
 * периметр и площадь круга.
 * <p>
 * Test Data:
 * Radius = 7.5
 * <p>
 * Expected Output
 * Perimeter is = 47.12388980384689
 * Area is = 176.71458676442586
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите радиус круга ");
        double radius = scanner.nextDouble();
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Периметр круга равен " + perimeter);
        double area = Math.PI * radius * radius;
        System.out.println("Площадь круга равна " + area);
    }
}
