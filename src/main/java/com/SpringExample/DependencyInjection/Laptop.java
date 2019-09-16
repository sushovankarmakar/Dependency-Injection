package com.SpringExample.DependencyInjection;

import org.springframework.stereotype.Component;

@Component("lap1")
public class Laptop {
    private int lid;
    private String brandName;

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String lBrandName) {
        this.brandName = lBrandName;
    }

    @Override
    public String toString() {
        return "Laptop [lid=" + lid +", brand = "+ brandName+"]";
    }

    public void compile(){
        System.out.println("Compiling");
    }
}
