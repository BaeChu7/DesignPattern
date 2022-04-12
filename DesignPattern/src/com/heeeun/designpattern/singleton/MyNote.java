package com.heeeun.designpattern.singleton;

public class MyNote {
    // 싱글톤 객체를 static 변수로 선언 (메모리 할당)
    private static MyNote instance;
    private String msg;

    // 외부에서 생성자 호출 막기
    private MyNote(String msg) {
        this.msg = msg;
    }

    // 인스턴스를 전달
    public static MyNote getInstance(String msg) {
        if (instance == null) {
            instance = new MyNote(msg);
        }
        return instance;
    }

    public void printMsg() {
        System.out.println(msg);
    }
}