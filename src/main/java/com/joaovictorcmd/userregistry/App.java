package main.java.com.joaovictorcmd.userregistry;

import main.java.com.joaovictorcmd.userregistry.controller.UserController;
import main.java.com.joaovictorcmd.userregistry.view.UserView;

public class App {
    public static void main(String[] args) {
        UserView userView = new UserView();
        new UserController(userView);
    }
}