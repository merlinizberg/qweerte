
package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int x, y, z, aver;
        System.out.println("Введите Х: ");
        x = in.nextInt();
        System.out.println("Введите Y: ");
        y = in.nextInt();
        System.out.println("Введите Z: ");
        z = in.nextInt();
        aver = (x + y + z)/3;
        System.out.println("Среднее арифметическое XYZ =  " + aver);
        aver /= 2;
        System.out.println("Среднее арифметическое XYZ проверка =  " + aver);
        if (aver > 3)
        {
            System.out.println("Программа выполнена корректно");
        }
    }
}
