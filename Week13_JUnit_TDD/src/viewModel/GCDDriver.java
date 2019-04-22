package viewModel;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.applet.Applet;

public class GCDDriver extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent rootGroup = FXMLLoader.load(getClass().getResource("interface.fxml"));
        primaryStage.setScene(new Scene(rootGroup));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
