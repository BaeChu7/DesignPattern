package com.heeeun.designpattern.decorator.decorator2.before;

public class App {
    public static void main(String[] args) {
        Client client = new Client(new SpamFilteringCommentService());
        Client client2 = new Client(null);
        client.writeComment("오징어게임");
        client.writeComment("보는게 하는거 보다 재밌을 수가 없지...");
        client.writeComment("http://whiteship.me");

        
        client2.writeComment("오징어게임");
        client2.writeComment("보는게 하는거 보다 재밌을 수가 없지...");
        client2.writeComment("http://whiteship.me");
    }
}
