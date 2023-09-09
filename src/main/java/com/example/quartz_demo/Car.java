package com.example.quartz_demo;

import org.springframework.stereotype.Service;

@Service
public class Car {
    private String door;
    private String innerColor;

    public Car() {
        this.door = "door";
        this.innerColor = "color";
    }

    public String getDoor() {
        return door;
    }

    public void setDoor(String door) {
        this.door = door;
    }

    public String getInnerColor() {
        return innerColor;
    }

    public void setInnerColor(String innerColor) {
        this.innerColor = innerColor;
    }
}
