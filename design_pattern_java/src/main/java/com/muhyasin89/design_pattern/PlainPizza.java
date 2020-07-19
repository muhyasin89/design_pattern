package com.muhyasin89.design_pattern;

public class PlainPizza implements Pizza {
    
    @Override
    public String getDescription(){
        return "Thin Dough";
    }

    @Override
    public double getCost(){
        return 0;
    }

}