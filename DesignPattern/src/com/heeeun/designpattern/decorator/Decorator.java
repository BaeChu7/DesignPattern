package com.heeeun.designpattern.decorator;

public class Decorator implements Component {

    private Component component;

    public Decorator(Component components) {
        this.component = components;
    }

    @Override
    public String add() {
        return component.add();
    }
}