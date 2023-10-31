package com.heeeun.designpattern.structural_patterns.composite;
//#endregion

// ex) jdbc
public class App {
    public static void main(String[] args){
        Item doranItem = new Item("도란", 450);
        Item healItem = new Item("힐", 50);

        Bag bag = new Bag();
        bag.add(doranItem);
        bag.add(healItem);

        Client heeeun = new Client();
        heeeun.printPrice(doranItem);

        // item > bag > client 계층구조!
        // client 에서 직접 item 의 가격을, bag 안에 들은 item 들의 가격의 합을 알 수 있다.
        heeeun.printPrice(bag);

        // System.out.println(bag.getPrice());
    }
}
