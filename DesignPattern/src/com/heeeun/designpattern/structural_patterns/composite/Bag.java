package com.heeeun.designpattern.structural_patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Bag implements Component{
    // Item 처럼 Component 를 상속받음으로써 같은 계층처럼 작성해준다.
    private List<Component> components = new ArrayList<>();

    public void add(Component component)
    {
        components.add(component);
    }
    
    public List<Component> getComponents(){
        return components;
    }

    @Override
    public int getPrice() {
        return components.stream().mapToInt(Component::getPrice).sum(); // 가격 갖고 오는 것을 component 에 위임
    }
}
