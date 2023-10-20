package com.heeeun.designpattern.decorator;

/*
 * 예를 들어, 문자열을 넣는데 상속을 사용하여 '...'을 없애고 싶은 클래스를 생성한다 하면,
 * TrimmingCommentService 생성한다.
 * 그런데, '...' 말고도 http 를 없애고 싶으면 SpamFilteringCommentService 를 생성한다.
 * 그럼, '...' 랑 'http' 둘 다 없애고 싶으면? SpamFilterAndTrimmingCommentService 를 만들어야 하나?
 * 이것을 해결하기 위해 Decorator 패턴을 적용.
 */
public class BaseComponent implements Component{
    @Override
    public String add(){
        return "espresso";
    }
}