
//#region import
import java.lang.reflect.Constructor;

import com.heeeun.GoF.DesignPattern._01_singleton.Settings;
import com.heeeun.GoF.DesignPattern._01_singleton.Settings2;
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
import com.heeeun.designpattern.observer.Applicants;
import com.heeeun.designpattern.observer.Karam;
import com.heeeun.designpattern.observer.Kildong;
import com.heeeun.designpattern.observer.Minsu;
import com.heeeun.designpattern.observer.Sfa;
import com.heeeun.designpattern.singleton.MyNote;
import com.heeeun.designpattern.templatemethod.Eunhee;
import com.heeeun.designpattern.templatemethod.Heeeun;
//#endregion

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
        Sfa sfa = new Sfa();
        Applicants kildong = new Kildong();
        Applicants minsu = new Minsu();
        Applicants karam = new Karam();

        sfa.Pass(karam);
        sfa.Pass(minsu);

        sfa.notifyApplicant("SFA 에 합격하셨습니다.");

        ///////////////////////////////////////////// 인프런 강의
        Settings settings = Settings.getInstanace();

        // 싱글턴 패턴을 깨트리는 방법1
        Constructor<Settings> constructor = Settings.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Settings settings1 = constructor.newInstance();

        // 서로 다른 setting를 바라볼 수 있음. -> 조심하자~
        System.out.println(settings == settings1);

        // ENUM 은 리플렉션이 안 먹히기 때문에 싱글턴 패턴 가능
        // 진정한 싱글턴 패턴 구현 가능
        // 직렬화 settings2, 역직렬화 settings22가 안전하게 가능하다
        // 그러나 상속을 쓸 수 없다.
        Settings2 settings2 = Settings2.INSTANCE;
        Settings2 settings22 = null;

        // Constructor<?>[] declaredConstructors =
        // Settings2.class.getDeclaredConstructors();
        // for (Constructor<?> constructor2 : declaredConstructors) {
        // constructor2.setAccessible(true);
        // settings22 = (Settings2) constructor2.newInstance("INSTANCE");
        // }

        // System.out.println(settings2 == settings22); // Cannot reflectively create
        // enum objects 에러 발생

        // 싱글턴 예시1
        // Runtime runtime = new Runtime();
        Runtime runtime = Runtime.getRuntime();

    }

    // 콘센트에 연결
    public static void connect(Volt110 volt110) {
        volt110.powerOn();
    }
}
