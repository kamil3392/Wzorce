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
    public Button newTraining, statisticsTraining;

    @FXML
    private AnchorPane content;

    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        Button btn = (Button) event.getSource();
        String id = btn.getId();
        Parent newParent;

        if (id == "newTraining") {
            newParent = FXMLLoader.load(getClass().getResource("newTraining.fxml"));
        } else {
            newParent = FXMLLoader.load(getClass().getResource("statisticsTraining.fxml"));
        }

        Scene newTrainingScene = new Scene(newParent);
        Stage appStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        appStage.setScene(newTrainingScene);
        appStage.show();

    }

}
