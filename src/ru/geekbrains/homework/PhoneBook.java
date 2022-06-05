package ru.geekbrains.homework;

import java.util.*;

public class PhoneBook {
    private HashMap<String,List<String>> phones = new HashMap<>();

    public void add(String name, String phone) {
        if (!phones.containsKey(name))
            phones.put(name, new ArrayList<>());

        phones.get(name).add(phone);
    }

    public List<String> get(String name) {
        return phones.get(name);
    }
}
