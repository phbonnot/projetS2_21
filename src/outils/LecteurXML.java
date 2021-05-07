package outils;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import sun.awt.X11.XSystemTrayPeer;

import java.io.File;
import java.io.IOException;

public class LecteurXML {

    int[][] mapTab;
    public LecteurXML() {
    }

    public Document lireXML(String fichier){
        SAXBuilder sax=new SAXBuilder();
        Document doc=null;
        try{
            doc=sax.build(new File(fichier));
            Element root=doc.getRootElement();
            int width=0,height=0;
            for(Element elt:root.getChildren()){
                if(elt.getName().equals("layer")) {
                    width = elt.getAttribute("width").getIntValue();
                    height = elt.getAttribute("height").getIntValue();
                    this.mapTab=new int[height][width];
                    for(Element child:elt.getChildren()) {
                        if (child.getName().equals("data")) {
                            String texte = child.getText();
                            for (int i = 0; i < height; i++) {
                                for (int j = 0; j < width; j++) {
                                    //this.mapTab[i][j] = Integer.parseInt(texte.split(",")[i * width + j]);
                                    System.out.println(texte.split(",")[i * width + j].length());
                                }
                            }
                           // afficherTableau(texte.split(","));
                        }
                    }
                    afficherTableau2D(this.mapTab);
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        } catch (JDOMException e) {
            e.printStackTrace();
        }
    return doc;
    }

    public static void afficherTableau(String[] str){
        for(String s:str){
            System.out.print(s);
            if(s.equals("\n")) System.out.println();
        }
    }

    public static void afficherTableau2D(int[][] str){
        for(int i=0;i<str.length;i++){
            for(int j=0;j<str[i].length;j++){
                System.out.println(str[i][j]);
            }
        }
    }

    public int[][] getMapTab(){
        return this.mapTab;
    }
}
