package lvl2;

import java.util.Scanner;
/**
 * Написать консольную программу, которая запрашивает
 * имя пользователя и выводит на консоль текст:
 *
 * Hello имя пользователя!
 */
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:  ");
        String userName = scanner.next();
        System.out.println("Hello " + userName + "!");
    }
}
