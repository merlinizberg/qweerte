package com.company;
import java.util.*;
import java.io.*;
import java.time.*;

public class Main {

    public static void main(String[] args) {
        List<Jsonclass> JsonCollection = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        //System.out.print("Введите название файла(с расширением) или адрес файла: ");

        //String name = in.nextLine();
        try(FileInputStream file= new FileInputStream("com/company/test.json")) {
            System.out.println(file.available());
            int i=-1;
            while((i=file.read())!=-1){
                System.out.print((char)i);

            }

        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}