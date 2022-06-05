package ru.geekbrains.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PhoneBook {
    private  String name;
    private  String phone;

    public static void main(String[] args) {
        HashMap<String,String> Map1 = new HashMap<>();
        Map1.put("Иванов","2345");
        Map1.put("Сидоров","1334");
        Map1.put("Алексеев","1245");
        Map1.put("Сергеев","7890");
        Map1.put("Антипов","1122");
        Map1.put("Егоров","3456");
        Map1.put("Титов","8990");
        Map1.put("Федин","1120");
        Map1.put("Ильин","4587");
        Map1.put("Пушкин","0198");
        System.out.println(Map1);
        PhoneBook PHB = new PhoneBook();
        PHB.add("Ivan","2345");

    }
    HashMap<String,String> Map1 = new HashMap<>();

    public void add(String name, String phone) {
       this.name = name;
       this.phone = phone;
        System.out.println(name + "|" + phone);
    }

    public List<String> get(String name) {
        return null;
    }
}
