package com.heeeun.designpattern.structural_patterns.decorator;

public class Milk extends Decorator {

    public Milk(Component component) {
        super(component); // super : 자식 클래스가 자신을 생성할 때 부모 클래스의 생성자를 불러 초기화 할때 사용 (Decorator 생성)
    }

    public String add() {
        return super.add() + " + milk";
    }
}