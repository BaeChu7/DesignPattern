import com.heeeun.designpattern.adapter.Adapter;
import com.heeeun.designpattern.adapter.AirConditioner;
import com.heeeun.designpattern.adapter.HairDryer;
import com.heeeun.designpattern.adapter.Volt110;
import com.heeeun.designpattern.decorator.BaseComponent;
import com.heeeun.designpattern.decorator.Component;
import com.heeeun.designpattern.decorator.Milk;
import com.heeeun.designpattern.decorator.Water;
import com.heeeun.designpattern.factorymethod.Shape;
import com.heeeun.designpattern.factorymethod.ShapeFactory;
import com.heeeun.designpattern.singleton.MyNote;
import com.heeeun.designpattern.templatemethod.Eunhee;
import com.heeeun.designpattern.templatemethod.Heeeun;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("//////////////////////////////////////////////////////// 1-1 Factory Method Test");
        // 팩토리 클래스에서 객체 생성 후 반환
        ShapeFactory shapeFactory = new ShapeFactory();

        // Circle 메소드 호출
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();

        // Square 메소드 호출
        Shape square = shapeFactory.getShape("SQUARE");
        square.draw();

        System.out.println("//////////////////////////////////////////////////////// 1-2 Singleton Test");
        MyNote instance = MyNote.getInstance("Heeeun is occupying the note...");
        MyNote instance2 = MyNote.getInstance("Eunhee is occupying the note...");
        instance.printMsg();
        instance2.printMsg();

        System.out.println("//////////////////////////////////////////////////////// 2-1 Adapter Test");
        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);

        AirConditioner airConditioner = new AirConditioner();
        // connect(airConditioner);
        Volt110 airConditioner110 = new Adapter(airConditioner);
        connect(airConditioner110);

        System.out.println("//////////////////////////////////////////////////////// 2-2 Decorator Test");
        Component espresso = new BaseComponent();
        System.out.println("Espresso's recipes : " + espresso.add());

        Component americano = new Water(new BaseComponent()); // Decorator 생성자 -> Water 생성자
        System.out.println("Americano's recipes : " + americano.add()); // BaseComponent add -> Decorator add -> Water
                                                                        // add

        Component latte = new Milk(new Water(new BaseComponent()));
        System.out.println("Latte's recipes : " + latte.add());

        System.out.println("//////////////////////////////////////////////////////// 3-1 Template Method Test");
        Heeeun heeeun = new Heeeun();
        heeeun.Alive();
        Eunhee heeeun2 = new Eunhee();
        heeeun2.Alive();

        System.out.println("//////////////////////////////////////////////////////// 3-2 Observer Test");

    }

    // 콘센트에 연결
    public static void connect(Volt110 volt110) {
        volt110.powerOn();
    }
}
