package com.example.demo.resource;

import org.springframework.stereotype.Component;

import java.util.concurrent.ConcurrentHashMap;

@Component
public class GlobalMap {
    private final ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
    public void addElement(String key, String value) {
        map.put(key, value);
    }
    public String getElement(String key){
        if(map.containsKey(key)) {
            return map.get(key);
        }
        System.out.printf("Key %s doesn't exists%n", key);
        return "not found";
    }
}
