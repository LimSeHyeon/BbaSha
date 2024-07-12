package BbaSha.config;

import BbaSha.controller.MainController;
import BbaSha.controller.MainControllerImpl;
import BbaSha.controller.user.UserController;
import BbaSha.controller.user.UserControllerImpl;
import BbaSha.exception.BbaShaException;
import BbaSha.view.View;

import static BbaSha.config.ConfigView.*;

public class Dispatcher {

    private static final UserController userController = new UserControllerImpl();
    private static final MainController mainController = new MainControllerImpl();

    private static final ViewResolver viewResolver = new ViewResolver();

    private static final Dispatcher dispatcher = new Dispatcher();

    public static Dispatcher of() {
        return dispatcher;
    }

    private Dispatcher() {}

    // View와 Controller를 매핑 및 함수 호출
    public View dispatch(View view, String input) {
        String className = view.getClass().getName();
        String[] parsedInputs = input.split(" ");

        String viewName = "";

        if(className.equals(NOT_FOUND_VIEW.getName())) {
            viewName = MAIN_VIEW.getName();
            return viewResolver.resolve(viewName);
        }

        if(className.equals(MAIN_VIEW.getName())) {
            if(parsedInputs[0].equals("1")) {
                viewName = LOGIN_MENU_VIEW.getName();
            }

            return viewResolver.resolve(viewName);
        }

        if(className.equals(LOGIN_VIEW.getName())) {
            if(parsedInputs[0].equals("1")) {
                viewName = LOGIN_VIEW.getName();
            }
            return viewResolver.resolve(viewName);
        }

        if(className.equals(LOGIN_MENU_VIEW.getName())) {
            if(parsedInputs[0].equals("1")) {
                viewName = LOGIN_MENU_VIEW.getName();
            } else if(parsedInputs[0].equals("2")) {
                if(validateInput(parsedInputs, 3)) {
                    viewName = userController.login(parsedInputs[1], parsedInputs[2]);
                    return viewResolver.resolve(viewName);
                }
                throw new BbaShaException("입력값 갯수가 일치하지 않습니다.");
            }
            return viewResolver.resolve(viewName);
        }

        if(className.equals())
        return viewResolver.resolve(viewName);
    }

    private boolean validateInput(String[] actual, int expectedSize) {
        return actual.length == expectedSize;
    }

}
