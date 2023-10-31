package com.heeeun.designpattern.structural_patterns.decorator.decorator2.after;

import com.heeeun.designpattern.structural_patterns.decorator.decorator2.before.CommentService;
import com.heeeun.designpattern.structural_patterns.decorator.decorator2.before.TrimmingCommentService;

public class App {
    private static boolean enabledSpamFilter = false;
    private static boolean enabledTrimming = true;

    public static void main(String[] args) {
        Component commentService = new BaseComponent();

        if (enabledSpamFilter) {
            commentService = new SpamFilteringCommentDecorator(commentService);
        }

        if (enabledTrimming) {
            commentService = new TrimmingCommentDecorator(commentService);
        }

        Client client = new Client(commentService);
        client.writeComment("오징어게임");
        client.writeComment("보는게 하는거 보다 재밌을 수가 없지...");
        client.writeComment("http://whiteship.me");
    }
}
