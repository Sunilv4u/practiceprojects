package com.example.myfirstdemo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
@Entity
@Data
public class Names {
    @Id
    private String names;
}
