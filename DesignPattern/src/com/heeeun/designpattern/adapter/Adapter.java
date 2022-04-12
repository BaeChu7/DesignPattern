package com.heeeun.designpattern.adapter;

public class Adapter implements Volt110 {
    private Volt220 volt220;

    public Adapter(Volt220 volt220) {
        this.volt220 = volt220;
    }

    @Override
    public String getName() {
        return volt220.getName();
    }

    @Override
    public void powerOn() {
        System.out.println(this.getName() + " powered on!(220V converted to 110V)");
    }
}