package com.tobeto.demo.entities;

public class Employee extends User{
    private String position;
    public Employee() {}

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
