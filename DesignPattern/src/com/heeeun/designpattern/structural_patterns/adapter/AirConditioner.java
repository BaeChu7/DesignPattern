package com.heeeun.designpattern.structural_patterns.adapter;

public class AirConditioner implements Volt220 {
    @Override
    public void powerOn() {
        System.out.println("Air Conditioner Powered on!");
    }

    @Override
    public String getName() {
        return "Air Conditioner";
    }
}
