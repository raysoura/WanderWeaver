package com.org.WanderWeaver.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class User {

    @GeneratedValue
    @Id
    private int id;

    private String name;

    private String email;

    private String phone;
}
