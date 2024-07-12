package BbaSha.view;

import BbaSha.exception.BbaShaException;
import BbaSha.util.IOUtils;

public class NotFoundView implements View{
    @Override
    public void print() {
        IOUtils.writelnAndFlush("*** 해당 페이지를 찾을 수 없습니다. ***");
    }

    @Override
    public String input() throws BbaShaException {
        return "";
    }
}
