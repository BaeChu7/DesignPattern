package com.heeeun.GoF.DesignPattern.singleton;

public class Settings {
    // 쓰레드 세이프한 환경을 만드는 법

    // 1. 이른 초기화
    // 인스턴스를 만들어 놓고 안 쓸 수 있음
    // private static final Settings INSTANCE = new Settings();

    // private Settings() {

    // }

    // public static Settings getInstanace() {
    // return INSTANCE;
    // }

    // // 2. synchronized : 동시에 호출하더라도 한번만 실행하게 됌
    // private static Settings instance;

    // private Settings() {

    // }

    // // 단점 : 성능 부하
    // public static synchronized Settings getInstanace() {
    // if (instance == null) {
    // instance = new Settings();
    // }

    // return instance;
    // }

    // // 3.double checked locking
    // private static volatile Settings instance;

    // private Settings() {

    // }

    // // 여러 쓰레드가 동시에 if 문 안에 들어오는 경우
    // // 일반 synchronized 보다 실제로 쓰레드가 동시에 접근했을 때만 lock 걸 수 있다
    // public static Settings getInstanace() {
    // if (instance == null) {
    // synchronized (Settings.class) {
    // if (instance == null) {
    // instance = new Settings();
    // }
    // }
    // }

    // return instance;
    // }

    // 4. static inner 클래스 사용하기
    private Settings() {

    }

    private static class SettingsHolder {
        private static final Settings INSTANCE = new Settings();
    }

    // 여러 쓰레드가 동시에 if 문 안에 들어오는 경우
    // 일반 synchronized 보다 실제로 쓰레드가 동시에 접근했을 때만 lock 걸 수 있다
    public static Settings getInstanace() {
        return SettingsHolder.INSTANCE;
    }
}