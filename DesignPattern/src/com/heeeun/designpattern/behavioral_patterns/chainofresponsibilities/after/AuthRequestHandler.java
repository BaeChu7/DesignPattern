package com.heeeun.designpattern.behavioral_patterns.chainofresponsibilities.after;

import com.heeeun.designpattern.behavioral_patterns.chainofresponsibilities.before.Request;

public class AuthRequestHandler extends RequestHandler {

    public AuthRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println("인증이 되었는가?");
        super.handle(request);
    }
}
