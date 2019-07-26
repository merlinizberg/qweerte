
package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter some number: ");
        int input = in.nextInt();
        System.out.println("Hello, world!");
        int i = bin2dec(String.valueOf(input));
        System.out.println(i);
        System.out.println("Проверка правильности " + Integer.toBinaryString(bin2dec(String.valueOf(input))) + "=" + bin2dec(String.valueOf(input)) );
    }
    public static int bin2dec(String binNumber) {
        int result = 0;

        for (int i = 0; i < binNumber.length(); i++) {

            result += Math.pow(2, i) * (binNumber.charAt(i) == '1' ? 1 : 0);

        }
        return result;
    }
}
