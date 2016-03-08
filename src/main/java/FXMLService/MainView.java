package FXMLService;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainView extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        try {
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("ContactManager.fxml"));
            primaryStage.setTitle("Hello World");
            primaryStage.setScene(new Scene(root));
            primaryStage.show();
        }catch (IOException ex) {
            ex.printStackTrace();
        }

    }


    public static void main(String[] args) {
        launch(args);
    }
}
