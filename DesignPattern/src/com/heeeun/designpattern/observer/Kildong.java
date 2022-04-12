package com.heeeun.designpattern.observer;

public class Kildong implements Applicants {
    @Override
    public void update(String msg) {
        System.out.println("Kildong 수신 : " + msg);
    };
}