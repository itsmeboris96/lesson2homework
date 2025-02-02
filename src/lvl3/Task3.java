package lvl3;
import java.util.Scanner;
/**
 * Напишите программу, которая запрашивает у пользователя
 * три целых числа и выводит их среднее арифметическое
 * (складывает все числа и делит на их количество).
 *
 * Примечание: обратите внимание, что результат может быть дробным числом.
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int numOne = scanner.nextInt();
        System.out.println("Enter second number");
        int numTwo = scanner.nextInt();
        System.out.println("Enter third number");
        int numThree = scanner.nextInt();
        double result = (double) (numOne + numTwo + numThree) / 3;
        System.out.println("Result " + result);
    }
}
