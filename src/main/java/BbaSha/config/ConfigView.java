package BbaSha.config;

import BbaSha.view.NotFoundView;
import BbaSha.view.View;
import BbaSha.view.login.LoginMenuView;
import BbaSha.view.login.LoginView;
import BbaSha.view.main.MainView;
import BbaSha.view.restaurant.RestaurantBucketView;
import BbaSha.view.restaurant.RestaurantCountView;
import BbaSha.view.restaurant.RestaurantDetailView;
import BbaSha.view.restaurant.RestaurantMenuView;
import lombok.Getter;

@Getter
public enum ConfigView {
    LOGIN_VIEW(LoginView.class.getName(), new LoginView()),
    MAIN_VIEW(MainView.class.getName(), new MainView()),
    LOGIN_MENU_VIEW(LoginMenuView.class.getName(), new LoginMenuView()),
    NOT_FOUND_VIEW(NotFoundView.class.getName(), new NotFoundView()),

    RESTAURANT_DETAIL_VIEW(RestaurantDetailView.class.getName(), new RestaurantDetailView()),
    RESTAURANT_MENU_VIEW(RestaurantMenuView.class.getName(), new RestaurantMenuView()),
    RESTAURANT_COUNT_VIEW(RestaurantCountView.class.getName(), new RestaurantCountView()),
    RESTAURANT_BUCKET_VIEW(RestaurantBucketView.class.getName(), new RestaurantBucketView());

    private final String name;
    private final View view;
    ConfigView(String name, View view) {
        this.name = name;
        this.view = view;
    }
}
