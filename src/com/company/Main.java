package com.company;
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите название файла(с расширением) или адрес файла: ");
            String name = in.nextLine();
            Scanner scanner = new Scanner(new File(name));
            Map<String, Integer> statistics = new HashMap<>();
            Set<String> words = new TreeSet<>();
            while (scanner.hasNext()) {
                String word = scanner.useDelimiter("[\\W]+").next();
                words.add(word);
                Integer count = statistics.get(word);
                if (count == null) {
                    count = 0;
                }
                statistics.put(word, ++count);
            }
            System.out.println("Отсортировано: " + words);
            System.out.println("Статистика: " + statistics);
            Iterator it = statistics.entrySet().iterator();
            int max = 0;
            while (it.hasNext()) {
                Map.Entry pair = (Map.Entry) it.next();
                if ((int) pair.getValue() > max) {
                    max = (int) pair.getValue();
                }
            }
            it = statistics.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry pair = (Map.Entry) it.next();
                if ((int) pair.getValue() == max) {
                    System.out.println("Слово с самой большой частотой: " + pair.getKey() + " С частотой= " + max);
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}