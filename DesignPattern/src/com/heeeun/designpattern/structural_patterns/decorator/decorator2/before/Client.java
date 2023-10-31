package com.heeeun.designpattern.structural_patterns.decorator.decorator2.before;

public class Client {
    private CommentService commentService;

    public Client(CommentService commentService) {
        this.commentService = commentService;
    }

    public void writeComment(String comment) {
        if (commentService != null)
            commentService.addComment(comment);
        else
            System.out.println(comment);
    }
}
