package com.heeeun.designpattern.creational_patterns.factorymethod.after;

public class BlackshipFactory extends DefaultShipFactory {
    @Override
    public Ship createShip() {
        return new Blackship();
    }
}
