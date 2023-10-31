package com.heeeun.designpattern.creational_patterns.factorymethod;

public class ShapeFactory {
    // 팩토리 메소드 : 객체 생성 후 반환
    public Shape getShape(String shapeType) {
        if (shapeType.equals("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equals("SQUARE")) {
            return new Square();
        } else
            return null;
    }
}
