
package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int i;
        System.out.print("Введите длину массива:   ");
        i = in.nextInt();
        int arr1[] = new int[i];
        int arr2[] = new int[i];
        for (int x = 0; x < i; x++) {
            System.out.print("Введите значение массива в ячейке:  ");
            arr1[x] = in.nextInt();
        }
        for (int x = 0; x < i; x++) {
            arr2[x] = arr1[x] * 2;
            System.out.print(arr2[x] + " ");
        }

    }
}