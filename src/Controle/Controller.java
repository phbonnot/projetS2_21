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
import modele.Link;
import vue.DecorDeBase;
import vue.VueLink;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    private Link personnage;
    private VueLink vuePersonnage;

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
        this.personnage=new Link("Simone");
        this.vuePersonnage=new VueLink(personnage);
        this.pane.getChildren().add(this.vuePersonnage);
    }

    @FXML
    public void deplacement(KeyEvent event){

        switch(event.getCode()){
            case RIGHT:this.personnage.setX(this.personnage.getX()+5);
                break;
            case LEFT :this.personnage.setX(this.personnage.getX()-5);
                break;
            case UP :this.personnage.setY(this.personnage.getY()-5);
                break;
            case DOWN :this.personnage.setY(this.personnage.getY()+5);
                break;
        }
    }

}
