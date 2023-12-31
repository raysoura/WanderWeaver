package com.org.WanderWeaver.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Stay {

    @GeneratedValue
    @Id
    private int id;

    private String name;

    private String link;

    private int rating;

    private String review;
}
