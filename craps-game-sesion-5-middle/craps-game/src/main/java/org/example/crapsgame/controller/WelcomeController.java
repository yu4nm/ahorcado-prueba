package org.example.crapsgame.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import org.example.crapsgame.model.Player;
import org.example.crapsgame.view.GameStage;
import org.example.crapsgame.view.WelcomeStage;

import java.io.IOException;

public class WelcomeController {
    @FXML
    private TextField nicknameTextField;

    @FXML
    void onHandleButtonPlay(ActionEvent event) throws IOException {
        String nickname = nicknameTextField.getText();

        Player player = new Player(1, nickname);
        GameStage.getInstance().getGameController().setPlayer(player);
        WelcomeStage.deleteInstance();
    }

}
