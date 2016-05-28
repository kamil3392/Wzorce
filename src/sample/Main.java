package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Box;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("Drawing Text");
        Group root = new Group();
        Scene scene = new Scene(root, 500, 300 , Color.WHITE);
        int red = 30;
        int green = 40;
        int blue = 50;

        Text text = new Text(250, 20, "Menu");
        text.setWrappingWidth(200);
        text.setTextAlignment(TextAlignment.CENTER);
        Box box = new Box();



        text.setFill(Color.rgb(red, green, blue, .999));
        root.getChildren().add(text);


        primaryStage.setScene(scene);
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
