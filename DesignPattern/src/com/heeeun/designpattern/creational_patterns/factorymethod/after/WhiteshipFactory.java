package com.heeeun.designpattern.creational_patterns.factorymethod.after;

public class WhiteshipFactory extends DefaultShipFactory {

    @Override
    public Ship createShip() {
        return new Whiteship();
    }
}
