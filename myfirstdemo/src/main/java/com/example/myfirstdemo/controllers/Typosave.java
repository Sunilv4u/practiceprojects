package com.example.myfirstdemo.controllers;

import com.example.myfirstdemo.dto.Names;
import com.example.myfirstdemo.services.Typosaveservices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Typosave {

    @Autowired
    private Typosaveservices typosaveservices;

    @PostMapping("/saveNames")
    public void savetypos(@RequestBody Names names) {
        System.out.println("Inside saveNames method");
        typosaveservices.typosaves(names);
    }

    @GetMapping("/getNames")
    public Names getNames(){
        System.out.println("Inside GetNames method");
        return typosaveservices.getNames();
    }

}
