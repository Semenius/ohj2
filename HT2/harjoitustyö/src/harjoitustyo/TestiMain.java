package harjoitustyo;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.fxml.FXMLLoader;


/**
 * @author Kone
 * @version 4.2.2022
 *
 */
public class TestiMain extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            FXMLLoader ldr = new FXMLLoader(getClass().getResource("TestiGUIView.fxml"));
            final Pane root = ldr.load();
            //final TestiGUIController testiCtrl = (TestiGUIController) ldr.getController();
            Scene scene = new Scene(root);
            scene.getStylesheets().add(getClass().getResource("testi.css").toExternalForm());
            primaryStage.setScene(scene);
            primaryStage.setTitle("testi");
            primaryStage.show();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @param args Ei käytössä
     */
    public static void main(String[] args) {
        launch(args);
    }
}