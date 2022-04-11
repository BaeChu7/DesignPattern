import FactoryMethod.Shape;
import FactoryMethod.ShapeFactory;

public class App {
    public static void main(String[] args) throws Exception {
        //////////////////////////////////////////////////////// 1-1 Factory Method Test
        // 팩토리 클래스에서 객체 생성 후 반환
        ShapeFactory shapeFactory = new ShapeFactory();

        // Circle 메소드 호출
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();

        // Square 메소드 호출
        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();

        //////////////////////////////////////////////////////// 1-2 Singleton Test
    }
}
