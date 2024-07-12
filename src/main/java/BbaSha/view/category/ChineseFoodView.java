package BbaSha.view.category;

import BbaSha.model.entity.category.Category;
import BbaSha.model.entity.restaurant.Restaurant;
import BbaSha.util.IOUtils;
import BbaSha.view.View;

public class ChineseFoodView implements View {

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
        IOUtils.writelnAndFlush("= 1. "+restaurants[0]+"            =");
        IOUtils.writelnAndFlush("= 2. "+restaurants[1]+"            =");
        IOUtils.writelnAndFlush("= 3. "+restaurants[2]+"            =");
        IOUtils.writelnAndFlush("=======================");
    }
}
