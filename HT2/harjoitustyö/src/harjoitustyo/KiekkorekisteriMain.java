package harjoitustyo;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.fxml.FXMLLoader;


/**
 * @author Kone
 * @version 23.1.2022
 *
 */
public class KiekkorekisteriMain extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            FXMLLoader ldr = new FXMLLoader(getClass().getResource("KiekkorekisteriGUIView.fxml"));
            final Pane root = ldr.load();
            //final KiekkorekisteriGUIController kiekkorekisteriCtrl = (KiekkorekisteriGUIController) ldr.getController();
            Scene scene = new Scene(root);
            scene.getStylesheets().add(getClass().getResource("kiekkorekisteri.css").toExternalForm());
            primaryStage.setScene(scene);
            primaryStage.setTitle("Kiekkorekisteri - temp name");
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