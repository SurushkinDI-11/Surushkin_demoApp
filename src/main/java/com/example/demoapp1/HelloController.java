package com.example.demoapp1;

import Users.DataUsers;
import Users.User;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URISyntaxException;

public class HelloController {

    public DataUsers users = new DataUsers();
    public TextField loginText;
    public PasswordField passwordText;

    @FXML
    protected void buttonClick() throws URISyntaxException, IOException {
        if(checkInputData()) {
            System.out.println("Добро пожаловать в отряд салага: ");
            Stage menuStage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("newPage.fxml"));
            Scene scene = new Scene(loader.load(), 320, 240);
            menuStage.setTitle("Hello!");
            menuStage.setScene(scene);
            menuStage.show();
        } else {
            System.out.println("Неверные данные");
        }
    }

    private boolean checkInputData() {
        for (int i = 0; i < users.data.size(); i++) {
            if (users.data.get(i).getLogin().equals(loginText.getText())) {
                if(users.data.get(i).getPassword().equals(passwordText.getText())){
                    return true;
                }
            }
        }
        return false;
    }
}
