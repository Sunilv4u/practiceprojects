package com.example.myfirstdemo.services;

import com.example.myfirstdemo.dao.Typosavedao;
import com.example.myfirstdemo.dto.Names;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Typosaveservices {

    @Autowired
    private Typosavedao typosavedao;

    public void typosaves(Names names) {
        com.example.myfirstdemo.entities.Names names1 = new com.example.myfirstdemo.entities.Names();
        names1.setNames(names.getNames());
        typosavedao.save(names1);
    }

    public Names getNames() {
       List<com.example.myfirstdemo.entities.Names> names = (List<com.example.myfirstdemo.entities.Names>) typosavedao.findAll();
       com.example.myfirstdemo.entities.Names name = names.get(0);

       Names namesDto = new Names();
       namesDto.setNames(name.getNames());
       return namesDto;
    }
}
