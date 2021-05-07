package Controle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.geometry.Rectangle2D;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;
import javafx.scene.shape.Rectangle;
import outils.LecteurXML;
import vue.DecorDeBase;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    @FXML
    TilePane decor;

    @FXML
    Pane fond;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.fond.setFocusTraversable(true);
        DecorDeBase decor1=new DecorDeBase();
        ImageView vueDecor = decor1.chargeImage("../images/StaticTiles.png");
        this.decor.getChildren().add(vueDecor);

    }
}
