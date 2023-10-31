package com.heeeun.designpattern.behavioral_patterns.chainofresponsibilities.after;

import com.heeeun.designpattern.behavioral_patterns.chainofresponsibilities.before.Request;

public class PrintRequestHandler extends RequestHandler {

    public PrintRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        System.out.println(request.getBody());
        super.handle(request);
    }
}
