package com.heeeun.designpattern.behavioral_patterns.observer;

public class Kildong implements Applicants {
    @Override
    public void update(String msg) {
        System.out.println("Kildong 수신 : " + msg);
    };
}