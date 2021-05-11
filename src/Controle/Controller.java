package Controle;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;

import javafx.scene.shape.Circle;

import javafx.scene.shape.Shape;
import vue.DecorDeBase;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {


    private ImageView personnage;

    @FXML
    StackPane fond;

    @FXML
    Pane pane;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        DecorDeBase decor=new DecorDeBase(20,20,"src/images/decorZelda_BG_layer.csv",
                "src/images/decorZelda_sBG_layer.csv", "src/images/decorZelda_O_layer.csv");
        for(int[][] layerTab:decor.getLayers()){
            this.fond.getChildren().add(decor.construirePanel(layerTab,"../images/tilesZelda.png"));
        }
        this.pane.toFront();
        URL imageURL = getClass().getResource("../images/IMG_0298.jpg");
        Image image = new Image(imageURL.toExternalForm());
        this.personnage=new ImageView(image);
        this.personnage.setViewport(new Rectangle2D(100,100,10,10));
        this.pane.getChildren().add(personnage);

    }

    @FXML
    public void deplacement(KeyEvent event){
        switch(event.getCode()){
            case RIGHT: this.personnage.relocate(personnage.getLayoutX()+5,personnage.getLayoutY());
                break;
            case LEFT : this.personnage.relocate(personnage.getLayoutX()-5,personnage.getLayoutY());
                break;
            case UP : this.personnage.relocate(personnage.getLayoutX(),personnage.getLayoutY()-5);
                break;
            case DOWN : this.personnage.relocate(personnage.getLayoutX(),personnage.getLayoutY()+5);
                break;
        }
    }

}
