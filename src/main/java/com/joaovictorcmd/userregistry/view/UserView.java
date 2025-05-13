package view;

import javax.swing.*;
import java.awt.*;

public class UserView extends JFrame {

    private final JTextField nameField;
    private final JTextField lastNameField;
    private final JTextField phoneField;
    private final JTextField emailField;
    private final JButton registerButton;
    private final JButton listButton;

    public UserView() {
        super("User Registry");

        nameField = new JTextField(20);
        lastNameField = new JTextField(20);
        phoneField = new JTextField(20);
        emailField = new JTextField(20);

        registerButton = new JButton("Cadastrar");
        listButton = new JButton("Ver Usuários");

        JPanel panel = new JPanel(new GridLayout(5, 1, 10,10));

        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        panel.add(new JLabel("Nome:"));
        panel.add(nameField);

        panel.add(new JLabel("Sobrenome:"));
        panel.add(lastNameField);

        panel.add(new JLabel("Telefone:"));
        panel.add(phoneField);

        panel.add(new JLabel("Email:"));
        panel.add(emailField);

        panel.add(registerButton);
        panel.add(listButton);

        setContentPane(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public String getName() {
        return nameField.getText();
    }

    public String getLastName() {
        return lastNameField.getText();
    }

    public String getPhone() {
        return phoneField.getText();
    }

    public String getEmail() {
        return emailField.getText();
    }

    public JButton getRegisterButton() {
        return registerButton;
    }

    public JButton getListButton() {
        return listButton;
    }
}
