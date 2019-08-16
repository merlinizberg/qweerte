package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

class Main {
    public static void main(String[] args) {

        try {
            DecimalFormat df = new DecimalFormat("#.##");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            double rub, change, c;
            System.out.print("Введите количество рублей:   ");
            rub = Double.parseDouble(reader.readLine());
            System.out.print("Введите курс конверсии:   ");
            change = Double.parseDouble(reader.readLine());
            System.out.print(df.format(rub / change));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}