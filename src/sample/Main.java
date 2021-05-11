package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import outils.Parametres;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        BorderPane root = FXMLLoader.load(getClass().getResource("../vue/sample.fxml"));
        primaryStage.setTitle("World of Zelda");
        primaryStage.setScene(new Scene(root, Parametres.scene_width,Parametres.scene_height));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
