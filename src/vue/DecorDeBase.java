package vue;

import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class DecorDeBase {


    public DecorDeBase(){

    }

    public ImageView chargeImage(String st){
        URL imageURL = getClass().getResource(st);
        Image image = new Image(imageURL.toExternalForm());
        ImageView imageView = new ImageView(image);
        Rectangle2D viewport = new Rectangle2D(0, 0, 90, 80);
        imageView.setViewport(viewport);
        return imageView;
    }

}
