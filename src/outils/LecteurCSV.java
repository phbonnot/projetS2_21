package outils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class LecteurCSV {

    private int hauteur,largeur;

    public LecteurCSV(int h,int w){
        this.hauteur=h;
        this.largeur=w;
    }

    public int[][] lireCSV(String csv){
        int[][] data=new int[this.hauteur][this.largeur] ;
        StringTokenizer strt;
        int i=0,j=0;
        try {
            BufferedReader br=new BufferedReader(new FileReader(csv));

            String ligneLue="";
            do{
                ligneLue=br.readLine();
                if (ligneLue != null) {
                    strt=new StringTokenizer(ligneLue,",");
                    while(strt.hasMoreTokens()){
                        data[i][j]=Integer.parseInt(strt.nextToken());
                        j++;
                    }
                    j=0;
                    i++;
                }
            }
            while(ligneLue!=null);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }
}
