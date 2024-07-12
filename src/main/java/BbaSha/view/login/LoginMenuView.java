package BbaSha.view.login;


import BbaSha.util.IOUtils;
import BbaSha.view.View;

public class LoginMenuView implements View {

    @Override
    public void print() {
        IOUtils.writelnAndFlush("***********************");
        IOUtils.writelnAndFlush("* 1. 로그인            *");
        IOUtils.writelnAndFlush("* 2. 회원가입           *");
        IOUtils.writelnAndFlush("***********************");
    }

}
