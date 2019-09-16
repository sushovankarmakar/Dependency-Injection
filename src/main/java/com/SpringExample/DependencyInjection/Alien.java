package com.SpringExample.DependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Alien {
    private int aid;
    private String aName;
    private String tech;

    @Autowired
    @Qualifier("lap1")
    private Laptop laptop;

    public Alien(){
        System.out.println("Object created");
    }

    public int getAid() { return aid; }

    public void setAid(int aid) { this.aid = aid; }

    public String getName() { return aName; }

    public void setName(String aName) { this.aName = aName; }

    public String getTech() { return tech; }

    public void setTech(String tech) { this.tech = tech; }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void show(){
        System.out.println("Alien here");
        laptop.compile();
    }
}
