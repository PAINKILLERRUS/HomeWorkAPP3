package ru.geekbrains.homework;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
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

            //-----------------Задание 2
            PhoneBook PHB = new PhoneBook();
            PHB.add("Сергей","1234");
            PHB.add("Иван","2345");
            PHB.add("Олег","2346");
            PHB.add("Артем","2375");
            PHB.add("Юрий","8945");
            PHB.add("Иван","0967");
            PHB.add("Тимофей","7856");

            System.out.println("Иван: " + PHB.get("Иван"));
            System.out.println("Сергей: " + PHB.get("Сергей"));
        }
}



