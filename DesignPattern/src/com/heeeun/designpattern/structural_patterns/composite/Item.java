package com.heeeun.designpattern.structural_patterns.composite;

// leaf 
public class Item implements Component{
    private String name;
    private int price;

    public Item(String name, int price){
        this.name = name;
        this.price = price;
    }
    
    @Override
    public int getPrice() {
        return this.price;
    }
}
