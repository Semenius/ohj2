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
public class LuoKiekkoMain extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            FXMLLoader ldr = new FXMLLoader(getClass().getResource("LuoKiekkoGUIView.fxml"));
            final Pane root = ldr.load();
            //final LuoKiekkoGUIController luokiekkoCtrl = (LuoKiekkoGUIController) ldr.getController();
            Scene scene = new Scene(root);
            scene.getStylesheets().add(getClass().getResource("luokiekko.css").toExternalForm());
            primaryStage.setScene(scene);
            primaryStage.setTitle("luoKiekko");
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