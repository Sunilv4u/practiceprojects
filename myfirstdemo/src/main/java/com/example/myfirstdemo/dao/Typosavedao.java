package com.example.myfirstdemo.dao;


import com.example.myfirstdemo.entities.Names;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Typosavedao extends CrudRepository<Names,String>{

}
