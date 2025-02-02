package lvl3;

import java.util.Scanner;
/**
 * Напишите программу, которая запрашивает у пользователя целое число
 * и печатает на консоль таблицу умножения.
 *
 * Test Data:
 * Input a number: 8
 *
 * Expected Output :
 * 8 x 1 = 8
 * 8 x 2 = 16
 * 8 x 3 = 24
 * ...
 * 8 x 10 = 80
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a number ");
        int number = scanner.nextInt();
        System.out.println("Input number is " + number);
        // Прямой подход
       /* System.out.println(number + " x 1 = " + number*1);
        System.out.println(number + " x 2 = " + number*2);
        System.out.println(number + " x 3 = " + number*3);
        System.out.println(number + " x 4 = " + number*4);
        System.out.println(number + " x 5 = " + number*5);
        System.out.println(number + " x 6 = " + number*6);
        System.out.println(number + " x 7 = " + number*7);
        System.out.println(number + " x 8 = " + number*8);
        System.out.println(number + " x 9 = " + number*9);
        System.out.println(number + " x 10 = " + number*10);*/
        // Через цикл
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + i*number);
        }
    }
}
