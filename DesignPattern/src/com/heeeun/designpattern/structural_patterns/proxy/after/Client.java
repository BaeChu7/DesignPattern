package com.heeeun.designpattern.structural_patterns.proxy.after;

public class Client {
// Proxy : 대리인! (마치 사장실을 바로 들어가지 않고 비서를 거치는 것과 같은 모양)
    public static void main(String[] args) {
        // 프록시로 게임 서비스를 생성하는 것으로 대체
        GameService gameService = new GameServiceProxy();
        gameService.startGame();
    }
}
