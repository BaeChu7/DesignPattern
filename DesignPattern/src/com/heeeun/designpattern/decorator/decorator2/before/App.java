package com.heeeun.designpattern.decorator.decorator2.before;

public class App {
    public static void main(String[] args) {
        // Client client = new Client(new SpamFilteringCommentService());
         Client client = new Client(new TrimmingCommentService());
        // Client client = new Client(null);

        // 만약 spam filter 도 하고 싶고, trimming 도 하고 싶다면 또 클래스를 만들어야 하나?

        client.writeComment("오징어게임");
        client.writeComment("보는게 하는거 보다 재밌을 수가 없지...");
        client.writeComment("http://whiteship.me");
    }
}
