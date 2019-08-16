package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) {

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            double rub, change, c;
            System.out.print("Введите количество рублей:   ");
            rub = Double.parseDouble(reader.readLine());
            System.out.print("Введите курс конверсии:   ");
            change = Double.parseDouble(reader.readLine());
            System.out.print(rub / change);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //System.out.print("Доллар:   " + Math.round((rub / change) * 100.0) / 100.0);
    }
}