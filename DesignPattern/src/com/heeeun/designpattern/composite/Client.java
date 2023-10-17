package com.heeeun.designpattern.composite;

public class Client{
    // 새로운 종류의 component 가 생기더라도 client 의 코드는 바뀌지 않는다.
    // open closed transfer? 특징
    // 음.. Component 가 bag 이냐 item 이냐 알아야 하는 타입의 종속이 필요한 경우라면 
    // 안쓰는 것이 좋다.
    public void printPrice(Component component){
        System.out.println(component.getPrice());
    }
}
