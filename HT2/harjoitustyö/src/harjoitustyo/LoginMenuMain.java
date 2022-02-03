package harjoitustyo;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.fxml.FXMLLoader;


/**
 * @author Kone
 * @version 3.2.2022
 *
 */
public class LoginMenuMain extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            FXMLLoader ldr = new FXMLLoader(getClass().getResource("LoginMenuGUIView.fxml"));
            final Pane root = ldr.load();
            //final LoginMenuGUIController loginmenuCtrl = (LoginMenuGUIController) ldr.getController();
            Scene scene = new Scene(root);
            scene.getStylesheets().add(getClass().getResource("loginmenu.css").toExternalForm());
            primaryStage.setScene(scene);
            primaryStage.setTitle("loginMenu");
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