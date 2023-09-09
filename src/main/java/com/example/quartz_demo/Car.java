package com.example.quartz_demo;

import org.springframework.stereotype.Service;

@Service
public class Car {
    private String door;
    private String color;

    public Car() {
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
