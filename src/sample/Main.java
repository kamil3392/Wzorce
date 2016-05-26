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
        //launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("wersja 6");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

}
