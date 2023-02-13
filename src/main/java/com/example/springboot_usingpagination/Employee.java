package com.example.springboot_usingpagination;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private long id;

    private String name;
    private String dept;


    public Employee(String name, String dept) {

    }
}
