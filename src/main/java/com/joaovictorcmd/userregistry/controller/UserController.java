package controller;

import model.domain.User;
import model.service.UserService;
import view.UserView;

import javax.swing.*;
import java.util.List;
import java.util.stream.Collectors;

public class UserController {
    private final UserService service;
    private final UserView view;

    public UserController(UserView view) {
        this.view = view;
        this.service = new UserService();

        this.view.getRegisterButton().addActionListener(e -> register());
        this.view.getListButton().addActionListener(e -> listUsers());
    }

    private void register() {
        String name = view.getName();
        String lastName = view.getLastName();
        Long phone = Long.parseLong(view.getPhone());
        String email = view.getEmail();

        if (name.isEmpty() || lastName.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(view, "Preencha todos os campos!");
            return;
        }

        if (service.register(name, lastName, phone, email)) {
            JOptionPane.showMessageDialog(view, "Usuário cadastrado com sucesso!");
        } else {
            JOptionPane.showMessageDialog(view, "E-mail já cadastrado!");
        }
    }

    private void listUsers() {
        List<User> users = service.listUsers();

        if (users.isEmpty()) {
            JOptionPane.showMessageDialog(view, "Nenhum usuário cadastrado.");
            return;
        }

        String list = users.stream()
                .map(user -> user.getName() + " - " + user.getEmail())
                .collect(Collectors.joining("\n"));

        String message = "Usuários cadastrados:\n\n" + list;

        JOptionPane.showMessageDialog(view, message);
    }

}
