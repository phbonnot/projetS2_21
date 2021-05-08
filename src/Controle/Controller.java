package Controle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.geometry.Rectangle2D;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.shape.Rectangle;
import outils.LecteurCSV;
import outils.LecteurXML;
import vue.DecorDeBase;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {


    @FXML
    StackPane fond;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        this.fond.setFocusTraversable(true);
        DecorDeBase decor=new DecorDeBase(20,20,"src/images/decorZelda_BG_layer.csv",
                "src/images/decorZelda_sBG_layer.csv", "src/images/decorZelda_O_layer.csv");
        for(int[][] layerTab:decor.getLayers()){
            this.fond.getChildren().add(decor.construirePanel(layerTab,"../images/tilesZelda.png"));
        }

    }
}
