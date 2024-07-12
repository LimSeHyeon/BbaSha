package BbaSha.view.category;

import BbaSha.model.entity.restaurant.Restaurant;
import BbaSha.util.IOUtils;
import BbaSha.view.View;

public class JapaneseFoodView implements View {
    private final Restaurant[] restaurants = new Restaurant[3];
    @Override
    public void of(Object... objects) {
        int i =0;
        for(Object obj: objects) {
            restaurants[i] = (Restaurant) obj;
            i++;
        }
    }

    @Override
    public void print() {
        IOUtils.writelnAndFlush("=======================");
        IOUtils.writelnAndFlush("= "+restaurants[0]+"            =");
        IOUtils.writelnAndFlush("= "+restaurants[1]+"            =");
        IOUtils.writelnAndFlush("= "+restaurants[2]+"            =");
        IOUtils.writelnAndFlush("=======================");
    }
}
