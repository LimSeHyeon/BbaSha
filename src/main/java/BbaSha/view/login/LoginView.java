package BbaSha.view.login;

import BbaSha.util.IOUtils;
import BbaSha.view.View;

public class LoginView implements View {

    @Override
    public void print() {
        IOUtils.writelnAndFlush("**** 아이디와 비밀번호를 공백 기준으로 순서대로 입력해주세요. ****");
    }
}
