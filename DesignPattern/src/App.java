import Adapter.Adapter;
import Adapter.AirConditioner;
import Adapter.HairDryer;
import Adapter.Volt110;
import Decorator.BaseComponent;
import Decorator.Component;
import Decorator.Milk;
import Decorator.Water;
import FactoryMethod.Shape;
import FactoryMethod.ShapeFactory;
import Singleton.MyNote;

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
        MyNote instance = MyNote.getInstance("Heeeun is occupying the note...");
        MyNote instance2 = MyNote.getInstance("Heeeun2 is occupying the note...");
        instance.printMsg();
        instance2.printMsg();

        /////////////////////////////////////////////////////// 2-1 Adapter Test
        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);

        AirConditioner airConditioner = new AirConditioner();
        // connect(airConditioner);
        Volt110 airConditioner110 = new Adapter(airConditioner);
        connect(airConditioner110);
        
        /////////////////////////////////////////////////////// 2-2 Decorator Test
        Component espresso = new BaseComponent();
        System.out.println("Espresso's recipes : " + espresso.add());

        Component americano = new Water(new BaseComponent()); // Decorator 생성자 -> Water 생성자
        System.out.println("Americano's recipes : " + americano.add()); // BaseComponent add -> Decorator add -> Water add
        
        Component latte = new Milk(new Water(new BaseComponent()));
        System.out.println("Latte's recipes : " + latte.add());
    }

    // 콘센트에 연결
    public static void connect(Volt110 volt110) {
        volt110.powerOn();
    }
}
