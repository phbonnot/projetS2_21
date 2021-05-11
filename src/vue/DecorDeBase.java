package vue;

import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.TilePane;
import javafx.scene.shape.Rectangle;
import outils.LecteurCSV;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

public class DecorDeBase {

    final int dimTuiles=16;
    private final int largeurTileSet=25,hauteurTileSet=14;
    private ArrayList<int[][]> layers;
    //int[][] BGTab,SBGTab,OBJTab;
    LecteurCSV lecteur;

    public DecorDeBase(int h,int w,String BG,String SBG, String o){
        this.layers=new ArrayList<>();
        this.lecteur=new LecteurCSV(20,20);
        this.layers.add(lecteur.lireCSV(BG));
        this.layers.add(lecteur.lireCSV(SBG));
        this.layers.add(lecteur.lireCSV(o));
    }

    public ArrayList<int[][]> getLayers(){
        return this.layers;
    }

    //st représente l'adresse du tileSet
    public TilePane construirePanel(int[][] tab, String st) {
            TilePane pane = new TilePane();
            pane.setMinSize(320,320);
            pane.setMaxSize(320,320);
            URL imageURL = getClass().getResource(st);
            Image image = new Image(imageURL.toExternalForm());
            ImageView imageView;
            Rectangle2D viewport;
            for (int i = 0; i < tab.length; i++) {
                for (int j = 0; j < tab[i].length; j++) {
                    imageView = new ImageView(image);
                    viewport = new Rectangle2D(tab[i][j] % this.largeurTileSet * this.dimTuiles,
                            tab[i][j] / this.largeurTileSet * this.dimTuiles,
                            this.dimTuiles, this.dimTuiles);
                    imageView.setViewport(viewport);
                    pane.getChildren().add(imageView);
                }
            }
        return pane;
    }


}
