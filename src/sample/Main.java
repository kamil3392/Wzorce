package sample;

import dao.JDBCTrainingDAO;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {


    public static void main(String[] args) {
        JDBCTrainingDAO connect =new JDBCTrainingDAO();
        connect.getConnection();
        connect.select();
        connect.closeConnection();
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Plan treningowy 2");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
