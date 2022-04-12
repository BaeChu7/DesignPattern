package Decorator;

public class Water extends Decorator{

    public Water(Component component){
        super(component); // super : 자식 클래스가 자신을 생성할 때 부모 클래스의 생성자를 불러 초기화 할때 사용 (Decorator 생성)
    }

    @Override
    public String add(){
        return super.add() + " + water";
    }
}