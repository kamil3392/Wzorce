package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller {

    @FXML
    public Button home, history, statistics, addExercise;
    @FXML
    private AnchorPane content;

    Parent root;


    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        Button btn = (Button) event.getSource();
        String id = btn.getId();

        System.out.println(id);

        if (id.equals("addExercise")) {
            root = FXMLLoader.load(getClass().getResource("addExercise.fxml"));
        }else if(id.equals("home")){
            root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        }else if(id.equals("history")){
            root = FXMLLoader.load(getClass().getResource("history.fxml"));
        }else{
            root = FXMLLoader.load(getClass().getResource("statistics.fxml"));
        }

        Stage primaryStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

}