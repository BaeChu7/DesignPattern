package com.heeeun.designpattern.structural_patterns.decorator.decorator2.after;

public class TrimmingCommentDecorator extends Decorator {

    public TrimmingCommentDecorator(Component component) {
        super(component); // super : 자식 클래스가 자신을 생성할 때 부모 클래스의 생성자를 불러 초기화 할때 사용 (Decorator 생성)
    }

    @Override
    public void addComment(String comment) {
            super.addComment(trim(comment));
    }

    private String trim(String comment) {
        return comment.replace("...", "");
    }
}