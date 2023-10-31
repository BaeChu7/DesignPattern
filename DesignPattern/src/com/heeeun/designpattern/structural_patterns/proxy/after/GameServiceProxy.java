package com.heeeun.designpattern.structural_patterns.proxy.after;

public class GameServiceProxy implements GameService {

    private GameService gameService;

    // 부가적인 일은 Proxy가 대신 해준다.
    // Proxy 가 대신 DefaultGameService 를 불러들여 글자를 호출할 수 있다.
    @Override
    public void startGame() {
        long before = System.currentTimeMillis();
        if (this.gameService == null) {
            this.gameService = new DefaultGameService();
        }

        gameService.startGame();
        System.out.println(System.currentTimeMillis() - before);
    }
}
