package com.heeeun.designpattern.creational_patterns.abstractfactory.after;

import com.heeeun.designpattern.creational_patterns.factorymethod.after.Ship;
import com.heeeun.designpattern.creational_patterns.factorymethod.after.ShipFactory;

public class ShipInventory {

    public static void main(String[] args) {
        ShipFactory shipFactory = new WhiteshipFactory(new WhiteshipPartsFactory());
        Ship ship = shipFactory.createShip();
        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheel().getClass());
    }
}
