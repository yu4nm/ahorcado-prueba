package org.example.crapsgame.model;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Dice {
    private ImageView diceImage;
    private int numDice;

    public Dice (){
        String PATH = "/org/example/crapsgame/images/dices/";
        this.numDice = (int)(Math.random() * 6) + 1;
        this.diceImage =
                new ImageView(
                        new Image(String.valueOf(getClass().getResource(PATH + "dice" + numDice + ".png"))                               )
                );
        this.diceImage.setFitWidth(32);
        this.diceImage.setFitHeight(32);
    }
    public ImageView getDiceImage() {
        return diceImage;
    }

    public int getNumDice() {
        return numDice;
    }
}
