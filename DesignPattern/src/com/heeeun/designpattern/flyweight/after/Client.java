package com.heeeun.designpattern.flyweight.after;

public class Client {
// 아래와 같이 인스턴스를 많이 만드는 경우에 메모리 성능을 개선하기 위해 많이 사용하는 패턴
    public static void main(String[] args) {
        FontFactory fontFactory = new FontFactory();

        // 동일한 인스턴스로 폰트를 생성 가능
        Character c1 = new Character('h', "white", fontFactory.getFont("nanum:12"));
        Character c2 = new Character('e', "white", fontFactory.getFont("nanum:12"));
        Character c3 = new Character('l', "white", fontFactory.getFont("nanum:12"));
    }
}