package BbaSha.view.bucket;

import BbaSha.util.IOUtils;
import BbaSha.view.View;

public class BucketView implements View {
    @Override
    public void print() {
        IOUtils.writelnAndFlush("**********");
        IOUtils.writelnAndFlush("* 1. 주문 하기    *");
        IOUtils.writelnAndFlush("* 2. 주문 빼기    *");
        IOUtils.writelnAndFlush("**********");
    }
}
