package com.org.WanderWeaver.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Cafe {

    @GeneratedValue
    @Id
    private int id;
}
