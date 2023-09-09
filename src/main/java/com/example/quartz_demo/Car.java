package com.example.quartz_demo;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class Car {
    private String id;
    private String door;
    private String color;
    private String constructorName ;

    public Car() {
        this.id = UUID.randomUUID().toString();
        this.door = "door";
        this.color = "color";
    }

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
