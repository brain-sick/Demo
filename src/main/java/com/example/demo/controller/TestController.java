package com.example.demo.controller;

import com.example.demo.resource.GlobalMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/")
public class TestController {
    GlobalMap map;

    @Autowired
    public TestController(GlobalMap map) {
        this.map = map;
    }

    @GetMapping("/test")
    public void processRequest(@RequestParam("name") String name){
        String id = UUID.randomUUID().toString();
        System.out.printf("request id = %s", id);
        map.addElement(id, name);
    }
}
