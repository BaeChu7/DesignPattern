package com.heeeun.designpattern.behavioral_patterns.chainofresponsibilities.before;

public class RequestHandler {

    public void handler(Request request) {
        System.out.println(request.getBody());
    }
}
