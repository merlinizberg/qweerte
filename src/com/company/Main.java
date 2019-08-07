
package com.company;
import java.io.*;

public class Main {
    public static void main(String[] args) {
     String s, s1;
        try(BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch (IOException exc){
            System.out.println("Ошибка ввода/вывода: " + exc);
        }
        BufferedReader br1 =
                new BufferedReader(
                        new InputStreamReader(System.in));
        System.out.println("Признак конца строки 'stop' ");
    try(FileWriter fw = new FileWriter("test.txt"))
    {
        do{
            System.out.print(": ");
            s1 = br1.readLine();

            if(s1.compareTo("stop") == 0) break;

            s1 = s1 +"\r\n";
            fw.write(s1);
        } while (s1.compareTo("stop") != 0);
    } catch (IOException exc){
        System.out.println("Ошибка ввода/вывода: " + exc);
    }
    }
}