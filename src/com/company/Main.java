
package com.company;
import java.io.*;


class Main {
    public static void main(String[] args) {
        String s, s1;
        int count = 0;
        int count2 = 0;
        try(BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
            while ((s = br.readLine()) != null) {
                System.out.println(s);
                count++;
            }
        } catch (IOException exc){
            System.out.println("Ошибка ввода/вывода: " + exc);
        }
        BufferedReader br1 =
                new BufferedReader(
                        new InputStreamReader(System.in));
        try(FileWriter fw = new FileWriter("test.txt"))
        {
            while (count2 != count) {
                count2++;
                System.out.print(": ");
                s1 = br1.readLine();

                s1 = s1 + "\r\n";
                fw.write(s1);
            }
        } catch (IOException exc){
            System.out.println("Ошибка ввода/вывода: " + exc);
        }
    }
}