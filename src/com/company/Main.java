package com.company;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
class Main {
    public static void main(String[] args) {

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            double rub, change, c;
            System.out.print("Введите количество рублей:   ");
            String rStr = reader.readLine();
            rStr = rStr.replace(",", ".");
            rub = Double.parseDouble(rStr);
            System.out.print("Введите курс конверсии:   ");
            String cStr = reader.readLine();
            cStr = cStr.replace(",", ".");
            change = Double.parseDouble(cStr);
            DecimalFormat df = new DecimalFormat("#.##");
            System.out.print(df.format(rub / change));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}