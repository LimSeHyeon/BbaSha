package BbaSha.config;

import BbaSha.view.NotFoundView;
import BbaSha.view.View;
import BbaSha.view.login.LoginMenuView;
import BbaSha.view.login.LoginView;
import BbaSha.view.main.MainView;
import lombok.Getter;

@Getter
public enum ConfigView {
    LOGIN_VIEW(LoginView.class.getName(), new LoginView()),
    MAIN_VIEW(MainView.class.getName(), new MainView()),
    LOGIN_MENU_VIEW(LoginMenuView.class.getName(), new LoginMenuView()),
    NOT_FOUND_VIEW(NotFoundView.class.getName(), new NotFoundView());

    private final String name;
    private final View view;
    ConfigView(String name, View view) {
        this.name = name;
        this.view = view;
    }
}
