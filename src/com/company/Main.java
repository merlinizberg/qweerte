
package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите строку");
        String s = scan.nextLine();
        System.out.println("Вывод строки без проблеов");
        System.out.println(s.replaceAll("\\s+",""));
    }
}