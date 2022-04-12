package com.heeeun.designpattern.decorator;

public class BaseComponent implements Component{
    @Override
    public String add(){
        return "espresso";
    }
}