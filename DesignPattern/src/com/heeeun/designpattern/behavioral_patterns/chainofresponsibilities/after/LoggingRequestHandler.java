package com.heeeun.designpattern.behavioral_patterns.chainofresponsibilities.after;

import com.heeeun.designpattern.behavioral_patterns.chainofresponsibilities.before.Request;

public class LoggingRequestHandler extends RequestHandler {

    public LoggingRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println("로깅");
        super.handle(request);
    }
}
