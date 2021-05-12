package vue;

import javafx.geometry.Rectangle2D;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import modele.Link;

import java.net.URL;

public class VueLink extends ImageView{

    private URL imageURL;
    private Link link;
    private Image representation;

    public VueLink(Link l){
        this.imageURL= getClass().getResource("../images/IMG_0298.jpg");
        this.link=l;
        this.representation=new Image(imageURL.toExternalForm());
        this.setImage(representation);
        this.setViewport(new Rectangle2D(100,100,10,10));
        this.translateXProperty().bind(this.link.getXProperty());
        this.translateYProperty().bind(this.link.getYProperty());
    }

}
