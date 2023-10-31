package com.heeeun.designpattern.creational_patterns.abstractfactory.after;

import com.heeeun.designpattern.creational_patterns.factorymethod.after.DefaultShipFactory;
import com.heeeun.designpattern.creational_patterns.factorymethod.after.Ship;
import com.heeeun.designpattern.creational_patterns.factorymethod.after.Whiteship;
import com.heeeun.designpattern.creational_patterns.abstractfactory.before.WhiteAnchor;
import com.heeeun.designpattern.creational_patterns.abstractfactory.before.WhiteWheel;

public class WhiteshipFactory extends DefaultShipFactory {

    private ShipPartsFactory shipPartsFactory;

    public WhiteshipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        Ship ship = new Whiteship();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }
}
