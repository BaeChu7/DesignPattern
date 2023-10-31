package com.heeeun.designpattern.structural_patterns.decorator.decorator2.after;

public class BaseComponent implements Component{
    @Override
    public void addComment(String comment){
        System.out.println(comment);
    }
}