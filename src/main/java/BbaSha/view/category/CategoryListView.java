package BbaSha.view.category;

import BbaSha.util.IOUtils;
import BbaSha.view.View;

public class CategoryListView implements View {

    @Override
    public void print(){
        IOUtils.writelnAndFlush("=======================");
        IOUtils.writelnAndFlush("= 1. 한식            =");
        IOUtils.writelnAndFlush("= 2. 중식           =");
        IOUtils.writelnAndFlush("= 3. 일식           =");
        IOUtils.writelnAndFlush("= 4. 양식           =");
        IOUtils.writelnAndFlush("=======================");

    }



}
