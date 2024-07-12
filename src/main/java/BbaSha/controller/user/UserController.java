package BbaSha.controller.user;

public interface UserController {
    String login(String userId, String password);
    String signup(String name, String userId, String password);
}
