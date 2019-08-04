
package com.company;
import sun.security.util.Length;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первую строку");
        String s1 = scan.nextLine();
        System.out.println("Введите вторую строку");
        String s2 = scan.nextLine();
        if(s1.length() > s2.length()){
            System.out.println("Первая строка длиннее:" + s1);
        }else
            if(s1.length() < s2.length()){
            System.out.println("Вторая строка длиннее:" + s2);
        }else
            System.out.println("Обе строки равны");
    }
}