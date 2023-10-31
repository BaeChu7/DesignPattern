
//#region import
import java.lang.reflect.Constructor;

import com.heeeun.designpattern.behavioral_patterns.observer.Applicants;
import com.heeeun.designpattern.behavioral_patterns.observer.Karam;
import com.heeeun.designpattern.behavioral_patterns.observer.Kildong;
import com.heeeun.designpattern.behavioral_patterns.observer.Minsu;
import com.heeeun.designpattern.behavioral_patterns.observer.Sfa;
import com.heeeun.designpattern.behavioral_patterns.templatemethod.Eunhee;
import com.heeeun.designpattern.behavioral_patterns.templatemethod.Heeeun;
import com.heeeun.designpattern.creational_patterns.factorymethod.Shape;
import com.heeeun.designpattern.creational_patterns.factorymethod.ShapeFactory;
import com.heeeun.designpattern.creational_patterns.singleton.MyNote;
import com.heeeun.designpattern.structural_patterns.adapter.Adapter;
import com.heeeun.designpattern.structural_patterns.adapter.AirConditioner;
import com.heeeun.designpattern.structural_patterns.adapter.HairDryer;
import com.heeeun.designpattern.structural_patterns.adapter.Volt110;
import com.heeeun.designpattern.structural_patterns.decorator.BaseComponent;
import com.heeeun.designpattern.structural_patterns.decorator.Component;
import com.heeeun.designpattern.structural_patterns.decorator.Milk;
import com.heeeun.designpattern.structural_patterns.decorator.Water;

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
                           
        Component latte = new Milk(americano);
        System.out.println("Latte's recipes : " + latte.add());

        System.out.println("//////////////////////////////////////////////////////// 3-1 Template Method Test");
        Heeeun heeeun = new Heeeun();
        heeeun.Alive();
        Eunhee heeeun2 = new Eunhee();
        heeeun2.Alive();

        System.out.println("//////////////////////////////////////////////////////// 3-2 Observer Test");
        Sfa sfa = new Sfa();
        Applicants kildong = new Kildong();
        Applicants minsu = new Minsu();
        Applicants karam = new Karam();

        sfa.Pass(kildong);
        sfa.Pass(minsu);

        sfa.notifyApplicant("SFA 에 합격하셨습니다.");

    }

    // 콘센트에 연결
    public static void connect(Volt110 volt110) {
        volt110.powerOn();
    }
}
