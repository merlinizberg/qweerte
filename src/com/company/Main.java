package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int i;
        System.out.print("Введите длину массива:   ");
        i = in.nextInt();
        int arr1[] = new int[i];
        for (int x = 0; x < i; x++) {
            System.out.print("Введите значение массива в ячейке:  ");
            arr1[x] = in.nextInt();
        }
        for(int x = arr1.length-1 ; x > 0 ; x--){
            for(int j = 0 ; j < x ; j++) {
                if (arr1[j] > arr1[j + 1]) {
                    int tmp = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = tmp;
                }
            }
        }
        for (int x = 0; x < i; x++) {
            System.out.print(arr1[x] + " ");
        }
    }
}