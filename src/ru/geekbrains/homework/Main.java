package ru.geekbrains.homework;

import java.util.*;
import java.util.stream.Collectors;

public class Main{
    public static int countWords(ArrayList<String> list, String words) {
        return Collections.frequency(list, words);
    }
        public static void main (String[]args){
            ArrayList<String> list = new ArrayList<>(Arrays.asList("One", "Two", "Three", "Fore", "One", "Five",
                    "One", "Six", "Seven", "One"));
            System.out.println("Массив list:" + list);
            for (int i = 0; i < list.size(); i++) {
                if (countWords(list, list.get(i)) == 1) {
                    System.out.println("Уникальные слова:" + list.get(i));
                }
            }
            Map<String, Integer> Map = list.stream().collect(Collectors.toMap(e -> e, e -> 1, Integer::sum));
            Map.forEach((k, v) -> System.out.println("Слово: " + k + " встречается: " + v + " раз."));
        }
}



