package com.heeeun.designpattern.observer;

public class Karam implements Applicants {
    @Override
    public void update(String msg) {
        System.out.println("Karam 수신 : " + msg);
    };
}