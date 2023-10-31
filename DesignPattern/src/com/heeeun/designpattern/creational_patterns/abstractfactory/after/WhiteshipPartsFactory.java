package com.heeeun.designpattern.creational_patterns.abstractfactory.after;

import com.heeeun.designpattern.creational_patterns.abstractfactory.before.WhiteAnchor;
import com.heeeun.designpattern.creational_patterns.abstractfactory.before.WhiteWheel;

public class WhiteshipPartsFactory implements ShipPartsFactory {

    @Override
    public Anchor createAnchor() {
        return new WhiteAnchor();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheel();
    }
}
