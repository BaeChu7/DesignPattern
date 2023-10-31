package com.heeeun.designpattern.structural_patterns.decorator;

public class Decorator implements Component {

    // Component 를 가지고 있어야 함. 생성자로 주입
    private Component component;

    public Decorator(Component components) {
        this.component = components;
    }

    @Override
    public String add() {
        return component.add();
    }
}