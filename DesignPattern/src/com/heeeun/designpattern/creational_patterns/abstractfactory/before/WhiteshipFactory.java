package com.heeeun.designpattern.creational_patterns.abstractfactory.before;

import com.heeeun.designpattern.creational_patterns.factorymethod.after.DefaultShipFactory;
import com.heeeun.designpattern.creational_patterns.factorymethod.after.Ship;
import com.heeeun.designpattern.creational_patterns.factorymethod.after.Whiteship;

public class WhiteshipFactory extends DefaultShipFactory {

    @Override
    public Ship createShip() {
        Ship ship = new Whiteship();
        ship.setAnchor(new WhiteAnchor());
        ship.setWheel(new WhiteWheel());
        return ship;
    }
}
