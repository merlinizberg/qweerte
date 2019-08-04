
package com.company;
import sun.security.util.Length;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число в строку");
        String s1 = scan.nextLine();
        System.out.println("число с типом данных string: " + s1);
        int x = Integer.parseInt(s1);
        System.out.println("число с типом данных int: " + x);
        double y = x;
        System.out.println("число с типом данных double: " + y);
    }
}