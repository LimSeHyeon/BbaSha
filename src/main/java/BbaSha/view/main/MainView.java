package BbaSha.view.main;


import BbaSha.view.View;

import static BbaSha.util.IOUtils.writelnAndFlush;

public class MainView implements View {

    @Override
    public void print() {
        writelnAndFlush("*** 서비스 켜지는 중 ***");
        writelnAndFlush("*** 1. 로그인 창 가기 ***");
    }
}
