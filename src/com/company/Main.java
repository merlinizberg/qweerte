
package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int i, j;
        System.out.print("Введите длину массива:   ");
        i = in.nextInt();
        System.out.print("Введите ширину массива:   ");
        j = in.nextInt();
        int arr1[][] = new int[i][j];
        int arr2[][] = new int[i][j];
        for (int y = 0; y < i; y++) {
            for (int x = 0; x < j; x++) {
                System.out.print("Введите значение массива в ячейке:  ");
                arr1[x][y] = in.nextInt();
            }
        }
        for (int y = 0; y < i; y++) {
            for (int x = 0; x < j; x++) {
                arr2[x][y] = arr1[x][y] * 3;
                System.out.print(arr2[x][y] + " ");
            }
        }
    }
}