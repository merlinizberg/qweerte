
package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        final int x = 4, y = 7, z = 18;
        int number;
        System.out.println("Введите значение: ");
        number = in.nextInt();
        switch (number) {
            case x:
                System.out.println("Данное значение имеется в константах");
                break;
            case y:
                System.out.println("Данное значение имеется в константах");
                break;
            case z:
                System.out.println("Данное значение имеется в константах");
                break;
            default:
                System.out.println("Такой константы нет!");
        }
    }
}
