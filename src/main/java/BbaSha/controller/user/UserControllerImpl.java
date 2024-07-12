package BbaSha.controller.user;

import static BbaSha.config.ConfigView.MAIN_VIEW;

public class  UserControllerImpl implements UserController{

    @Override
    public String login(String userId, String password) {
        return MAIN_VIEW.getName();
    }

    @Override
    public String signup(String name, String userId, String password) {
        return MAIN_VIEW.getName();
    }
}
