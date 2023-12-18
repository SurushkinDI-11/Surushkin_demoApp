package com.example.demoapp1;

import Users.DataUsers;
import Users.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Regist {
    public TextField reLog;
    public TextField regPas;


    public void regLog(ActionEvent actionEvent) throws IOException {
        DataUsers.addUser(reLog.getText(), regPas.getText());

        Stage menuStage = new Stage();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("newPage.fxml"));
        Scene scene = new Scene(loader.load(), 650, 800);
        menuStage.setTitle("Hello!");
        menuStage.setScene(scene);
        menuStage.show();
        reLog.getScene().getWindow().hide();
    }
}
