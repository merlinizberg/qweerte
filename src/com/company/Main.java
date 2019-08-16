package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число в двочичном формате: ");
        int input = in.nextInt();
        int i = bin2dec(String.valueOf(input));
        System.out.println(i);
    }
    public static int bin2dec(String binNumber) {
        int result = 0;
        for (int i = 0;  i < binNumber.length() ; i++) {
            result += Math.pow(2, i) * (binNumber.charAt(i) == '1' ? 1 : 0);
        }
        return result;
    }
}