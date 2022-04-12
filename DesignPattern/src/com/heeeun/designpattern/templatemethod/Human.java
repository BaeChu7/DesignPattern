package com.heeeun.designpattern.templatemethod;

abstract class Human { // 추상 클래스
    public void Alive() {
        Walk();
        Talk();
        Sleep();
    }

    public void Walk() {
        System.out.println("Walking...");
    }

    public void Talk() {
        System.out.println("Talking...");
    }

    abstract void Sleep(); // 추상 메서드
}
