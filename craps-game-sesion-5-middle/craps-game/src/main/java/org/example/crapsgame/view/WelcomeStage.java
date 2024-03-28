package org.example.crapsgame.view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class WelcomeStage extends Stage {

    public WelcomeStage () throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(
                "/org/example/crapsgame/welcome-view.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        setTitle("Juego de Craps");
        getIcons().add(
                new Image(
                String.valueOf(getClass().getResource("/org/example/crapsgame/images/favicon.png"))));
        setResizable(false);
        setScene(scene);
        show();
    }

    public static WelcomeStage getInstance() throws IOException{
        return WelcomeStageHolder.INSTANCE = new WelcomeStage();
    }

    public static void deleteInstance() {
        WelcomeStageHolder.INSTANCE.close();
        WelcomeStageHolder.INSTANCE = null;
    }

    private static class WelcomeStageHolder {
        private static WelcomeStage INSTANCE;
    }
}
