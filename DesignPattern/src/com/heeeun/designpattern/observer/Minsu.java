package com.heeeun.designpattern.observer;

public class Minsu implements Applicants {
    @Override
    public void update(String msg) {
        System.out.println("Minsu 수신 : " + msg);
    };
}