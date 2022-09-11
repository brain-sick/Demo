package com.example.demo.resource;

import org.springframework.stereotype.Component;

import java.util.concurrent.ConcurrentHashMap;

@Component
public class GlobalMap {
    private final ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
    public void addElement(String key, Integer value) {
        map.put(key, value);
    }
    public int getElement(String key){
        if(map.containsKey(key)) {
            return map.get(key);
        }
        System.out.printf("Key %s doesn't exists%n", key);
        return 0;
    }
}
