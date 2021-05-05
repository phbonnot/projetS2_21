package outils;



import org.jdom2.Document;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import java.io.File;
import java.io.IOException;

public class LecteurXML {

    public LecteurXML() {
    }

    public Document lireXML(File fichier){
        SAXBuilder sax=new SAXBuilder();
        Document doc=null;
        try{
            doc=sax.build(fichier);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JDOMException e) {
            e.printStackTrace();
        }
    return doc;
    }
}
