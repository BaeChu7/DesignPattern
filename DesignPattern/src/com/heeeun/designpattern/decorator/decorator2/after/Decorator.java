package com.heeeun.designpattern.decorator.decorator2.after;

public class Decorator implements Component {

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void addComment(String comment) {
        component.addComment(comment);
    }
}