package com.heeeun.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Bag implements Component{
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
