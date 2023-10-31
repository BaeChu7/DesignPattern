package com.heeeun.designpattern.structural_patterns.decorator.decorator2.after;

public class Client {
    private Component component;

    public Client(Component component){
        this.component = component;
    }

    public void writeComment(String comment){
        component.addComment(comment);
    }
}
