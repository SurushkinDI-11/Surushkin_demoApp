package com.example.demoapp1;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class NewPage implements Initializable {
    public TextField notesText;
    private ObservableList<String> notes= FXCollections.observableArrayList();
    public Label nameLabel;
    public ListView<String> notesList;


    public void delete(ActionEvent actionEvent) {

        notes.remove(notesList.getSelectionModel().getSelectedIndex());
    }

    public void add(ActionEvent actionEvent) {
        if (!notesText.getText().isEmpty()){
            notes.add(notesText.getText());
            notesList.setItems(notes);
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        nameLabel.setText(HelloController.UserName);
    }
}
