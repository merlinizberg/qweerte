
package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int x = 4, y = 7, z = 18, number;
        System.out.println("Введите значение: ");
        number = in.nextInt();
        if (number == x)
        {
            System.out.println("Данное значение имеется в константах");
        }
        else
            if (number == y)
        {
            System.out.println("Данное значение имеется в константах");
        }else
            if (number == z)
        {
            System.out.println("Данное значение имеется в константах");
        }else

            System.out.println("Такой константы нет!");
    }
}
