package modele;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

public class Link {

    private String nom;
    private IntegerProperty XProperty, YProperty;

    public Link(String n){
        this.nom=n;
        this.XProperty=new SimpleIntegerProperty(0);
        this.YProperty=new SimpleIntegerProperty(0);
    }

    public String getName(){
        return this.nom;
    }

    public void setX(int x){
        this.XProperty.set(x);
    }

    public void setY(int y){
        this.YProperty.set(y);
    }

    public IntegerProperty getXProperty(){
        return this.XProperty;
    }

    public IntegerProperty getYProperty(){
        return this.YProperty;
    }

    public int getX(){
        return this.XProperty.get();
    }

    public int getY(){
        return this.YProperty.get();
    }
}
