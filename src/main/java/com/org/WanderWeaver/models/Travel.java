package com.org.WanderWeaver.models;

import com.org.WanderWeaver.constants.CarType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Travel {

    @GeneratedValue
    @Id
    private int id;

    private String name;

    private String contact;

    private CarType carType;

    private String link;

    private int rating;

    private String review;
}
